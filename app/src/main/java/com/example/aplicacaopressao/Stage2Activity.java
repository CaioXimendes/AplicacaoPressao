package com.example.aplicacaopressao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Stage2Activity extends AppCompatActivity {
    Button buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result5);
        buttonBack = (Button) findViewById(R.id.button6);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Stage2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
