package com.sdk.bottomsdksideandbg.viewPager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sdk.bottomsdksideandbg.fragments.FragmentCart
import com.sdk.bottomsdksideandbg.fragments.FragmentDashBoard
import com.sdk.bottomsdksideandbg.fragments.FragmentShop

class FragmentAdapter(context: FragmentActivity): FragmentStateAdapter(context) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0-> return FragmentDashBoard()
            1-> return FragmentShop()
            2-> return FragmentCart()
        }
        return FragmentDashBoard()
    }


}