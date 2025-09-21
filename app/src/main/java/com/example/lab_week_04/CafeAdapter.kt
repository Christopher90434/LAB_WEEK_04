package com.example.labweek04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janji_jiwa_title,
    R.string.kopi_kenangan_title,
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = TABS_FIXED.size

    override fun createFragment(position: Int): Fragment {
        val contentString = when(position) {
            0 -> "Starbucks Corporation is an American multinational chain of coffeehouses and roastery reserves headquartered in Seattle, Washington. It is the world's largest coffeehouse chain."
            1 -> "It is undeniable that Janji Jiwa outlets have spread to various corners. Janji Jiwa is a local coffee brand that is popular among students, students, workers and even families. Carrying the jargon \"coffee from the heart\", Janji Jiwa is committed to serving coffee with a classic taste for coffee lovers."
            2 -> "At Kopi Kenangan, their dream is to serve high quality coffee, made with the freshest local ingredients to customers across Indonesia - and the rest of the world!"
            else -> ""
        }
        return CafeDetailFragment.newInstance(contentString)
    }
}
