package com.example.calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate = buttonCalculate
        var resultText = resultText

        btnCalculate.setOnClickListener{

            val note1 = Integer.parseInt(note1.text.toString())
            val note2 = Integer.parseInt(note2.text.toString())
            val average = (note1 + note2) / 2
            val faults = Integer.parseInt(faults.text.toString())

            if(average >= 6 && faults <= 10) {
                resultText.setText("O Aluno Foi Aprovado!! \n Nota Final: ${ average } \n Faltas: ${ faults }")
                resultText.setTextColor(Color.GREEN)
            } else {
                resultText.setText("O Aluno Foi Reprovado!! \n Nota Final: ${ average } \n Faltas: ${ faults }")
                resultText.setTextColor(Color.RED)
            }
        }
    }
}