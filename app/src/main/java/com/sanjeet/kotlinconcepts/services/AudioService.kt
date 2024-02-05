package com.sanjeet.kotlinconcepts.services

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.util.Log
import com.sanjeet.kotlinconcepts.R

class AudioService : Service() {
    val TAG:String = "AudioService"
    private lateinit var mp: MediaPlayer;

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        mp = MediaPlayer.create(applicationContext, R.raw.rom_rom_crakk_128_kbps);
        Log.e(TAG,"Start Audio Service to play Audio Song")
        Log.e(TAG,"Song Info ===== 1"+        mp.trackInfo.get(0).language)
        Log.e(TAG,"Song Info ===== 2"+        mp.trackInfo.get(0).trackType)
        Log.e(TAG,"Song Info ===== 3"+        mp.trackInfo.get(0).format)
        Log.e(TAG,"Song Info ===== 4"+        mp.trackInfo.get(0))
        Log.e(TAG,"Song Info ===== 5"+        mp.duration)

        mp.isLooping = true
        if (mp.isPlaying){
            Log.e(TAG,"Song is paused Audio Song")
            mp.pause()
        }else{
            mp.start()
        }


        return super.onStartCommand(intent, flags, startId)
    }
}