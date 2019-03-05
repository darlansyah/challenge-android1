package com.example.a123140060.binaracademyyk

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_register.*

class MainRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_register)

        setUp()
    }

    private fun setUp() {
        botton_add_register.setOnClickListener {
            val fullName = text_fullName.text.toString() // ini dari id layout register
            val addressEmail = text_email.text.toString()
            val university = text_university.text.toString()
            val pass1 = text_pass1.text.toString()
            val pass2 = text_pass2.text.toString()

            if (pass1 == pass2){
                register(fullName,addressEmail,university,pass1,pass2)
            }
            else{
                Toast.makeText(this,"register gagal",Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun register(
        fullName: String,
        addressEmail: String,
        university: String,
        pass1: String,
        pass2: String
    ) {
        val myRfer = getSharedPreferences("myRfer", Context.MODE_PRIVATE)
        val editor = myRfer.edit()
        editor.putString("name",fullName)
        editor.putString("email",addressEmail)
        editor.putString("university",university)
        editor.putString("pass1",pass1)
        editor.putString("passw",pass2)

        editor.apply()

        Toast.makeText(this,"seve register",Toast.LENGTH_SHORT).show()
        val intent = Intent(this@MainRegister,MainActivity::class.java)
        startActivity(intent)
    }
}
