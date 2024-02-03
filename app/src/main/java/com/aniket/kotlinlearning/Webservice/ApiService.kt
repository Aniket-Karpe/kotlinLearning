package com.aniket.kotlinlearning.Webservice

import com.aniket.kotlinlearning.model.ShowAllTag
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("attendance.php")
   fun getAttendance(@Query("q") query: String, @Query("orgid") orgId: Int): List<ShowAllTag>
}
