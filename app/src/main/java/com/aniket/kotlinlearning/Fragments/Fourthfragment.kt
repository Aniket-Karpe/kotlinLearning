package com.aniket.kotlinlearning.Fragments
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.Room
import androidx.room.RoomDatabase
import com.aniket.kotlinlearning.Db.Appdatabase
import com.aniket.kotlinlearning.R
import com.aniket.kotlinlearning.Webservice.ApiService
import com.aniket.kotlinlearning.Webservice.AttendanceDao
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class Fourthfragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }

        val retrofit = Retrofit.Builder()
            .baseUrl("https://pcmc.bioenabletech.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(ApiService::class.java)
        val response = apiService.getAttendance("tags", 349)
        val database = Room.databaseBuilder(this, Appdatabase::class.java, "app-database").build()
        database.attendanceDao().insertAll(response)




    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourthfragment, container, false)






    }

}

private fun Room.databaseBuilder(
    context: Fourthfragment,
    klass: Class<Appdatabase>,
    name: String
): RoomDatabase.Builder<Appdatabase> {
    TODO("Not yet implemented")
}
