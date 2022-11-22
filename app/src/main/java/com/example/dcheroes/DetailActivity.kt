package com.example.dcheroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dcheroes.data.SuperHero
import com.example.dcheroes.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val heroDet = intent.getParcelableExtra<SuperHero>("superhero")
        if(heroDet != null) {
            binding.tvDetail.text = heroDet.essay
            binding.imgDetail.setImageResource(heroDet.image)
        }

    }
}