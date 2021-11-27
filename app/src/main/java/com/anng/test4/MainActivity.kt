package com.anng.test4

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {

    // cтрока 1 Опять звучит в моей душе унылой
    // cтрока 2 Знакомый голосок, и девственная тень
    // cтрока 3 Опять передо мной с неотразимой силой
    // cтрока 4 Из мрака прошлого встаёт, как ясный день;
    // cтрока 5 Но тщетно памятью ты вызван, призрак милый!
    // cтрока 6 Я устарел: и жить и чувствовать — мне лень.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Опять звучит в моей душе унылой")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Знакомый голосок, и девственная тень")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Опять передо мной с неотразимой силой")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Из мрака прошлого встаёт, как ясный день;")
    }



    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Но тщетно памятью ты вызван, призрак милый!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Опять звучит в моей душе унылой")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Я устарел: и жить и чувствовать — мне лень.")
    }


}

