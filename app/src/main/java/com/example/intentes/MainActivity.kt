package com.example.intentes

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val btnParcelable= findViewById<Button>(R.id.btnParcelable)
    val edtPara= findViewById<EditText>(R.id.edtPara)
    val edtAssunto= findViewById<EditText>(R.id.edtAssunto)
    val btn02= findViewById<Button>(R.id.btn02)
    val edtMsg= findViewById<EditText>(R.id.edtMsg)
    val btn01= findViewById<Button>(R.id.btn01)


    btnParcelable.setOnClickListener(View.OnClickListener {
      var email =Email(edtPara.text.toString(),edtAssunto.text.toString(),edtMsg.text.toString())
      val intent= Intent(this,Main3Activity::class.java)
      intent.putExtra("email",email)
      startActivity(intent)
    })


    btn02.setOnClickListener(View.OnClickListener {
      val intent = Intent(this,Main2Activity::class.java)
      intent.putExtra("para", edtPara.text.toString())
      intent.putExtra("assunto", edtAssunto.text.toString())
      intent.putExtra("msg", edtMsg.text.toString())
      startActivity(intent)

    })


    btn01.setOnClickListener(View.OnClickListener {
      sendMail(edtPara,edtMsg, edtAssunto)
    })
  }

  fun sendMail(edtPara: EditText, edtMsg:EditText,edtAssunto:EditText){
    val intent = Intent(Intent.ACTION_SENDTO).apply {
      data = Uri.parse("mailto:")
      putExtra(Intent.EXTRA_EMAIL, edtPara.text.toString())
      putExtra(Intent.EXTRA_SUBJECT, edtAssunto.text.toString())
      putExtra(Intent.EXTRA_TEXT, edtMsg.text.toString())
    }
    if(intent.resolveActivity(packageManager)!=null){
      startActivity(intent)
    }
  }
}
