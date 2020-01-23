package com.route.designproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView toolbar_text_view = findViewById(R.id.tool_bar_text_view);
        toolbar_text_view.setText("HOME");

        Button button = findViewById(R.id.sign);

        button.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),set_place.class);
                startActivity(i);
            }
        });

    }
}
