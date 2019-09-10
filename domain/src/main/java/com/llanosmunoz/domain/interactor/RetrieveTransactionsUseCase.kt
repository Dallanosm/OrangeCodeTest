package com.llanosmunoz.domain.interactor

import com.llanosmunoz.domain.executor.Executor
import com.llanosmunoz.domain.models.Transaction
import com.llanosmunoz.domain.repository.TransactionsRepository
import io.reactivex.Single

/**
 * RetrieveTransactionsUseCase.
 */
class RetrieveTransactionsUseCase(private val repository: TransactionsRepository, executor: Executor) :
        SingleInteractor<List<Transaction>>(executor = executor) {

    override fun buildSingle(): Single<List<Transaction>> = repository.retrieveTransactions()

}