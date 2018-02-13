package com.example.roshnighosh.homelessshelterlocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;

public class ApplicationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_page);

        Button button3 = (Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(ApplicationPage.this, WelcomePage.class);
                startActivity(intent);
            }
        });

    }
}
