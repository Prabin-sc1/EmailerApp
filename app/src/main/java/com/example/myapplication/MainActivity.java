package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText t1,t2,t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.to);
        t2 = findViewById(R.id.sub);
        t3 = findViewById(R.id.msg);



    }
    public void process(View view){
        String email = t1.getText().toString();
        String subject = t2.getText().toString();
        String message = t3.getText().toString();

        Intent i  = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{email});
        i.putExtra(Intent.EXTRA_SUBJECT,subject);
        i.putExtra(Intent.EXTRA_TEXT,message);

        i.setType("messaga/rfc822");

        startActivity(Intent.createChooser(i,"Send email"));

    }
}