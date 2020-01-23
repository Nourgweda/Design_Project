package com.route.designproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class add_cart extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView toolbar_text_view = findViewById(R.id.tool_bar_text_view);
        toolbar_text_view.setText("ADD TO CART");

        ImageView imageView = findViewById(R.id.add_to_cart);

        imageView.setOnClickListener (new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PaymentActivity.class);
                startActivity(i);
            }
        });



    }
}
