package com.example.intentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main3Activity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main3)
    val txtParcelable = findViewById<TextView>(R.id.txtParcelable)

    val email=intent.getParcelableExtra<Email>("email")

    txtParcelable.text= email.toString();
  }
}
