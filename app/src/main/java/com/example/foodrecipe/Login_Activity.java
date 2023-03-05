package com.example.foodrecipe;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void MainActivity(View view) {
        startActivity(new Intent(Login_Activity.this, MainActivity.class));
    }

    public void register(View view) {
        startActivity(new Intent(Login_Activity.this, Registration_Activity.class));
    }
}



