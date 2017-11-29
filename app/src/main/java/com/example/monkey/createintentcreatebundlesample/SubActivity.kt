package com.example.monkey.createintentcreatebundlesample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_sub.*

/**
 * Created by monkey on 2017/11/29.
 */
class SubActivity: AppCompatActivity() {
    private val TAG = "SubActivity"

    companion object {
        fun createIntent(context: Context, text: String): Intent {
            val intent = Intent(context, SubActivity::class.java)
            intent.putExtra("showText", text)

            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val intent = intent
        val showText = intent.getStringExtra("showText")
        textViewSubActivity.text = "Submitted Text is $showText"
    }
}