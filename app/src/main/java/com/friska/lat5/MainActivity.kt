package com.friska.lat5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var editTextCelsius: EditText? = null
    var buttonConvert: Button? = null
    var textViewResult: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextCelsius = findViewById(R.id.editTextCelsius)
        buttonConvert = findViewById(R.id.buttonConvert)
        textViewResult = findViewById(R.id.textViewResult)

        buttonConvert?.setOnClickListener(View.OnClickListener {
            val input = editTextCelsius?.text.toString()
            if (input.isNotEmpty()) {
                val celsius = input.toDouble()

                val fahrenheit = (9.0 / 5.0) * celsius + 32
                val kelvin = celsius + 273.15
                val reamur = (4.0 / 5.0) * celsius

                val result = """
                    Fahrenheit: $fahrenheit
                    Kelvin: $kelvin
                    Reamur: $reamur
                    """.trimIndent()

                textViewResult?.text = result
            } else {
                textViewResult?.text = "Please enter a Celsius value"
            }
        })
    }
}
