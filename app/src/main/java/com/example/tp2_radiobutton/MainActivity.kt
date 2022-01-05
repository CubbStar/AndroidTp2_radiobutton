package com.example.tp2_radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var button: Button
        button = findViewById(R.id.boutonCouleur)

        lateinit var group: RadioGroup
        group = findViewById(R.id.GroupeR)

        button.setOnClickListener{
            var id: Int = group.checkedRadioButtonId
            if (id!=1){
                val radio:RadioButton = findViewById(id)
                Toast.makeText(applicationContext, "${radio.text}", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(applicationContext, "Aucune couleur n'est séléctionnée", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun radio_button_click(view: View) {}
}