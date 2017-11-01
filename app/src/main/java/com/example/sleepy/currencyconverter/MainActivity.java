package com.example.sleepy.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertUSDCurrency (View view){

        EditText moneyTextField = (EditText)findViewById(R.id.moneyTextField);
        try{
            double cadValue = Double.parseDouble(moneyTextField.getText().toString());
            double usdValue = cadValue*0.7768;
            Toast.makeText(MainActivity.this,"$" + usdValue + " USD", Toast.LENGTH_LONG).show();
            ImageView usdImageView = (ImageView) findViewById(R.id.usdImageView);
            usdImageView.setImageResource(R.drawable.money);
        }catch(Exception e){
            Log.i("Info", "Type Error");
            Toast.makeText(MainActivity.this, "Please Enter in a Number Amount", Toast.LENGTH_SHORT).show();
        }




    }

    public void convertCADCurrency (View view){
        try {
            EditText moneyTextField = (EditText)findViewById(R.id.moneyTextField);
            double usdValue = Double.parseDouble(moneyTextField.getText().toString());
            double cadValue = usdValue*1.29;
            Toast.makeText(MainActivity.this,"$" + cadValue + " CAD", Toast.LENGTH_LONG).show();
            ImageView usdImageView = (ImageView)findViewById(R.id.usdImageView);
            usdImageView.setImageResource(R.drawable.cadmoney);
        }catch(Exception e){
            Log.i("Info","Type Error");
            Toast.makeText(MainActivity.this, "Please Enter a Number Value", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
