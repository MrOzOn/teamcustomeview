package com.mrozon.teamviewexample

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mrozon.teamviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()

        val members = listOf(
            Member("player1",23.5,15.7),
            Member("player2",11.5,25.0),
            Member("player3",13.5,15.4),
            Member("player4",3.5,5.0),
            Member("player5",3.5,5.0),
            Member("player7",13.5,15.4),
        )

        binding.teamView.bind(Color.parseColor("#CCCCCC"), members)
    }

    private fun performDataBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.executePendingBindings()
    }

}