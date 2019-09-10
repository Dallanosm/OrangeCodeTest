package com.llanosmunoz.data.mappers.dto

import com.llanosmunoz.data.extensions.toDate
import com.llanosmunoz.data.model.dto.TransactionsDto
import com.llanosmunoz.domain.constants.Constants.Companion.DATE_API_FORMAT
import com.llanosmunoz.domain.constants.Constants.Companion.DEFAULT_DOUBLE
import com.llanosmunoz.domain.constants.Constants.Companion.EMPTY_STRING
import com.llanosmunoz.domain.models.Transaction

/**
 * Mappers.
 */
fun TransactionsDto.toModel(): Transaction = Transaction(
        id = id,
        date = date.toDate(DATE_API_FORMAT),
        amount = amount ?: DEFAULT_DOUBLE,
        fee = fee ?: DEFAULT_DOUBLE,
        description = description ?: EMPTY_STRING)
