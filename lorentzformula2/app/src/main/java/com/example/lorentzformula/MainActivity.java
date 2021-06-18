package com.example.lorentzformula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button b1;
    public TextView t2;
    public EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        t2 = (TextView) findViewById(R.id.t2);
        e1 = (EditText) findViewById(R.id.et1);
        b1.setOnClickListener(clickListener);
    }
    public View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            double a = 300000000;
            if (e1.getText().toString().equals(""))
                Toast.makeText(MainActivity.this,"Enter the value",Toast.LENGTH_SHORT).show();
            else {
                double b = Double.valueOf(e1.getText().toString());
                if (a < b)
                    Toast.makeText(MainActivity.this, "Wrong Entry", Toast.LENGTH_SHORT).show();
                else {
                    double c =  (Math.sqrt(1 - Math.pow((b / a), 2)));
                    double e = 1/c;
                    ((TextView) findViewById(R.id.t2)).setText("Solution is" + e);
                }
            }
        }
    };
}
