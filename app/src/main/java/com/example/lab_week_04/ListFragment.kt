package com.example.labweek04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.affogato).setOnClickListener {
            openDetail("AFFOGATO", "Espresso poured on a vanilla ice cream")
        }

        view.findViewById<View>(R.id.americano).setOnClickListener {
            openDetail("AMERICANO", "Espresso with added hot water")
        }

        view.findViewById<View>(R.id.latte).setOnClickListener {
            openDetail("LATTE", "Espresso with steamed milk")
        }
    }

    private fun openDetail(title: String, desc: String) {
        val fragment = DetailFragment()
        val bundle = Bundle()
        bundle.putString("title", title)
        bundle.putString("desc", desc)
        fragment.arguments = bundle

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
