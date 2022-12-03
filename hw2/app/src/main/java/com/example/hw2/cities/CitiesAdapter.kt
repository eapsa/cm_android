package com.example.hw2.cities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.hw2.R

class CitiesAdapter : RecyclerView.Adapter<CitiesAdapter.CitiesHolder>() {
    var data =  listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.cities_item_view, parent, false)
        return CitiesHolder(view)
    }

    override fun onBindViewHolder(holder: CitiesHolder, position: Int) {
        val item = data[position]
        holder.city.text = item
        holder.city.setOnClickListener{
                view : View -> view.findNavController().navigate(CitiesFragmentDirections.actionCitiesFragmentToForecastFragment(item))
        }
    }

    override fun getItemCount() = data.size

    class CitiesHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val city: Button = itemView.findViewById(R.id.city_item_button)
    }
}