package com.example.assignment7;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Switch switchEnable;
    CheckBox checkMusic, checkSports, checkReading;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        switchEnable = findViewById(R.id.switchEnable);
        checkMusic = findViewById(R.id.checkMusic);
        checkSports = findViewById(R.id.checkSports);
        checkReading = findViewById(R.id.checkReading);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {

            // Gender
            int selectedId = radioGroup.getCheckedRadioButtonId();
            String gender = "Not Selected";

            if (selectedId != -1) {
                RadioButton rb = findViewById(selectedId);
                gender = rb.getText().toString();
            }

            // Switch
            String status = switchEnable.isChecked() ? "Enabled" : "Disabled";

            // Checkboxes
            String hobbies = "";
            if (checkMusic.isChecked()) hobbies += "Music ";
            if (checkSports.isChecked()) hobbies += "Sports ";
            if (checkReading.isChecked()) hobbies += "Reading ";

            // Show result
            String result = "Gender: " + gender +
                    "\nStatus: " + status +
                    "\nHobbies: " + hobbies;

            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });
    }
}