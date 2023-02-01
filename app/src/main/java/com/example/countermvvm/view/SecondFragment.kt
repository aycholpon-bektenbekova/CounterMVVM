package com.example.countermvvm.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.countermvvm.databinding.FragmentSecondBinding
import com.example.countermvvm.viewmodel.CounterViewModel

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private lateinit var viewModel: CounterViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[CounterViewModel::class.java]
        return binding.root
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.mCounter.observe(this){
            binding.tvCount.text = it.toString()
        }
    }

}