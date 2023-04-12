package com.example.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodrecipe.databinding.ActivityMainBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class Registration_Activity extends AppCompatActivity {
    ActivityMainBinding binding;
    EditText editText2, editText, editText3, FullName, EmailAddress, Password;
    DatabaseReference reference;
    FirebaseDatabase db;
    Button Register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }


    public void MainActivity(View view) {
        startActivity(new Intent(Registration_Activity.this, MainActivity.class));
        editText2 = (EditText) findViewById(R.id.editText2);
        editText = (EditText) findViewById(R.id.editText);
        editText3 = (EditText) findViewById(R.id.editText3);

        String FullName = editText2.getText().toString().trim();
        String EmailAddress = editText.getText().toString().trim();
        String Password = editText3.getText().toString().trim();

        data_holder obj = new data_holder(FullName, EmailAddress, Password);

        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference reference = db.getReference("User");

        reference.child(FullName).setValue(obj);

        editText2.setText("");
        editText.setText("");
        editText3.setText("");

        Toast.makeText(getApplicationContext(), "Successfully Saved", Toast.LENGTH_LONG).show();
    }

    public void login(View view) {
        startActivity(new Intent(Registration_Activity.this, Login_Activity.class));
    }
}