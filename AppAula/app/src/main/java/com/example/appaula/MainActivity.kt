package com.example.appaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome:EditText = findViewById(R.id.edtNome)
        val edtEndereço:EditText = findViewById(R.id.edtEndereço)
        val edtBairro:EditText = findViewById(R.id.edtBairro)
        val edtCidade:EditText = findViewById(R.id.edtCidade)
        val edtEstado:EditText = findViewById(R.id.edtEstado)
        val edtCep:EditText = findViewById(R.id.edtCep)
        val btnCadastrar:Button = findViewById(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener{
            val toast = Toast.makeText(this, edtNome.text.toString()
                        +"\n" + edtEndereço.text.toString()
                        +"\n" + edtBairro.text.toString()
                        +"\n" + edtCidade.text.toString()
                        +"\n" + edtEstado.text.toString()
                        +"\n" + edtCep.text.toString(), Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}