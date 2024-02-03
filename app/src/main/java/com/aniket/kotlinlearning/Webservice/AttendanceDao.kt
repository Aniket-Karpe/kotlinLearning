package com.aniket.kotlinlearning.Webservice

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aniket.kotlinlearning.model.ShowAllTag

@Dao
interface AttendanceDao {
    @Query("SELECT * FROM AttendanceResponse")
    suspend fun getAllAttendance(): List<ShowAllTag>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
  fun insertAll(attendance: List<ShowAllTag>)
}
