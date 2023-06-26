package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingQuiz4 extends AppCompatActivity {

    private static final int DELAY_TIME = 2000; // Tempo de atraso em milissegundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_quiz4);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LoadingQuiz4.this, Quiz.class);
                startActivity(i);
                finish(); // Encerra a atividade atual para que ela não possa ser retornada
            }
        }, DELAY_TIME);
    }
}
