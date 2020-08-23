package com.example.lifeisgood

import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView

class activity_quiz_main : YouTubeBaseActivity() {

    val videoId = "F-KjYNmsi0U" override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) setContentView (R.layout.activity_quiz_main)
        val youtubeView =
            findViewById<YouTubePlayerView>(R.id.youtubeView) youtubeView . initialize ("develop", object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                provider: YouTubePlayer.Provider,
                player: YouTubePlayer,
                wasRestored: Boolean
            ) {
                if (!wasRestored) {
                    player.cueVideo(videoId)
                } player . setPlayerStateChangeListener (object :
                    YouTubePlayer.PlayerStateChangeListener {
                    override fun onAdStarted() {}
                    override fun onLoading() {}
                    override fun onVideoStarted() {}
                    override fun onVideoEnded() {}
                    override fun onError(p0: YouTubePlayer.ErrorReason) {}
                    override fun onLoaded(videoId: String) {
                        player.play()
                    }
                })
            }
        })

    }

