package com.llanosmunoz.orangebankct.models

/**
 * TransactionView.
 */
data class TransactionView(
        val id: String,
        val date: String,
        val amount: String,
        val fee: String,
        val description: String)