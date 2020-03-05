package com.example.test.app1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class Activity1 extends AppCompatActivity {
    TextView s1;
    Intent i;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        s1 = (TextView) findViewById(R.id.textview_id);
        b1 = (Button) findViewById(R.id.button_id);
        s1.setText("Hello");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity1.this, "New toast", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Activity1.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }

    ;
}
