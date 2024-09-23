package com.example.checkboxex;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox = findViewById(R.id.checkbox_example);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Checkbox is unchecked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}