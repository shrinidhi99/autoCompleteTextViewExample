package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CountryItem> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillCountryList();
        AutoCompleteTextView editText = findViewById(R.id.aCTV);
        AutoCompleteCountryAdapter adapter = new AutoCompleteCountryAdapter(this, countryList);
        editText.setAdapter(adapter);
    }

    private void fillCountryList() {
        countryList = new ArrayList<>();
        countryList.add(new CountryItem("Afghanistan"));
        countryList.add(new CountryItem("Albania"));
        countryList.add(new CountryItem("Algeria"));
        countryList.add(new CountryItem("Andorra"));
        countryList.add(new CountryItem("Australia"));
        countryList.add(new CountryItem("Bangladesh"));
        countryList.add(new CountryItem("China"));
        countryList.add(new CountryItem("Denmark"));
        countryList.add(new CountryItem("East Indies"));
        countryList.add(new CountryItem("Finland"));
        countryList.add(new CountryItem("Ghana"));
        countryList.add(new CountryItem("Holland"));
        countryList.add(new CountryItem("India"));
        countryList.add(new CountryItem("Japan"));
        countryList.add(new CountryItem("Kenya"));
        countryList.add(new CountryItem("Libya"));
        countryList.add(new CountryItem("Madagascar"));
        countryList.add(new CountryItem("New Zealand"));
        countryList.add(new CountryItem("Oman"));
        countryList.add(new CountryItem("Paraguay"));
        countryList.add(new CountryItem("Qatar"));
        countryList.add(new CountryItem("Republic of South Africa"));
        countryList.add(new CountryItem("Switzerland"));
        countryList.add(new CountryItem("Thailand"));
        countryList.add(new CountryItem("Ukraine"));
        countryList.add(new CountryItem("Venezuela"));
        countryList.add(new CountryItem("Wales"));
        countryList.add(new CountryItem("Austria"));
        countryList.add(new CountryItem("Yemen"));
        countryList.add(new CountryItem("Zaire"));


    }
}
