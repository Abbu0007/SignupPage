package com.example.collegetask

import android.app.ActionBar
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText





class CollegeTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_college_task)

        val txtView: TextView = findViewById(R.id.txtView)
        val txtView2: TextView = findViewById(R.id.txtView2)
        val txtView3: TextView = findViewById(R.id.txtView3)

        // Initialize TextInputEditTexts
        val txtFirst: TextInputEditText = findViewById(R.id.txtFirst)
        val txtLast: TextInputEditText = findViewById(R.id.txtLast)
        val txtEmail: TextInputEditText = findViewById(R.id.txtEmail)
        val txtPassword: TextInputEditText = findViewById(R.id.txtPassword)

        // Initialize Button
        val btnSignup: Button = findViewById(R.id.btnSignup)

        // Initialize ImageView
        val imgBack: ImageView = findViewById(R.id.imgBack)

        btnSignup.setOnClickListener {
            val firstName = txtFirst.text.toString()
            val lastName = txtLast.text.toString()
            val email = txtEmail.text.toString()
            val password = txtPassword.text.toString()


        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}



