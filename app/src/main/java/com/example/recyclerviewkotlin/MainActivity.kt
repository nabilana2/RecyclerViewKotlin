package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kartunList = listOf<Kartun>(
            Kartun(
                R.drawable.doraemon,
                "Doraemon",
                "Doraemon adalah karakter fiksi dalam serial manga dan anime Jepang dengan nama yang sama yang dibuat oleh Fujiko Fujio, nama pena dari tim penulisan Hiroshi Fujimoto dan Motoo Abiko"
            ),
            Kartun(
                R.drawable.dora,
                "Dora The Explorer",
                "Dora the Explorer adalah serial animasi pendidikan anak-anak dari Amerika Serikat-Kanada milik jaringan televisi kabel Nickelodeon dan Treehouse TV. Episode percobaan disiarkan tanggal, 19 Agustus 1999 dan menjadi seri reguler mulai tanggal, 19 Agustus 2000"
            ),
            Kartun(
                R.drawable.marsha,
                "Marsha and The Bear",
                "Masha and The Bear adalah sebuah serial animasi Rusia yang diproduksi oleh Animaccord Animation Studios. Serial animasi ini menceritakan petualangan seorang gadis kecil yang bernama Masha dan Beruang yang merupakan temannnya. Serial ini diciptakan oleh Andrei Dobrunov, Oleg Kuzovkov, dan Dmitry Loveiko"
            ),
            Kartun(
                R.drawable.sinchan,
                "Sinchan",
                "Crayon Shin-chan, juga dikenal sebagai Shin Chan, adalah sebuah seri manga Jepang yang ditulis dan diilustrasikan oleh Yoshito Usui"
            ),
            Kartun(
                R.drawable.sofia,
                "Sofia the First",
                "Sofia the First adalah serial televisi Amerika Serikat yang menggabungkan karakter dari franchise Disney Princess. Bintang dalam serial ini, Ariel Winter sebagai Sofia, seorang gadis muda yang menjadi seorang putri ketika ibunya, Miranda, menikahi Raja Roland II dari kerajaan Enchancia"
            ),
            Kartun(
                R.drawable.spongebob,
                "Spongebob SquarePants",
                "SpongeBob SquarePants adalah sebuah serial animasi yang paling terpopuler di Nickelodeon. Pada awalnya serial kartun animasi ini ditayangkan pada tahun 1999 di Amerika Serikat dan diciptakan oleh Stephen "
            ),
            Kartun(
                R.drawable.tayo,
                "Tayo the Little Bus",
                "Tayo the Little Bus adalah serial animasi dari Korea yang diproduksi oleh Iconix Entertainment dan Educational Broadcasting System"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_kartun)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KartunAdapter(this,kartunList){
            val intent = Intent (this, DetailKartunActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}