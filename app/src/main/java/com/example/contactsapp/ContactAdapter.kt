package com.example.contactsapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(var contactList: List<Contact>,var context: Context):RecyclerView.Adapter<ContactsViewHolder>() {
    lateinit var cvContact:CardView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_items, parent, false)
        return ContactsViewHolder(itemView)
}
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvPhoneNum.text=currentContact.phoneNumber
        holder.tvEmail.text=currentContact.email
        Picasso.get()
            .load(currentContact.imageUrl)
            .centerCrop()
//           .placeholder(R.drawable.placeholder)
            .resize(80,80)
            .into(holder.imCintact)

        holder.cvContact.setOnClickListener{
  var intent=Intent(context,Contacts::class.java)
            intent.putExtra("name",currentContact.name)
            context.startActivity(intent)
        }
        holder.imCintact.setOnClickListener{
            Toast.makeText(context,"You have clicked on my image",Toast.LENGTH_LONG).show()
        }
    }
    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactsViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNum=itemView.findViewById<TextView>(R.id.tvPhoneNum)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var imCintact=itemView.findViewById<ImageView>(R.id.imgContact)
var cvContact=itemView.findViewById<CardView>(R.id.cvContact)

}