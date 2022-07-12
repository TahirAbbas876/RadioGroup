package com.example.radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup radioGroup;
Button btnSubmit,btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnClear=findViewById(R.id.btnClear);
        radioGroup=findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton=radioGroup.findViewById(i);
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int id=radioGroup.getCheckedRadioButtonId();

                if(id== -1){
                    Toast.makeText(MainActivity.this, "Please select option", Toast.LENGTH_SHORT).show();
                }
                else{
                   RadioButton radioButton=radioGroup.findViewById(id);
                    Toast.makeText(MainActivity.this,radioButton.getText(),Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioGroup.clearCheck();
            }
        });
    }
}