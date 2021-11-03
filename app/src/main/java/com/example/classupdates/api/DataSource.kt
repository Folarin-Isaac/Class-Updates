package com.example.classupdates.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataSource {

    companion object {
        private const val BASE_URL = "http://unilagcms.herokuapp.com/api/v1/student/"
    }

    // function to create a retrofit client
    fun <Api> buildApiService(
        api: Class<Api>
    ): Api {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(api)
    }


}