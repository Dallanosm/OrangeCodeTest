package com.llanosmunoz.data.datasources.network

import com.llanosmunoz.data.model.dto.TransactionsDto
import io.reactivex.Single
import retrofit2.http.GET

/**
 * ApiService.
 */
interface ApiService {

    companion object {
        const val END_POINT = "https://api.myjson.com/"
    }

    @GET("bins/1a30k8")
    fun retrieveTransactions(): Single<List<TransactionsDto>>

}