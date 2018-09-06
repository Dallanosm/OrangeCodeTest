package com.llanosmunoz.orangebankct.view.activity

import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import com.llanosmunoz.orangebankct.R
import com.llanosmunoz.orangebankct.models.TransactionView
import com.llanosmunoz.orangebankct.presenter.TransactionsPresenter
import com.llanosmunoz.orangebankct.view.adapter.TransactionsAdapter
import kotlinx.android.synthetic.main.activity_transactions.*

/**
 * TransactionsActivity.
 */
class TransactionsActivity : RootActivity<TransactionsPresenter.View>(), TransactionsPresenter.View {

    override val progress: View by lazy { progressView }

    override val presenter: TransactionsPresenter by instance()

    override val layoutResourceId: Int = R.layout.activity_transactions

    override val activityModule: Kodein.Module = Kodein.Module {
        bind<TransactionsPresenter>() with provider {
            TransactionsPresenter(
                    retrieveTransactionsUseCase = instance(),
                    view = this@TransactionsActivity,
                    errorHandler = instance())
        }
    }

    private val transactionAdapter = TransactionsAdapter {}

    override fun initializeUI() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        transactions.layoutManager = layoutManager
        transactions.adapter = transactionAdapter
    }

    override fun registerListeners() {
        // Nothing to do yet
    }

    override fun showTransactions(transactions: List<TransactionView>) {
        val last = transactions.first()
        lastTransactionId.text = last.id
        lastTransactionDate.text = last.date
        lastTransactionDescription.text = last.description
        lastTransactionAmount.text = last.amount
        lastTransactionFee.text = last.fee
        transactionAdapter.addAll(transactions.subList(1, transactions.size).toMutableList())
    }

}