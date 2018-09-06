package com.llanosmunoz.orangebankct.presenter

import com.llanosmunoz.domain.interactor.RetrieveTransactionsUseCase
import com.llanosmunoz.orangebankct.error.ErrorHandler
import com.llanosmunoz.orangebankct.mappers.toView
import com.llanosmunoz.orangebankct.models.TransactionView


/**
 * TransactionsPresenter.
 */
class TransactionsPresenter(private val retrieveTransactionsUseCase: RetrieveTransactionsUseCase, view: TransactionsPresenter.View, errorHandler: ErrorHandler) :
        Presenter<TransactionsPresenter.View>(view = view, errorHandler = errorHandler) {

    override fun initialize() {
        view.showProgress()
        retrieveTransactionsUseCase.execute(
                onSuccess = { transactions ->
                    if (transactions.isNotEmpty()) {
                        view.showTransactions(transactions
                                .filter { it.date != null }
                                .sortedByDescending { it.date }
                                .distinctBy { it.id }
                                .map { it.toView() })
                    } else {
                        view.showEmptyView()
                    }
                    view.hideProgress()
                },
                onError = onError { view.showError(it); view.hideProgress() }
        )
    }

    override fun resume() {
        // Nothing to do yet
    }

    override fun stop() {
        // Nothing to do yet
    }

    override fun destroy() {
        retrieveTransactionsUseCase.clear()
    }

    interface View : Presenter.View {
        fun showTransactions(transactions: List<TransactionView>)
        fun showEmptyView()
    }
}