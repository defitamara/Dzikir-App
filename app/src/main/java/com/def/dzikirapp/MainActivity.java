package com.def.dzikirapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView dzikir;
    int zikir = 0;
    Vibrator vibe;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dzikir = (TextView) findViewById(R.id.dzikir);
        vibe = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
    }


    public void subhanallah(View view) {
//        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tasbih);
//        mediaPlayer.start();
        zikir = zikir + 1;
        tampil(zikir);
        vibe.vibrate(100);
    }

    public void alhamdulillah(View view) {
//        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tahmid);
//        mediaPlayer.start();
        zikir = zikir + 1;
        tampil(zikir);
        vibe.vibrate(100);
    }

    public void lailahaillallah(View view) {
//        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tahlil);
//        mediaPlayer.start();
        zikir = zikir + 1;
        tampil(zikir);
        vibe.vibrate(100);
    }

    public void allahuakbar(View view) {
//        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.takbir);
//        mediaPlayer.start();
        zikir = zikir + 1;
        tampil(zikir);
        vibe.vibrate(100);
    }

    private void tampil(int zikir) {
        dzikir.setText("" + zikir);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_reset, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.reset:
//                mediaPlayer.stop();
                zikir = 0;
                tampil(zikir);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

// Yang dijadikan komentar itu tidak dipakai, karena fungsinya untuk memutar audio