package com.soeky.uibasic_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtText;
    private TextView txtHello;

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnHello){
            Toast.makeText(this, "Hello Button CLicked", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        txtHello = findViewById(R.id.txtHello);
        edtText = findViewById(R.id.edtTxtName);

        txtHello.setOnClickListener(this);
        edtText.setOnClickListener(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "long press", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        };
    }
