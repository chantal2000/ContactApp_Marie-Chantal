package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class Contacts : AppCompatActivity() {
    lateinit var tvName3:TextView
    lateinit var tvPhone:TextView
    lateinit var tvEmail2:TextView
    lateinit var imgContact: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        var name=intent.getStringExtra("name")
        var phone=intent.getStringExtra("phone")
        var email=intent.getStringExtra("email")
        var image=intent.getStringExtra("image").toString()
        val tvName3= findViewById<TextView>(R.id.tvName2)
        tvName3.text=name
        val tvPhone =findViewById<TextView>(R.id.tvPhone2)
        tvPhone.text=phone
       val tvEmail2= findViewById<TextView>(R.id.tvEmail2)
        tvEmail2.text=email
//        val tvMessage= findViewById<TextView>(R.id.tvMessage)
//        tvMessage.text=image
        val imgContact = findViewById<ImageView>(R.id.imageView2)
        Picasso.get().load(image).into(imgContact)


    }
}