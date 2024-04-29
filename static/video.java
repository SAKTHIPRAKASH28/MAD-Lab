
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
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

public class video extends AppCompatActivity {

    private Button play_button, pause_button, stop_button,tenm,tenp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play_button=findViewById(R.id.play_button);
        VideoView vview=findViewById(R.id.vview);

        String url="android.resource://"+getPackageName()+"/raw/videoplayback";
        Uri auri   = Uri.parse(url);
        vview.setVideoURI(auri);
        MediaController mc=new MediaController(this);
        vview.setMediaController(mc);
        mc.setAnchorView(vview);


        play_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vview.start();
            }
        });



    }
}