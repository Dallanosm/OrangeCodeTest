package com.llanosmunoz.data.datasources.network

import com.llanosmunoz.data.mappers.dto.toModel
import com.llanosmunoz.domain.models.Transaction
import io.reactivex.Single

/**
 * OrangeBankNetworkDataSource.
 */
class OrangeBankNetworkDataSource(private val apiService: ApiService) : NetworkDataSource {

    override fun retrieveTransactions(): Single<List<Transaction>> =
            apiService.retrieveTransactions()
                    .map { transactions ->
                        transactions.map {
                            it.toModel()
                        }
                    }


}