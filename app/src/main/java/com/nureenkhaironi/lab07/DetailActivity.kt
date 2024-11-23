package com.nureenkhaironi.lab07

import android.content.Intent
import android.location.Address
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nureenkhaironi.lab07.databinding.ActivityDetailBinding
import com.nureenkhaironi.lab07.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra("name")
        binding.nameTextView.text = name

        val address = intent.getStringExtra("address")
        binding.addressTextView.text = address

        val city = intent.getStringExtra("city")
        binding.cityTextView.text = city

        val province = intent.getStringExtra("province")
        binding.stateTextView.text = province

        val postcode = intent.getStringExtra("postcode")
        binding.postalCodeTextView.text = postcode

        val country = intent.getStringExtra("country")
        binding.countryTextView.text = country

    binding.cancelBtn.setOnClickListener{

        finish()
    }

binding.confirmBtn.setOnClickListener{

    val intent =Intent(this,ConfirmActivity::class.java)
    startActivity( intent)

}



    }
    }
