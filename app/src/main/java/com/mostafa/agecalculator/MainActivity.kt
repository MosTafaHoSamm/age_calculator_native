package com.mostafa.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {


            try {
                val birth: Int = editTextNumber.text.toString().toInt()
                val age: Int = Calendar.getInstance().get(Calendar.YEAR) - birth
                textView.text = age.toString()
                println("Done Done ")
            } catch (e: NumberFormatException) {
                println("Error : $e")


            }


        }

    }
}