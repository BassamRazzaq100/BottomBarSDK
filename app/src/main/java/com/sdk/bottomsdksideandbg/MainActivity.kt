package com.sdk.bottomsdksideandbg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sdk.bottomsdksideandbg.databinding.ActivityMainBinding
import com.sdk.bottomsdksideandbg.viewPager.FragmentAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        val viewPagerAdapter = FragmentAdapter(this)

        viewPagerAdapter.createFragment(1)
        viewPagerAdapter.createFragment(2)
        viewPagerAdapter.createFragment(0)

        binding.fragmentLayout.adapter = viewPagerAdapter
        binding.fragmentLayout.isUserInputEnabled = false
        binding.bottomBar.setOnItemSelectedListener { position ->
            when(position) {
                0 -> binding.fragmentLayout.currentItem = 0
                1 -> binding.fragmentLayout.currentItem = 1
                2 -> binding.fragmentLayout.currentItem = 2
            }
        }
    }


}