package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.SpinnerAdapter
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    val imageButton4 = findViewById<ImageButton>(R.id.imageButton4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageButton4.setOnClickListener()
        {
            /////////opcje///////////
            //val opcje = arrayOf(" jest równe "," jest różne od "," jest mniejsze od "," jest mniejsze bądź równe "," jest większe od ","jest większe bądź równe ")


            /////////
            val okno4 = AlertDialog.Builder(this)

            val opcje = arrayOf(
                " jest równe ",
                " jest różne od ",
                " jest mniejsze od ",
                " jest mniejsze bądź równe ",
                " jest większe od ",
                "jest większe bądź równe "
            )
            //val lista = findViewById<Spinner>(R.id.spinner)

            //val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opcje)
            //lista.adapter = adapter
            with(okno4)
            {
                setTitle("Blok decydyzyjny")


            }

        }
    }
}