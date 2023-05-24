package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.login.dao.SqlliteConnector;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login l = new Login("r", "123");
        SqlliteConnector dao = new SqlliteConnector(getApplicationContext());
        dao.cadastro(new Cadastro("Rafinha", "rafik123", "1234"));
    }
}