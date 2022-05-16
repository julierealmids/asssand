package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI: Button
    lateinit var btnSendM_Money: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBMI = findViewById(R.id.btnBMI)
        btnBMI.setOnClickListener {
            val intent = Intent(this, BMI_Calculator::class.java)
            startActivity(intent)
        }
        btnSendM_Money = findViewById(R.id.btnSendMoney)

        btnSendM_Money.setOnClickListener {
            val intent = Intent (this,M_Money::class.java )
            startActivity(intent)
        }

    }
}