package com.example.roshnighosh.homelessshelterlocator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Toolbar;

public class LoginPage extends AppCompatActivity {

    public EditText username;
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Button button = (Button)findViewById(R.id.button);
        username = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("user") &&
                        password.getText().toString().equals("pass")) {
                    Intent intent2 = new Intent(LoginPage.this, ApplicationPage.class);
                    startActivity(intent2);
                }else{
                    Toast.makeText(getApplicationContext(), "Invalid username/password.",Toast.LENGTH_SHORT).show();
                    }
                }

        });

        CheckedTextView cancelView = (CheckedTextView)findViewById(R.id.checkedTextView2);

        cancelView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent1 = new Intent(LoginPage.this, WelcomePage.class);
                startActivity(intent1);
            }
        });


    }
}
