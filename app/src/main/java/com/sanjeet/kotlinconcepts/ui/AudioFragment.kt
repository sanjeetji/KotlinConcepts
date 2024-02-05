package com.sanjeet.kotlinconcepts.ui

import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.sanjeet.kotlinconcepts.R
import com.sanjeet.kotlinconcepts.TestExample.ExampleMainActivity
import com.sanjeet.kotlinconcepts.database.entity.PostItem
import com.sanjeet.kotlinconcepts.databinding.FragmentAudioBinding
import com.sanjeet.kotlinconcepts.databinding.FragmentDetailBinding
import com.sanjeet.kotlinconcepts.services.AudioService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AudioFragment : Fragment() {

    private var _binding: FragmentAudioBinding? = null
    private val binding get() = _binding
    private lateinit var mp:MediaPlayer;


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        container!!.removeAllViews()
        // Inflate the layout for this fragment
        _binding = FragmentAudioBinding.inflate(inflater, container, false)
        mp = MediaPlayer.create(requireActivity(), R.raw.rom_rom_crakk_128_kbps);

        binding?.apply {
            this.btnStartAudio.setOnClickListener {
                startAudioService()

            }
            this.btnIncreaseVolume.setOnClickListener {
                starSong()
            }
        }
        return binding?.root!!
    }

    private fun startAudioService() {
        requireActivity().startService(Intent(requireActivity(),AudioService::class.java))
    }

    private fun starSong() {
        if (mp.isPlaying){
            mp.pause()
        }else{
            mp.start()
        }
    }


}