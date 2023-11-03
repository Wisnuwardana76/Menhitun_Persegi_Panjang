package com.example.menghitungbangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextPanjang: EditText
    private lateinit var editTextLebar: EditText
    private lateinit var buttonHitung: Button
    private lateinit var textViewHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextPanjang = findViewById(R.id.editTextPanjang)
        editTextLebar = findViewById(R.id.editTextLebar)
        buttonHitung = findViewById(R.id.buttonHitung)
        textViewHasil = findViewById(R.id.textViewHasil)

        buttonHitung.setOnClickListener {
            hitungLuasDanKeliling()
        }
    }

    private fun hitungLuasDanKeliling() {
        val panjang = editTextPanjang.text.toString().toDouble()
        val lebar = editTextLebar.text.toString().toDouble()

        val luas = panjang * lebar
        val keliling = 2 * (panjang + lebar)

        textViewHasil.text = "Luas: $luas, Keliling: $keliling"
    }
}