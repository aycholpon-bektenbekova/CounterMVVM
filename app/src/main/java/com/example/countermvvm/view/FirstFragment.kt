package com.example.countermvvm.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.countermvvm.databinding.FragmentFirstBinding
import com.example.countermvvm.viewmodel.CounterViewModel


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: CounterViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this)[CounterViewModel::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.incrementBtn.setOnClickListener {
            viewModel.onIncrementClick()
        }
        binding.decrementBtn.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }

}