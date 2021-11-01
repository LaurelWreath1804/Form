package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText1, editText2, editText3, editText4, editText5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.personName);
        editText2 = (EditText) findViewById(R.id.mssv);
        editText3 = (EditText) findViewById(R.id.birth);
        editText4 = (EditText) findViewById(R.id.number);
        editText5 = (EditText) findViewById(R.id.email);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean checkEmpty1, checkEmpty2, checkEmpty3, checkEmpty4, checkEmpty5;
                checkEmpty1 = TextUtils.isEmpty(editText1.getText().toString());
                checkEmpty2 = TextUtils.isEmpty(editText2.getText().toString());
                checkEmpty3 = TextUtils.isEmpty(editText3.getText().toString());
                checkEmpty4 = TextUtils.isEmpty(editText4.getText().toString());
                checkEmpty5 = TextUtils.isEmpty(editText5.getText().toString());

                if (checkEmpty1 || checkEmpty2 || checkEmpty3 || checkEmpty4 || checkEmpty5) {
                    Toast.makeText(MainActivity.this, "No empty fields allowed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}