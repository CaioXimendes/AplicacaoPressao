package com.example.aplicacaopressao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText[] = new EditText[2];
    TextView textView;
    Button buttonTest;
    private int value1;
    private int value2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        editText[0] = (EditText) findViewById(R.id.editTextNumber);
        editText[1] = (EditText) findViewById(R.id.editTextNumber2);
        buttonTest = (Button) findViewById(R.id.button);
        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                System.out.println();
//                System.out.println();
                value1 = Integer.parseInt(editText[0].getText().toString());
                value2 = Integer.parseInt(editText[1].getText().toString());
                if(value1 < 90 && value2 < 60 ){
                    Intent intent = new Intent(MainActivity.this, LowPressureActivity.class);
                    startActivity(intent);
                }
                else if(value1 < 120 && value2 < 80){
                    Intent intent = new Intent(MainActivity.this, NormalPressureActivity.class);
                    startActivity(intent);
                }
                else if((value1 >= 120 && value1 < 140) || (value2 >=80 && value2 <90) ){
                    Intent intent = new Intent(MainActivity.this, PreHypertensiveActivity.class);
                    startActivity(intent);
                }


                //editText.setText(String.valueOf(999));
                //Log.v("EditText",editText.getText().toString());
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
}