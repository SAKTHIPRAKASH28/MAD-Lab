package com.example.myapplication;

import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button play_button, pause_button, stop_button,tenm,tenp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tenm=findViewById(R.id.tenm);
        tenp=findViewById(R.id.tenp);
        play_button=findViewById(R.id.play_button);
        pause_button=findViewById(R.id.pause_button);
        stop_button=findViewById(R.id.stop_button);
        MediaPlayer mp =new MediaPlayer();
        String url="android.resource://"+getPackageName()+"/raw/audio1";
        Uri auri   = Uri.parse(url);

        try{
            mp.setDataSource(this,auri);
            mp.prepare();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        pause_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.seekTo(0);
                mp.pause();
            }
        });
        tenm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.seekTo(mp.getCurrentPosition()-10000);
            }
        });
       tenp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.seekTo(mp.getCurrentPosition()+10000);
            }
        });


    }
}