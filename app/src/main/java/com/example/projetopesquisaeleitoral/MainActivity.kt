package com.example.projetopesquisaeleitoral

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = Random()

        fun rand(from: Int, to: Int) : Int {
            return random.nextInt(to - from) + from // from(incluso) e to(excluso)
        }

        fun click(){
            if(tbShowResults.isChecked){
                val v1 = rand(0,100)
                val v2 = rand(0,-v1+100)
                val v3 = 100-v1-v2-1

                //Toast.makeText(this,v1.toString()+"  "+v2.toString()+"  "+v3.toString(),Toast.LENGTH_LONG).show()

                val r = Resultado(v1,v2,v3)
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("Resultado",r)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Escolha guardada!", Toast.LENGTH_LONG).show()
            }
        }

        textViewCandidato1.setOnClickListener(){
            click()
        }

        textViewCandidato2.setOnClickListener(){
            click()
        }
        
        textViewCandidato3.setOnClickListener(){
            click()
        }
    }
}