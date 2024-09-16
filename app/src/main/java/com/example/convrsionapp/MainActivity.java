package com.example.convrsionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcomeText;
    TextView textView2;
    Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView2= findViewById(R.id.textView2);
        editText= findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();

                // converting
                double m=Double.parseDouble(input);
                double cm = conversion(m);

                textView2.setText(""+ cm);
            }
        });

    }

    public double conversion(double m){
        return m*100;
    }
}