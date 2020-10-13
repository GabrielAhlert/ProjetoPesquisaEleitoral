package com.example.projetopesquisaeleitoral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val r = intent.getSerializableExtra("Resultado") as Resultado
        textViewPorcentagemC1.text = r.pc1.toString()
        textViewPorcentagemC2.text = r.pc2.toString()
        textViewPorcentagemC3.text = r.pc3.toString()

        progressBarCandidato1.progress = r.pc1
        progressBarCandidato2.progress = r.pc2
        progressBarCandidato3.progress = r.pc3
    }
}