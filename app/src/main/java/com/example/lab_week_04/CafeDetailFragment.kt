package com.example.labweek04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val TAB_CONTENT = "TAB_CONTENT"

class CafeDetailFragment : Fragment() {
    private var content: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            content = it.getString(TAB_CONTENT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.content_description)
        textView?.text = content ?: "No content available"
    }

    companion object {
        fun newInstance(content: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putString(TAB_CONTENT, content)
            fragment.arguments = args
            return fragment
        }
    }
}
