package com.example.nagy_soma_hazi03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtProductList = findViewById(R.id.txtProductsList);

        ArrayList<Product> products = (ArrayList<Product>) getIntent().getSerializableExtra("products");

        StringBuilder productList = new StringBuilder();
        for (Product product : products) {
            productList.append(product.toString()).append("\n");
        }

        txtProductList.setText(productList.toString());
    }
}