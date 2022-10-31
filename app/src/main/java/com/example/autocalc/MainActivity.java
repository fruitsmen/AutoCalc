package com.example.autocalc;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView nameTextView;
    private EditText nameEditText;
    private Button nameButtonCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //выводим текст в объект на активити
        nameTextView = findViewById(R.id.nameTextView);
        nameTextView.setText("0");

        //находим поле ввода и инициализируем
        nameEditText = findViewById(R.id.nameEditText);
        nameEditText.setText("0"); //проинициализируем строку ввода,что бы не падало приложение

        //обработчик нажатия кнопки
        nameButtonCalc = findViewById(R.id.nameButtonCalc);
        nameButtonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = Float.parseFloat(nameEditText.getText().toString()) ;
                float result = x * 1.65f;
                nameTextView.setText(String.valueOf(result));
            }
        });
    }



}