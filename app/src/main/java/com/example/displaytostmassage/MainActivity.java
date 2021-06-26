package com.example.displaytostmassage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button1 clicked",Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button2 clicked",Toast.LENGTH_LONG).show();
            }
        });
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"Button3 clicked",Toast.LENGTH_LONG).show();
    }
});
    }
}