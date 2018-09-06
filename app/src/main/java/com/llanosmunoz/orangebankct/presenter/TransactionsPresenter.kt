package com.llanosmunoz.orangebankct.presenter

import com.llanosmunoz.domain.interactor.RetrieveTransactionsUseCase
import com.llanosmunoz.domain.models.Transaction
import com.llanosmunoz.orangebankct.error.ErrorHandler


/**
 * TransactionsPresenter.
 */
class TransactionsPresenter(private val retrieveTransactionsUseCase: RetrieveTransactionsUseCase, view: TransactionsPresenter.View, errorHandler: ErrorHandler) :
        Presenter<TransactionsPresenter.View>(view = view, errorHandler = errorHandler) {

    override fun initialize() {
        view.showProgress()
        retrieveTransactionsUseCase.execute(
                onSuccess = { view.showTransactions(it); view.hideProgress() },
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
        // Nothing to do yet
    }

    interface View : Presenter.View {
        fun showTransactions(transactions: List<Transaction>)
    }
}