package com.example.hw2.cities

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.example.hw2.R
import com.example.hw2.databinding.FragmentCitiesBinding

class CitiesFragment : Fragment() {
    private var array = listOf<String>("Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Perth", "Auckland", "Helsinki", "Hamburg", "Munich", "New York", "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok","Melbourne", "Vienna", "Vancouver", "Toronto", "Calgary", "Adelaide", "Perth", "Auckland", "Helsinki", "Hamburg", "Munich", "New York", "Sydney", "Paris", "Cape Town", "Barcelona", "London", "Bangkok")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentCitiesBinding>(inflater,
            R.layout.fragment_cities,container,false)
        val adapter = CitiesAdapter()
        binding.citiesList.adapter = adapter
        adapter.data = array

        return binding.root
    }
}