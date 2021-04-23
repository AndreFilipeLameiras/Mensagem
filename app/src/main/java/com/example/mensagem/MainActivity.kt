package com.example.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(View: View){
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)
        val mensagem = editTextMensagem.text.toString()

        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }

        //todo: Obter a data e hora do sistema

        val intent = Intent(this, MostraMensagemActivity::class.java)
        intent.putExtra(Companion.info_Extra_Mensagem, mensagem)
        startActivity(intent)

        //todo: passar a informaçao da data/hora para a atividade MotraMensagem
    }

    companion object {
        const val info_Extra_Mensagem = "MENSAGEM"
    }
}