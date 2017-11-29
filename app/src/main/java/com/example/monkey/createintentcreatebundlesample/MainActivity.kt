package com.example.monkey.createintentcreatebundlesample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivityButton.setOnClickListener {
            val intent = SubActivity.createIntent(this, getTextFromEditText())
            startActivity(intent)
        }

        startFragmentButton.setOnClickListener {
            val fragment = SubFragment.createFragment(getTextFromEditText())
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.container, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }

    private fun getTextFromEditText(): String{
        return editText.text.toString()
    }
}
