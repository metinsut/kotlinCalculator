package com.metin.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var result: Int? = null
    var number1: Int? = null
    var number2: Int? = null
    var message = "Result"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mySum(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            message = "Please enter valid numbers...";
        } else {
            result = number1!! + number2!!;
            message = "Result: $result"
        }
        textView.text = message

    }

    fun mySub(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            message = "Please enter valid numbers...";
        } else {
            result = number1!! - number2!!;
            message = "Result: $result"
        }
        textView.text = message
    }

    fun myDiv(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            message = "Please enter valid numbers...";
        } else {
            result = number1!! / number2!!;
            message = "Result: $result"
        }
        textView.text = message
    }

    fun myMultiply(view: View) {
        number1 = editTextNumber.text.toString().toIntOrNull()
        number2 = editTextNumber2.text.toString().toIntOrNull()

        if (number1 == null || number2 == null) {
            message = "Please enter valid numbers...";
        } else {
            result = number1!! * number2!!;
            message = "Result: $result"
        }
        textView.text = message
    }
}