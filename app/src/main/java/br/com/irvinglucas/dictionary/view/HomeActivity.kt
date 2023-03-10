package br.com.irvinglucas.dictionary.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.irvinglucas.dictionary.R
import br.com.irvinglucas.dictionary.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}