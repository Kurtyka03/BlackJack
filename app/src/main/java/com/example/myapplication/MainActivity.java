package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int punktyUser = 0;
    int punktyKrupier = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private int Losowanie(){
        Random r = new Random();
        int Liczba = r.nextInt(4+1);
        return Liczba;
    }
    private void Krupier(){
        ImageView Krupier = findViewById(R.id.imageView);
        switch (Losowanie()){
            case 1:
                Krupier.setImageResource(R.drawable.ac);
                punktyKrupier += 11;
                Koniec();
                break;
            case 2:
                Krupier.setImageResource(R.drawable.ad);
                punktyKrupier += 11;
                Koniec();
                break;
            case 3:
                Krupier.setImageResource(R.drawable.ah);
                punktyKrupier += 11;
                Koniec();
                break;
            case 4:
                Krupier.setImageResource(R.drawable.as);
                punktyKrupier += 11;
                Koniec();
                break;
        }
    }

    public void Start(View view) {
        Button losuj = findViewById(R.id.button);
        Button start = findViewById(R.id.button2);
        Button reset = findViewById(R.id.button3);

        losuj.setEnabled(true);
        start.setEnabled(false);
        reset.setEnabled(true);
    }

    public void Losuj(View view) {
    }

    public void Reset(View view) {
    }

    public void Koniec(){

    }
}