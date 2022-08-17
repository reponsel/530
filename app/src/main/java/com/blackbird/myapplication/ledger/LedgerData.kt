package com.blackbird.myapplication.ledger

data class LedgerData(
    val id : Long,
    val name : String,
    val value : Double,
    val date : String,
    val dateOfEntry : String
)