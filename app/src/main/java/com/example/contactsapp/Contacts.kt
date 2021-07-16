package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Contacts : AppCompatActivity() {
    lateinit var tvName3:TextView
    lateinit var tvPhone:TextView
    lateinit var tvEmail2:TextView
    lateinit var tvMessage:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        var name=intent.getStringExtra("Name")
        var phone=intent.getStringExtra("phone")
        var email=intent.getStringExtra("email")
        var image=intent.getStringExtra("imageUrl")
        tvName3.findViewById<TextView>(R.id.tvName2)
        tvName3.text=name
        tvPhone.findViewById<TextView>(R.id.tvPhone2)
        tvPhone.text=phone
        tvEmail2.findViewById<TextView>(R.id.tvEmail2)
        tvEmail2.text=email
        tvMessage.findViewById<TextView>(R.id.tvMessage)
        tvMessage.text=image

    }
}