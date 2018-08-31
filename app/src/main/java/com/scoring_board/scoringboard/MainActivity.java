package com.scoring_board.scoringboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int skorTimA = 0;
    int skorTimB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambahTigapoinTimA(View v){
        skorTimA = skorTimA + 3;
        tampilpoinTimA(skorTimA);
    }
    public void tambahDuapoinTimA(View v){
        skorTimA = skorTimA + 2;
        tampilpoinTimA(skorTimA);
    }
    public void tambahSatupoinTimA(View v){
        skorTimA = skorTimA + 1;
        tampilpoinTimA(skorTimA);
    }

    public void tambahTigapoinTimB(View v){
        skorTimB = skorTimB + 3;
        tampilpoinTimB(skorTimB);
    }
    public void tambahDuapoinTimB(View v){
        skorTimB = skorTimB + 2;
        tampilpoinTimB(skorTimB);
    }
    public void tambahSatupoinTimB(View v){
        skorTimB = skorTimB + 1;
        tampilpoinTimB(skorTimB);
    }

    public void tampilpoinTimA(int skor){
        TextView skorView = (TextView) findViewById(R.id.skorTimA);
        skorView.setText(String.valueOf(skor));
    }

    public void tampilpoinTimB(int skor){
        TextView skorView = (TextView) findViewById(R.id.skorTimB);
        skorView.setText(String.valueOf(skor));
    }

    public void resetskor(View v){
        skorTimA = 0;
        skorTimB = 0;
        tampilpoinTimA(skorTimA);
        tampilpoinTimB(skorTimB);
    }
}
