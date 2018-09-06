package com.llanosmunoz.data.repository

import com.llanosmunoz.data.datasources.network.NetworkDataSource
import com.llanosmunoz.domain.models.Transaction
import com.llanosmunoz.domain.repository.TransactionsRepository
import io.reactivex.Single

/**
 * OrangeBankCTTransactionsRepository.
 */
class OrangeBankCTTransactionsRepository(private val networkDataSource: NetworkDataSource) : TransactionsRepository {

    override fun retrieveTransactions(): Single<List<Transaction>> = networkDataSource.retrieveTransactions()

}