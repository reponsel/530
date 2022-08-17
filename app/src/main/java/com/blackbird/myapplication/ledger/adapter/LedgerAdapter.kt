package com.blackbird.myapplication.ledger.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blackbird.myapplication.databinding.LedgerAdapaterItemBinding
import com.blackbird.myapplication.ledger.LedgerData

class LedgerAdapter : RecyclerView.Adapter<LedgerHolder>(){

    private val ledgerList:MutableList<LedgerData> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LedgerHolder {
        val inflater = LayoutInflater.from(parent.context)
        return LedgerHolder(LedgerAdapaterItemBinding.inflate(inflater,parent,false))
    }

    override fun onBindViewHolder(holder: LedgerHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return ledgerList.size
    }

    fun setData(list:List<LedgerData>){
        ledgerList.clear()
        ledgerList.addAll(list)
        notifyDataSetChanged()
    }

}
class LedgerHolder(itemView: LedgerAdapaterItemBinding) : RecyclerView.ViewHolder(itemView.root) {
    val binding = itemView

}