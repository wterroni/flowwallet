package com.example.flowwallet.core.navigation

object Routes {
    const val Dashboard: String = "dashboard"
    const val TransactionsList: String = "transactions/list"

    const val TransactionDetailBase: String = "transactions/detail"
    const val TransactionIdArg: String = "transactionId"
    const val TransactionDetail: String = "$TransactionDetailBase/{$TransactionIdArg}"

    const val Settings: String = "settings"
}
