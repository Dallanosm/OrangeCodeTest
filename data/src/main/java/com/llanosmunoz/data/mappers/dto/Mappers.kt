package com.llanosmunoz.data.mappers.dto

import com.llanosmunoz.data.extensions.toDate
import com.llanosmunoz.data.model.dto.TransactionsDto
import com.llanosmunoz.domain.constants.Constants.Companion.DATE_API_FORMAT
import com.llanosmunoz.domain.models.Transaction

/**
 * Mappers.
 */
fun TransactionsDto.toModel(): Transaction = Transaction(
        id = id,
        date = date.toDate(DATE_API_FORMAT),
        amount = amount,
        fee = fee,
        description = description)
