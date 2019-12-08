package com.ardakazanci.weatherapp.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class ForecastListAdapter(val items:List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){

    // Görünümlerin gösterilmesi için ViewHolder oluşturucu.
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }


    // Recyclerview içerisinde gösterilecek verilerin adedi.
    override fun getItemCount(): Int  = items.size



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    
    // ViewHolder : Recyclerview içerisinde görüntülenecek view elemanları
    class ViewHolder (val textView : TextView) : RecyclerView.ViewHolder(textView)


}