package com.example.countermvvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.countermvvm.databinding.ActivityMainBinding
import com.example.countermvvm.view.FirstFragment
import com.example.countermvvm.view.SecondFragment
import com.example.countermvvm.view.ThirdFragment

class MainActivity : FragmentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = FragmentAdapter(this)
        binding.viewPager.adapter = adapter
    }

   inner class FragmentAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
        override fun getItemCount(): Int = 3

        override fun createFragment(position: Int): Fragment {
            val fragment = FirstFragment()
            if (position == 0){
                return fragment
            }
            if (position == 1){
                return SecondFragment()
            }
            if (position == 2){
                return ThirdFragment()
            }
            return fragment
        }
    }
}
