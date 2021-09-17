package com.example.classupdates

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.io.InvalidObjectException

class TabLayoutAdapter(
    fragmentManager: FragmentManager,
    private val tab1_title: String,
    private val tab2_title: String
) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    /**
     * Return the Fragment associated with a specified position.
     */
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> SignInFragment()
            1 -> SignUpFragment()
            else -> throw InvalidObjectException("Object is invalid")
        }
    }

    /**
     * Return the number of views available.
     */
    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> tab1_title
            1 -> tab2_title
            else -> throw InvalidObjectException("Object is invalid")
        }
    }
}