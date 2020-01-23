package com.route.designproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView toolbar_text_view = findViewById(R.id.tool_bar_text_view);
        toolbar_text_view.setText("FORGET PASSWORD");


    }
}
