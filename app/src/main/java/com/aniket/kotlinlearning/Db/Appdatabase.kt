package com.aniket.kotlinlearning.Db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aniket.kotlinlearning.Webservice.AttendanceDao
import com.aniket.kotlinlearning.model.ShowAllTag


@Database(entities = [ShowAllTag::class], version = 1)
abstract class Appdatabase : RoomDatabase() {
    abstract fun attendanceDao(): AttendanceDao
}
