package com.example.twins.places

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*


class sign_in : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        signup_clk.setOnClickListener {
            val signup_form = Intent(this,sign_up::class.java)
            startActivity(signup_form)
        }
    }
}
