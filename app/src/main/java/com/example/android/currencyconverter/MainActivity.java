package com.example.android.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dollarToInr(View view){
        EditText convert = findViewById(R.id.dollar);
        if (convert.getText().toString().trim().equalsIgnoreCase("")) {
            convert.setError("This field can not be blank");
        }
        else {
        Double dollarAmount = Double.parseDouble(convert.getText().toString());
        Double inr=dollarAmount*65.01;
        Toast.makeText(MainActivity.this,"Rs "+inr,Toast.LENGTH_LONG).show();
    }}
}
