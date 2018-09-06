package com.llanosmunoz.orangebankct.presenter

import com.llanosmunoz.orangebankct.error.ErrorHandler


/**
 * TransactionsPresenter.
 */
class TransactionsPresenter(view: TransactionsPresenter.View, errorHandler: ErrorHandler) :
        Presenter<TransactionsPresenter.View>(view = view, errorHandler = errorHandler) {

    override fun initialize() {
        // Nothing to do yet
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

    }
}