package com.example.android.hotelreservation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Title, Location, Rating;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Title = (TextView) findViewById(R.id.text1);
        Location = (TextView) findViewById(R.id.text2);
        Rating = (TextView) findViewById(R.id.text3);
        button1 = (Button) findViewById(R.id.btn1);

        Title.setText("Hotel Grand Indah");
        Location.setText("Kemang,Jakarta");
        Rating.setText("*****");

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,
                        Title.getText().toString()
                                + "\n"
                                + "Lokasi :" + Location.getText().toString()
                                + "\n"
                                + "Rating :" + Rating.getText().toString()
                );
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
