package com.mobilprogramlama.hafta6_proje3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2,edt3,edt4,edt5;
    Button btn;
    double a,b,c,x1,x2,delta,sonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=(EditText) findViewById(R.id.editTextText);
        edt2=(EditText) findViewById(R.id.editTextText2);
        edt3=(EditText) findViewById(R.id.editTextText3);
        edt4=(EditText) findViewById(R.id.editTextText4);
        edt5=(EditText) findViewById(R.id.editTextText5);
        btn=(Button) findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a=Double.parseDouble(edt1.getText().toString());
                b=Double.parseDouble(edt2.getText().toString());
                c=Double.parseDouble(edt3.getText().toString());
                delta=b*b-4*a*c;


                if (delta>0)
                {
                    x1=(-b+Math.sqrt(delta))/2*a;
                    x2=(-b-Math.sqrt(delta))/2*a;
                    edt4.setText(String.valueOf(x1));
                    edt5.setText(String.valueOf(x2));
                }else if (delta==0)
                {
                    x1=-b/2*a;
                    x2=x1;
                    edt4.setText(String.valueOf(x1));
                    edt5.setText(String.valueOf(x2));
                }else
                {
                    edt4.setText("Denklemin Reel");
                    edt5.setText("Kökü Yoktur");
                }
            }
        });
    }
}