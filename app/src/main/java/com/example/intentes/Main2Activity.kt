package com.example.intentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main2)
    val para = intent.getStringExtra("para")
    val assunto = intent.getStringExtra("assunto")
    val msg = intent.getStringExtra("msg")

    txtMostra.text = "Mensagem de $para, assunto: $assunto e mensagem = $msg"
  }
}
