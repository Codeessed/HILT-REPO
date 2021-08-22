package com.example.hilttictactoe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game_board.*

class GameBoardActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_board)

        var first = intent.getStringExtra("firstPlayer")
        var second = intent.getStringExtra("secondPlayer")

        firstPerson.text = "$first: %1\$d"
        secondPerson.text = "$second: %1\$d"

    }
}