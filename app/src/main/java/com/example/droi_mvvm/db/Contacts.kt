package com.example.droi_mvvm.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "tb_contacts")
data class Contacts(
    @PrimaryKey(autoGenerate = true) val id: Long,
    var name: String,
    var tel: String
)