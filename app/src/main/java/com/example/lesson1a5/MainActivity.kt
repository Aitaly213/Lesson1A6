package com.example.lesson1a5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.lesson1a5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[CounterViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupListeners()
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.data.observe(this) { data ->
            binding.tvResult.text = data.toString()
        }
    }

    private fun setupListeners() {
        binding.apply {
            btnInc.setOnClickListener {
                viewModel.onIncrement()
            }
            btnDec.setOnClickListener {
                viewModel.onDecrement()
            }
        }
    }
}