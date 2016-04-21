package com.example.guest.laurettajean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.locationsButton) TextView mLocationsButton;
    @Bind(R.id.piesButton) TextView mPiesButton;
    @Bind(R.id.aboutButton) TextView mAboutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mLocationsButton.setOnClickListener(this);
        mPiesButton.setOnClickListener(this);
        mAboutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.locationsButton:
                Intent locationsIntent = new Intent(MainActivity.this, LocationsActivity.class);
                startActivity(locationsIntent);
                break;
            case R.id.piesButton:
                Intent piesIntent = new Intent(MainActivity.this, PiesActivity.class);
                startActivity(piesIntent);
                break;
            case R.id.aboutButton:
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
                break;
            default:
                break;
        }
    }
}
