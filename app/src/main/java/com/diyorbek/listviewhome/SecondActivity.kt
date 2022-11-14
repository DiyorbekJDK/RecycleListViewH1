package com.diyorbek.listviewhome

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.diyorbek.listviewhome.model.Games

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()
        val imaeg: ImageView = findViewById(R.id.imageGame)
        val txt: TextView = findViewById(R.id.nameGame)
        val text: TextView = findViewById(R.id.dateGame)
        val game = intent.getSerializableExtra("games") as Games
        imaeg.setImageResource(game.gameImage)
        txt.text = game.gameName
        text.text = game.gameDate

    }
}