package com.example.monkey.createintentcreatebundlesample

import android.content.ContentValues.TAG
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_sub.*

/**
 * Created by monkey on 2017/11/29.
 */
class SubFragment: Fragment() {
    private var showText = ""
    private val TAG = "SubFragment"

    companion object {
        fun createFragment(text: String): Fragment {
            val fragment = SubFragment()

            val bundle = Bundle()
            bundle.putString("showText", text)
            fragment.setArguments(bundle)

            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bundle = getArguments()
        this.showText = bundle.getString("showText")
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater!!.inflate(R.layout.fragment_sub, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "showText is ${this.showText}")
        textViewSubFragment.text = "Submitted Text is ${this.showText}"
    }

}
