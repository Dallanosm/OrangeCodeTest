package com.llanosmunoz.orangebankct.mappers

import com.llanosmunoz.data.extensions.toFormattedString
import com.llanosmunoz.domain.constants.Constants.Companion.DATE_VIEW_FORMAT
import com.llanosmunoz.domain.constants.Constants.Companion.EMPTY_STRING
import com.llanosmunoz.domain.models.Transaction
import com.llanosmunoz.orangebankct.models.TransactionView


/**
 * ViewMappers.
 */
fun Transaction.toView(): TransactionView = TransactionView(
        id = id.toString(),
        date = date?.toFormattedString(DATE_VIEW_FORMAT) ?: EMPTY_STRING,
        amount = "$amount €",
        fee = "$fee €",
        total = "${amount + fee} €",
        totalValue = amount + fee,
        description = description)