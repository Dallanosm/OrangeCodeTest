package com.llanosmunoz.orangebankct.view.adapter

import android.view.View
import com.llanosmunoz.domain.constants.Constants
import com.llanosmunoz.orangebankct.R
import com.llanosmunoz.orangebankct.extension.hideMe
import com.llanosmunoz.orangebankct.extension.showMe
import com.llanosmunoz.orangebankct.models.TransactionView
import kotlinx.android.synthetic.main.item_transaction.view.*

/**
 * TransactionsAdapter.
 */
class TransactionsAdapter(onItemClickListener: (TransactionView) -> Unit)
    : RootAdapter<TransactionView>(onItemClickListener = onItemClickListener) {

    override val itemLayoutId: Int = R.layout.item_transaction

    override fun viewHolder(view: View): RootViewHolder<TransactionView> = TransactionsViewHolder(view)

    class TransactionsViewHolder(itemView: View) : RootViewHolder<TransactionView>(itemView) {
        override fun bind(model: TransactionView) {
            itemView.transactionId.text = model.id
            itemView.transactionDate.text = model.date
            itemView.transactionAmount.text = model.amount
            itemView.transactionFee.text = model.fee

            if (model.description != Constants.EMPTY_STRING) {
                itemView.transactionDescription.showMe()
                itemView.transactionDescription.text = model.description
            }else{
                itemView.transactionDescription.hideMe()
            }
        }
    }
}