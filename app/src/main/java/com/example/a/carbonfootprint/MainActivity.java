package com.example.a.carbonfootprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signIn(View v) {
        Intent intent = new Intent(this, SignInActivity.class);
        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        String message = editTextEmail.getText().toString();
        intent.putExtra("com.example.a.carbonfootprint.EXTRA_MESSAGE", message);
        startActivity(intent);
    }
}

