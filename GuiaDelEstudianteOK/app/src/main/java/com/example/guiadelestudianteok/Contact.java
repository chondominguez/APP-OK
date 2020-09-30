package com.example.guiadelestudianteok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Contact extends AppCompatActivity {

    private ImageButton instagram, facebook, twitter, maps;
    private String url1, url2, url3, url4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        instagram = findViewById(R.id.instagram_button);
        facebook = findViewById(R.id.facebook_button);
        twitter = findViewById(R.id.twitter_button);
        maps = findViewById(R.id.maps_button);
        url1 = "https://www.instagram.com/et1_otto_krause/";
        url2 = "https://www.facebook.com/ETOTTOKRAUSE";
        url3 = "https://twitter.com/ETN1OttoKrause";
        url4 = "https://www.google.com/maps/dir//-34.6152872,-58.3686924/@-34.6316813,-58.3918399,14z";
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url1);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url2);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url3);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url4);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
    public void IrAInicio(View view){
        Intent l = new Intent(this, MainActivity.class);
        startActivity(l);
    }
}