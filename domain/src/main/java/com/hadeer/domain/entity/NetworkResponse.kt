package com.hadeer.domain.entity

import java.io.IOException

sealed interface NetworkResponse <out T : Any>{
    data class Success<T : Any>(val data : T) : NetworkResponse<T>

    data class ApiError(val body : String, val code : Int) : NetworkResponse<Nothing>

    data class NetworkError(val error : IOException) : NetworkResponse<Nothing>

    data class UnknownError(val error : Throwable) : NetworkResponse<Nothing>
}