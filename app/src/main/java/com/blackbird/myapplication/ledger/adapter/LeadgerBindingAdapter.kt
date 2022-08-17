package com.blackbird.myapplication.ledger.adapter

import androidx.appcompat.widget.AppCompatTextView
import androidx.databinding.BindingAdapter


@BindingAdapter("setDoubleValue")
fun AppCompatTextView.setDoubleValue(value:Double){
    text = value.toString()
}