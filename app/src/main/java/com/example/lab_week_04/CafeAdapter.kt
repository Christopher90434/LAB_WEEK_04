package com.example.labweek04

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> createDetailFragment("Starbucks Corporation is an American multinational chain of coffeehouses and roastery reserves headquartered in Seattle, Washington. It is the world's largest coffeehouse chain.")
            1 -> createDetailFragment("It is undeniable that Janji Jiwa outlets have spread to various corners. Janji Jiwa is a local coffee brand that is popular among students, students, workers and even families. Carrying the jargon \"coffee from the heart\", Janji Jiwa is committed to serving coffee with a classic taste for coffee lovers.")
            2 -> createDetailFragment("At Kopi Kenangan, their dream is to serve high quality coffee, made with the freshest local ingredients to customers across Indonesia - and the rest of the world!")
            else -> createDetailFragment("Default content")
        }
    }

    private fun createDetailFragment(content: String): Fragment {
        val fragment = CafeDetailFragment()
        val bundle = Bundle()
        bundle.putString("TAB_CONTENT", content)
        fragment.arguments = bundle
        return fragment
    }
}
