package com.example.countermvvm.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.countermvvm.databinding.FragmentThirdBinding
import com.example.countermvvm.viewmodel.CounterViewModel

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: CounterViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("FragmentLiveDataObserve")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[CounterViewModel::class.java]
        viewModel.history.observe(this){
            binding.tvHistory.text = it.toString()
        }
    }
}