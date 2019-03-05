package com.example.a123140060.binaracademyyk

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       setupListener()

}

    private fun setupListener() {
        button_login.setOnClickListener {
            login()
        }
        button_register.setOnClickListener {
            register()
        }
    }

   // ini untuk memanggil function login
    private fun login() {
        val intent = Intent(this@MainActivity,loginUSer::class.java)
        startActivity(intent)
    }
    // ini untuk memaggil function register
    private fun register() {
        val intent = Intent(this@MainActivity,MainRegister::class.java)
        startActivity(intent)
    }

}

//private fun register() {
//    val intent = Intent(this@DashActivity, RegisterActivity::class.java)
//    startActivity(intent)
//}