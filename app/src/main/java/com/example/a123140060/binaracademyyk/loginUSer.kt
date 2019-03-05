package com.example.a123140060.binaracademyyk

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_user.*

class loginUSer : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_user)

        setUplistener()
    }

    private fun setUplistener() {
        bottom2_login.setOnClickListener {
            if (text_Username.text.toString() == "admin" && text_passWord.text.toString() == "admin"){
                val intent = Intent(this@loginUSer,MainRecyclerView::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"login gagal",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
