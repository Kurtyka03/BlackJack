package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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

    }

    public void Start(View view) {

    }

    public void Losuj(View view) {
    }

    public void Reset(View view) {
    }
}