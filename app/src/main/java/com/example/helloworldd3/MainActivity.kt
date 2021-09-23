package com.example.helloworldd3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var aa=""
        val screen=findViewById<ConstraintLayout>(R.id.a)
        val button0 = findViewById<Button>(R.id.red)
        val button1 = findViewById<Button>(R.id.green)
        val button2 = findViewById<Button>(R.id.blue)
        val button3 = findViewById<Button>(R.id.black)

        button0.setOnClickListener {(screen.setBackgroundResource(R.color.red))}
        button1.setOnClickListener {(screen.setBackgroundResource(R.color.green))}
        button2.setOnClickListener {(screen.setBackgroundResource(R.color.blue))}
        button3.setOnClickListener {(screen.setBackgroundResource(R.color.black))}


    }
    private fun hextoint (hex:String): Int {

        var i = hex.length - 1
        var decimalN: Long = 0
        var base = 1
        while (i >= 0) {
            val charAtPos = hex[i]
            val lastDigit = if ((charAtPos >= '0') && (charAtPos <= '9')) {
                charAtPos - '0'
            } else if ((charAtPos >= 'A') && (charAtPos <= 'F')) {
                charAtPos.code - 55
            } else if ((charAtPos >= 'a') && (charAtPos <= 'f')) {
                charAtPos.code - 87
            } else {
                0
            }
            decimalN += lastDigit * base
            base *= 16
            i--
        }
        return decimalN.toInt()
    }
}