package com.example.shopp_partner.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject
import androidx.lifecycle.Observer
import com.example.shopp_partner.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    val mainViewModel : MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            mainViewModel.onClickAction()
        }
        mainViewModel.text.observe(this, Observer<String>{ it: String? -> main_text.text = it

        })
    }
}