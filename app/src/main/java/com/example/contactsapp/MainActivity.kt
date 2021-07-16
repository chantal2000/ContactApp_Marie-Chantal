package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContacts()
    }
    fun displayContacts(){
        var contactsList= listOf(
            Contact("Chantal","+27777777","nniyonkuru@gmail.xom","https://images.pexels.com/photos/8343725/pexels-photo-8343725.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Marie","+27777777","nniyonkuru@gmail.xom","https://images.pexels.com/photos/5166869/pexels-photo-5166869.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Emma","+27777777","nniyonkuru@gmail.xom","https://images.pexels.com/photos/8526965/pexels-photo-8526965.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
            Contact("Jeanne","+27777777","nniyonkuru@gmail.xom","https://images.pexels.com/photos/5818680/pexels-photo-5818680.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")
            )
        rvContacts=findViewById(R.id.rvContacts)
   var contactsAdapter=ContactAdapter(contactsList,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactsAdapter
    }
}