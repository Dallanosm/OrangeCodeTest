package com.llanosmunoz.domain.repository

import com.llanosmunoz.domain.models.Transaction
import io.reactivex.Single

/**
 * Repository.
 */
interface TransactionsRepository {
    fun retrieveTransactions(): Single<List<Transaction>>
}