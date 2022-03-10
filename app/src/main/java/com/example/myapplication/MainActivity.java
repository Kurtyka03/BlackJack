package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int punktyUser = 0;
    int punktyKrupier = 0;
    boolean gracz = true;
    int asKrupier = 0;
    int asGracz = 0;
    boolean czyGra = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private int Losowanie(){
        Random r = new Random();
        int Liczba = r.nextInt(52+1);
        return Liczba;
    }
    private void Krupier(){
        ImageView Krupier = findViewById(R.id.imageView);
        //int i
        switch (Losowanie()){
            case 1:
                Krupier.setImageResource(R.drawable.ac);
                punktyKrupier += 11;
                asKrupier++;
                Koniec();
                break;
            case 2:
                Krupier.setImageResource(R.drawable.ad);
                punktyKrupier += 11;
                asKrupier++;
                Koniec();
                break;
            case 3:
                Krupier.setImageResource(R.drawable.ah);
                punktyKrupier += 11;
                asKrupier++;
                Koniec();
                break;
            case 4:
                Krupier.setImageResource(R.drawable.as);
                punktyKrupier += 11;
                asKrupier++;
                Koniec();
                break;
        }
    }
    private void Gracz(){
        ImageView Krupier = findViewById(R.id.imageView2);
        switch (Losowanie()){
            case 1:
                Krupier.setImageResource(R.drawable.ac);
                punktyUser += 11;
                asGracz++;
                Koniec();
                break;
            case 2:
                Krupier.setImageResource(R.drawable.ad);
                punktyUser += 11;
                asGracz++;
                Koniec();
                break;
            case 3:
                Krupier.setImageResource(R.drawable.ah);
                punktyUser += 11;
                asGracz++;
                Koniec();
                break;
            case 4:
                Krupier.setImageResource(R.drawable.as);
                punktyUser += 11;
                asGracz++;
                Koniec();
                break;
            case 5:
                Krupier.setImageResource(R.drawable._2s);
                punktyUser += 2;
                Koniec();
                break;
            case 6:
                Krupier.setImageResource(R.drawable.qc);
                punktyUser += 3;
                Koniec();
                break;
            case 7:
                Krupier.setImageResource(R.drawable.qd);
                punktyUser += 3;
                Koniec();
                break;
            case 8:
                Krupier.setImageResource(R.drawable.qh);
                punktyUser += 3;
                Koniec();
                break;
            case 9:
                Krupier.setImageResource(R.drawable.qs);
                punktyUser += 3;
                Koniec();
                break;
            case 10:
                Krupier.setImageResource(R.drawable.kc);
                punktyUser += 4;
                Koniec();
                break;
            case 11:
                Krupier.setImageResource(R.drawable.kd);
                punktyUser += 4;
                Koniec();
                break;
            case 12:
                Krupier.setImageResource(R.drawable.kh);
                punktyUser += 4;
                Koniec();
                break;
            case 13:
                Krupier.setImageResource(R.drawable.ks);
                punktyUser += 4;
                Koniec();
                break;
            case 14:
                Krupier.setImageResource(R.drawable.jc);
                punktyUser += 2;
                Koniec();
                break;
            case 15:
                Krupier.setImageResource(R.drawable.jd);
                punktyUser += 2;
                Koniec();
                break;
            case 16:
                Krupier.setImageResource(R.drawable.jh);
                punktyUser += 2;
                Koniec();
                break;
            case 17:
                Krupier.setImageResource(R.drawable.js);
                punktyUser += 2;
                Koniec();
                break;
            case 18:
                Krupier.setImageResource(R.drawable._10d);
                punktyUser += 10;
                Koniec();
                break;
            case 19:
                Krupier.setImageResource(R.drawable._10c);
                punktyUser += 10;
                Koniec();
                break;
            case 20:
                Krupier.setImageResource(R.drawable._10h);
                punktyUser += 10;
                Koniec();
                break;
            case 21:
                Krupier.setImageResource(R.drawable._10s);
                punktyUser += 10;
                Koniec();
                break;
            case 22:
                Krupier.setImageResource(R.drawable._9d);
                punktyUser += 9;
                Koniec();
                break;
            case 23:
                Krupier.setImageResource(R.drawable._9c);
                punktyUser += 9;
                Koniec();
                break;
            case 24:
                Krupier.setImageResource(R.drawable._9h);
                punktyUser += 9;
                Koniec();
                break;
            case 25:
                Krupier.setImageResource(R.drawable._9s);
                punktyUser += 9;
                Koniec();
                break;
            case 26:
                Krupier.setImageResource(R.drawable._8d);
                punktyUser += 8;
                Koniec();
                break;
            case 27:
                Krupier.setImageResource(R.drawable._8c);
                punktyUser += 8;
                Koniec();
                break;
            case 28:
                Krupier.setImageResource(R.drawable._8h);
                punktyUser += 8;
                Koniec();
                break;
            case 29:
                Krupier.setImageResource(R.drawable._8s);
                punktyUser += 8;
                Koniec();
                break;
            case 30:
                Krupier.setImageResource(R.drawable._7d);
                punktyUser += 7;
                Koniec();
                break;
            case 31:
                Krupier.setImageResource(R.drawable._7c);
                punktyUser += 7;
                Koniec();
                break;
            case 32:
                Krupier.setImageResource(R.drawable._7h);
                punktyUser += 7;
                Koniec();
                break;
            case 33:
                Krupier.setImageResource(R.drawable._7s);
                punktyUser += 7;
                Koniec();
                break;
            case 34:
                Krupier.setImageResource(R.drawable._6d);
                punktyUser += 6;
                Koniec();
                break;
            case 35:
                Krupier.setImageResource(R.drawable._6c);
                punktyUser += 6;
                Koniec();
                break;
            case 36:
                Krupier.setImageResource(R.drawable._6h);
                punktyUser += 6;
                Koniec();
                break;
            case 37:
                Krupier.setImageResource(R.drawable._6s);
                punktyUser += 6;
                Koniec();
                break;
            case 38:
                Krupier.setImageResource(R.drawable._5d);
                punktyUser += 5;
                Koniec();
                break;
            case 39:
                Krupier.setImageResource(R.drawable._5c);
                punktyUser += 5;
                Koniec();
                break;
            case 40:
                Krupier.setImageResource(R.drawable._5h);
                punktyUser += 5;
                Koniec();
                break;
            case 41:
                Krupier.setImageResource(R.drawable._5s);
                punktyUser += 5;
                Koniec();
                break;
            case 42:
                Krupier.setImageResource(R.drawable._4d);
                punktyUser += 4;
                Koniec();
                break;
            case 43:
                Krupier.setImageResource(R.drawable._4c);
                punktyUser += 4;
                Koniec();
                break;
            case 44:
                Krupier.setImageResource(R.drawable._4h);
                punktyUser += 4;
                Koniec();
                break;
            case 45:
                Krupier.setImageResource(R.drawable._4s);
                punktyUser += 4;
                Koniec();
                break;
            case 46:
                Krupier.setImageResource(R.drawable._3d);
                punktyUser += 3;
                Koniec();
                break;
            case 47:
                Krupier.setImageResource(R.drawable._3c);
                punktyUser += 3;
                Koniec();
                break;
            case 48:
                Krupier.setImageResource(R.drawable._3h);
                punktyUser += 3;
                Koniec();
                break;
            case 49:
                Krupier.setImageResource(R.drawable._3s);
                punktyUser += 3;
                Koniec();
                break;
            case 50:
                Krupier.setImageResource(R.drawable._2d);
                punktyUser += 2;
                Koniec();
                break;
            case 51:
                Krupier.setImageResource(R.drawable._2c);
                punktyUser += 2;
                Koniec();
                break;
            case 52:
                Krupier.setImageResource(R.drawable._2h);
                punktyUser += 2;
                Koniec();
                break;
        }
    }

    public void Start(View view) {
        punktyKrupier = 0;
        punktyUser = 0;
        czyGra = true;
        asGracz = 0;
        asKrupier = 0;
        Button losuj = findViewById(R.id.button);
        Button start = findViewById(R.id.button2);
        Button reset = findViewById(R.id.button3);
        Button stop = findViewById(R.id.button4);

        losuj.setEnabled(true);
        start.setEnabled(false);
        reset.setEnabled(true);
        stop.setEnabled(true);
    }

    public void Losuj(View view) {
        if(gracz){
            Gracz();
        }else{
            Krupier();
        }
    }

    public void Stop(View view) {
        Button stop = findViewById(R.id.button4);
        stop.setEnabled(true);
        gracz = false;
    }

    public void Reset(View view) {
    }

    public void Koniec(){
        if(asGracz >= 2 || czyGra){
            czyGra = false;
            Toast.makeText(this, "Wygrałeś asami!!!!", Toast.LENGTH_SHORT).show();
        }
        if(punktyUser == 21 && czyGra) {
            czyGra = false;
            Toast.makeText(this, "Wygrałeś!!!!", Toast.LENGTH_SHORT).show();
        }else if(punktyUser > 21 && czyGra){
            czyGra = false;
            Toast.makeText(this, "Przegrales!!!!", Toast.LENGTH_SHORT).show();
        }
        if(punktyKrupier == 22 && czyGra){
            czyGra = false;
            Toast.makeText(this, "Krupier wygral!!!!", Toast.LENGTH_SHORT).show();
        }else if(punktyKrupier > 21 && czyGra){
            czyGra = false;
            Toast.makeText(this, "Krupier przegrał!!!!", Toast.LENGTH_SHORT).show();
        }

        if(!czyGra){
            Button losuj = findViewById(R.id.button);
            Button start = findViewById(R.id.button2);
            Button reset = findViewById(R.id.button3);
            Button stop = findViewById(R.id.button4);

            losuj.setEnabled(false);
            start.setEnabled(true);
            reset.setEnabled(false);
            stop.setEnabled(false);

            punktyKrupier = 0;
            punktyUser = 0;
            czyGra = true;
            asGracz = 0;
            asKrupier = 0;
        }

    }


}