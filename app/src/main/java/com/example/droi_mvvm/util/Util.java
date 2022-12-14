package com.example.droi_mvvm.util;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.droi_mvvm.App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Util extends AppCompatActivity {
    public static String getDateFormatTime(String str) {
        Logger.loge("str  :  "   +  str);
        String time = null;
        SimpleDateFormat ori = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        ori.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat tran = new SimpleDateFormat("yyyy.MM");
        tran.setTimeZone(TimeZone.getDefault());
        try {
            Date oDate = ori.parse(str);
            time = tran.format(oDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    public static void showToast(String str) {
        Toast toast;
        toast = Toast.makeText(App.Companion.getInstance(), str, Toast.LENGTH_SHORT);
//        toast.setGravity(Gravity.TOP | Gravity.CENTER_HORIZONTAL, 0, 200);

//        LinearLayout toastLayout = (LinearLayout) toast.getView();
//        TextView toastTV = (TextView) toastLayout.getChildAt(0);
//        toastTV.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
        try {
            toast.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String myFormatter(Double num) {
        try {
            return String.format(Locale.getDefault(), "%,.1f", num);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String myFormatter_d2(Double num) {
        try {
            return String.format(Locale.getDefault(), "%,.2f", num);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String myFormatter(Float num) {
        try {
            return String.format(Locale.getDefault(), "%,.1f", num);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String myFormatter(int num) {
        try {
            return String.format(Locale.getDefault(), "%,d", num);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

//    public static String myFormatter_round(String num) {
//        try {
//            String str = String.format("%.d",num);
//            Logger.loge("num   :  "+num);
//            return String.format(Locale.getDefault(), "%,d", str);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return "";
//        }
//    }
//    public static String myFormatter(String num) {
//        Logger.loge("num   :  "   +  num);
//        if (num != null && !num.equals("")&& !num.equals("null")) {
//            Long n = new kUtil().stringToLong(num);
//            try {
//                return String.format(Locale.getDefault(), "%,d", n);
//            } catch (Exception e) {
//                e.printStackTrace();
//                return "";
//            }
//        } else {
//            return "";
//        }
//    }

}


