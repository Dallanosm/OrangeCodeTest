package com.llanosmunoz.data.datasources.network

import com.llanosmunoz.domain.models.Transaction
import io.reactivex.Single

/**
 * NetworkDataSource.
 */
interface NetworkDataSource {
    fun retrieveTransactions(): Single<List<Transaction>>
}