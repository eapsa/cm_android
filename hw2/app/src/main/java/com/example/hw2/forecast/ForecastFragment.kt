package com.example.hw2.forecast

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.hw2.R

class ForecastFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args = ForecastFragmentArgs.fromBundle(requireArguments())
        Toast.makeText(context, "City: ${args.cityName}", Toast.LENGTH_LONG).show()
        return inflater.inflate(R.layout.fragment_forecast, container, false)
    }
}