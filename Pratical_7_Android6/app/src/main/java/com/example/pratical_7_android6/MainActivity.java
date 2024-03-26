package com.example.pratical_7_android6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView cakeImageView = findViewById(R.id.cake_image);
        ImageView iceCreamImageView = findViewById(R.id.ice_cream_image);

        cakeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You selected cake!", Toast.LENGTH_SHORT).show();
            }
        });

        iceCreamImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You selected ice cream!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}