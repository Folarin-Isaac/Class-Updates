package com.example.classupdates.api

/**
 * created by Isaac Folarin
 */


 sealed class Result<out T> {
     data class Success<out T>(val data: T) : Result<T>()
    data class Error(
        val isNetworkError: Boolean,
        val errorCode: Int?,
        val errorMessage: String?
    )

}