package com.llanosmunoz.domain.models

import java.util.*

/**
 * Transaction.
 */
data class Transaction(
        val id: Int,
        val date: Date?,
        val amount: Double,
        val fee: Double,
        val description: String)