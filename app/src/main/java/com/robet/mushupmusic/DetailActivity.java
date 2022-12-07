package com.robet.mushupmusic;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class DetailActivity extends AppCompatActivity {
    private TextView tvJudul, tvKeterangan, tvVideoid;
    private YouTubePlayerView ypVideo;
    private Button btnKembali;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvJudul = findViewById(R.id.tv_judul);
        tvKeterangan = findViewById(R.id.tv_keterangan);
//        tvVideoid = findViewById(R.id.tv_videoid);
        ypVideo = findViewById(R.id.pv_video);
        btnKembali = findViewById(R.id.btnKembali);
    }
}