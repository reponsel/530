package com.blackbird.myapplication.ledger.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.blackbird.myapplication.databinding.FragmentLedgerBinding

class Ledger : Fragment() {

    private  val viewModel: LedgerViewModel by viewModels<LedgerViewModel>()
    private lateinit var binding: FragmentLedgerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLedgerBinding.inflate(inflater,container,false)
        return binding.root
    }

}