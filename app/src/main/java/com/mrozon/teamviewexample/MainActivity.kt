package com.mrozon.teamviewexample

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mrozon.teamviewexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()

        val members = listOf(
            Member("Denisov",23.5,15.7, "https://i.eurosport.com/2012/11/02/906690-19936980-2560-1440.jpg"),
            Member("Pogrebnyak",11.5,25.0, "https://avatars.mds.yandex.net/get-zen_doc/49107/pub_5b936b4206d85100aeee98fc_5b936d1867918d00aa70993a/scale_1200"),
            Member("Черышев",13.5,15.4, "https://top10a.ru/wp-content/uploads/2019/04/5-12.jpg"),
            Member("player4",3.5,5.0),
            Member("player7",13.5,15.4),
        )

        binding.teamView.bind(Color.parseColor("#CCCCCC"), members)
        binding.textView.text = "Your team contains ${members.size} players"
    }

    private fun performDataBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.executePendingBindings()
    }

}