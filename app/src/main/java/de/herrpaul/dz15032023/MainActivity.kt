package de.herrpaul.dz15032023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val persons = listOf(
            Person("Philipp Amthor", R.drawable.amthor),
            Person("Annalena Baerbock", R.drawable.berbok),
            Person("Robert Habeck", R.drawable.habeck),
            Person("Christian Lindner", R.drawable.lindner),
            Person("Markus Soeder", R.drawable.soder)
        )

        val rv = findViewById<RecyclerView>(R.id.rv)
        val adapter = PersonAdapter(this, persons)
        rv.adapter = adapter
    }
}