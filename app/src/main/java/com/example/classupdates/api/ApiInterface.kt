package com.example.classupdates.api

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiInterface {

    @FormUrlEncoded
    @POST("auth/signup")
   suspend fun signUp(
      @Field("matric_no") matric_no: String,
      @Field("password") password : String,
      @Field("firstname") firstname : String,
      @Field("lastname") lastname : String,
      @Field("phone") phone: String,
      @Field("department") department : String,
      @Field("username") username: String
    ): Any
}