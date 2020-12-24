package com.su.design_mode.AdapterPattern.one.adapter;

import com.su.design_mode.AdapterPattern.one.player.AdvancedMediaPlayer;
import com.su.design_mode.AdapterPattern.one.player.MediaPlayer;
import com.su.design_mode.AdapterPattern.one.player.impl.Mp4Player;
import com.su.design_mode.AdapterPattern.one.player.impl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
