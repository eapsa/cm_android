package com.example.hw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.window.layout.WindowMetricsCalculator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val metrics = WindowMetricsCalculator.getOrCreate()
                .computeCurrentWindowMetrics(this)
        if(metrics.bounds.width() / resources.displayMetrics.density < 600){
            val navController = this.findNavController(R.id.myNavHostFragment)
            NavigationUI.setupActionBarWithNavController(this,navController)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
    }
}