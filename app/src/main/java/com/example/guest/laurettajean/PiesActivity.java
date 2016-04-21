package com.example.guest.laurettajean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PiesActivity extends AppCompatActivity {
    private String[] pies = new String[] {"Apple Walnut", "Blackberry Raspberry Stresuel", "Tart Cherry", "Rhubarb Streusel", "Rhubarb Raspberry Sour Cream", "Blueberry Rhubarb", "Strawberry Rhubarb", "Chocolate Cream", "Coconut Cream", "Chocolate Banana Cream", "Banana Cream", "Blackbottom Coconut", "Key Lime", "Lemon Gingersnap", "Salted Honey", "Honey Hazelnut", "Chocolate Chess", "S'mores"};
    @Bind(R.id.pieListView) ListView mPieListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pies);
        ButterKnife.bind(this);

        ArrayAdapter pieAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pies);
        mPieListView.setAdapter(pieAdapter);
    }
}
