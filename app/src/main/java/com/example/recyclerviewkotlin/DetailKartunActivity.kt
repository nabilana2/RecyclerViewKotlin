package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailKartunActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_kartun)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val kartun = intent.getParcelableExtra<Kartun>(MainActivity.INTENT_PARCELABLE)

        val imgKartun = findViewById<ImageView>(R.id.img_item_photo)
        val NameKartun = findViewById<TextView>(R.id.tv_item_name)
        val descKartun = findViewById<TextView>(R.id.tv_item_description)

        imgKartun.setImageResource(kartun?.imgKartun!!)
        NameKartun.text = kartun.NameKartun
        descKartun.text = kartun.descKartun

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}