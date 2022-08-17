package com.blackbird.myapplication.ledger.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import com.blackbird.myapplication.databinding.FragmentLedgerBinding
import com.blackbird.myapplication.ledger.LedgerData
import com.blackbird.myapplication.ledger.adapter.LedgerAdapter

class Ledger : Fragment() {

    private  val viewModel: LedgerViewModel by viewModels<LedgerViewModel>()
    private lateinit var binding: FragmentLedgerBinding
    private var ledgerAdapter : LedgerAdapter? = null
    private val ledgerList = mutableListOf<LedgerData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLedgerBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (ledgerList.size > 0) {
            showRecycleView()
            ledgerAdapter = LedgerAdapter()
            ledgerAdapter?.setData(ledgerList)
            binding.ledgerRecycleView.adapter = ledgerAdapter
        }else{
            showRecycleView(false)
        }
    }
    private fun showRecycleView(isVisible:Boolean = true){
        binding.ledgerRecycleView.isVisible = isVisible
        binding.noItem.isVisible = !isVisible
    }

}