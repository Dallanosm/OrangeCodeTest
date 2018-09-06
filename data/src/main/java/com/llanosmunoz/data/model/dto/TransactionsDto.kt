package com.llanosmunoz.data.model.dto

import com.google.gson.annotations.SerializedName


/**
 * TransactionsDto.
 */

data class TransactionsDto(
        @SerializedName("id") var id: Int,
        @SerializedName("date") var date: String,
        @SerializedName("amount") var amount: Double?,
        @SerializedName("fee") var fee: Double?,
        @SerializedName("description") var description: String?
)