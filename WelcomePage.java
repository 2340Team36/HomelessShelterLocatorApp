package com.example.roshnighosh.homelessshelterlocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Button button6 = (Button)findViewById(R.id.button6);
        CheckedTextView registerView = (CheckedTextView)findViewById(R.id.checkedTextView);

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(WelcomePage.this, LoginPage.class);
                startActivity(intent);
            }
        });

        registerView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent1 = new Intent(WelcomePage.this, RegistrationPage.class);
                startActivity(intent1);
            }
        });
    }


}
