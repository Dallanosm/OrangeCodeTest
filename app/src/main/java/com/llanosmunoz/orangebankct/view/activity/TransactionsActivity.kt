package com.llanosmunoz.orangebankct.view.activity

import android.view.View
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import com.llanosmunoz.orangebankct.R
import com.llanosmunoz.orangebankct.presenter.TransactionsPresenter
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
            TransactionsPresenter(view = this@TransactionsActivity,
                    errorHandler = instance())
        }
    }

    override fun initializeUI() {
        // Nothing to do yet
    }

    override fun registerListeners() {
        // Nothing to do yet
    }


}