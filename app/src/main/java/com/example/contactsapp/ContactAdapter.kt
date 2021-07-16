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
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(var contactList: List<Contact>,var context: Context):RecyclerView.Adapter<ContactsViewHolder>(){
//lateinit var cdContact:CardViewf
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_items, parent, false)
        return ContactsViewHolder(itemView)
}
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.tvname.text=currentContact.name
        holder.tvphone.text=currentContact.phoneNumber
        holder.tvemail.text=currentContact.email
        Picasso.get()
            .load(currentContact.imageUrl)
            .centerCrop()
//           .placeholder(R.drawable.placeholder)
            .resize(80,80)
            .into(holder.imCintact)
        holder.cdContact.setOnClickListener{
  var intent=Intent(context,Contacts::class.java)
            intent.putExtra("name",currentContact.name)
            intent.putExtra("phone",currentContact.phoneNumber)
            intent.putExtra("email",currentContact.email)
            intent.putExtra("image",currentContact.imageUrl)
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
    var tvname=itemView.findViewById<TextView>(R.id.tvname)
    var tvphone=itemView.findViewById<TextView>(R.id.tvphone)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var imCintact=itemView.findViewById<ImageView>(R.id.imageView)
 var cdContact=itemView.findViewById<CardView>(R.id.cdContact)

}