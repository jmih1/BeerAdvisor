package com.example.brown.beeradvisor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){

        Spinner beerType = (Spinner) findViewById(R.id.spinner);

        TextView brands = (TextView) findViewById(R.id.brands);

        String item = String.valueOf(beerType.getSelectedItem());

        List<String> brandslist = expert.getBrands(item);

        StringBuilder brandsFormatted = new StringBuilder();

        for (String brand: brandslist){
            brandsFormatted.append(brand).append("\n");
        }

        brands.setText(brandsFormatted);




    }
}
