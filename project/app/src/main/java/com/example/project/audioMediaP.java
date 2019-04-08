package com.example.project;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

public class audioMediaP extends AppCompatActivity
{
    private MediaPlayer mediaPlayer;
    AssetManager assets;
    AssetFileDescriptor fd;
    private audio mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_media_p);

        TextView title = findViewById(R.id.title);
        TextView singger = findViewById(R.id.singger);
        TextView nd = findViewById(R.id.nd);
        TextView time_up = findViewById(R.id.time_up);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        title.setText(extras.getString("title"));
        singger.setText(extras.getString("singger"));
        nd.setText(extras.getString("nd"));
        time_up.setText(extras.getString("time_up"));


    }
}
