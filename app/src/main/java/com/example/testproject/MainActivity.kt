package com.example.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        simpleAdd()
        emailCheck()
        numberCheck()
    }

    private fun simpleAdd() = with(binding!!) {
        btnPlus.setOnClickListener {
            val result = etOne.text.toString().toInt() + etTwo.text.toString().toInt()
            tvResult.text = result.toString()
        }
    }

    private fun emailCheck() = with(binding!!) {
        btnCheckEmail.setOnClickListener {
            val result = Math().checkEmail(etEmail.text.toString())
            tvResult.text = result.toString()
        }
    }

    private fun numberCheck() = with(binding!!) {
        btnCheckNumber.setOnClickListener {
            val result = Math().numberCheck(etNumber.text.toString())
            tvResultNumber.text = result.toString()
        }
    }
}