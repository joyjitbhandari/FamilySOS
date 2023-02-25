package com.example.familysos.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.familysos.DataClasses.MemberModel
import com.example.familysos.R

class MemberAdapter(private val listMembers: List<MemberModel>) : RecyclerView.Adapter<MemberAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.item_member,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: MemberAdapter.ViewHolder, position: Int) {
        val item = listMembers[position]

        holder.name.text = item.name
        holder.address.text = item.address
        holder.battery.text = item.battery
        holder.time.text = item.time.toString()
        holder.wifi.text = item.wifi
        holder.view.text = item.view.toString()
    }

    override fun getItemCount(): Int {
        return listMembers.size
    }


    class ViewHolder(private val item: View): RecyclerView.ViewHolder(item) {
        val name = item.findViewById<TextView>(R.id.card_name)
        val address = item.findViewById<TextView>(R.id.card_address)
        val wifi = item.findViewById<TextView>(R.id.card_wifi)
        val time = item.findViewById<TextView>(R.id.card_time)
        val view = item.findViewById<TextView>(R.id.card_view)
        val battery = item.findViewById<TextView>(R.id.card_battery)
    }
}