

package com.example.attendance2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val studentLoginButton: Button = findViewById(R.id.btn_student_login)


        studentLoginButton.setOnClickListener {

            val intent = Intent(this,studentLoginButton::class.java)


            startActivity(intent)

        }


    }
}