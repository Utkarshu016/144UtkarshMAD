package com.example.collegelabs;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    int[] images = {
            R.drawable.advancedsystemlab,
            R.drawable.cpp,
            R.drawable.databaselab,
            R.drawable.javaprog,
            R.drawable.projectlab,
            R.drawable.pythonlab,
            R.drawable.researchlab,
            R.drawable.rprogramimming,
            R.drawable.weblab
    };

    String[] descriptions = {

            "Advanced Database System Lab\n\n" +
                    "Used for Project I, Project II, Advance C Programming, System Programming and Database Engineering.\n\n" +
                    "Software: Ubuntu OS, MySQL, Atom, Brackets, GCC, g++, OpenJDK.\n\n" +
                    "Facilities:\nDell OptiPlex 5090 & 390\n6 KVA Renutron UPS\nHP LaserJet P1008 Printer",

            "C++ Programming Lab\n\n" +
                    "Used for practicals of C++ programming.\n\n" +
                    "Software: Ubuntu OS, GCC, g++.\n\n" +
                    "Facilities:\nDell OptiPlex 3020\n6 KVA Renutron UPS",

            "Database Engineering Lab\n\n" +
                    "Used for Database Engineering, Web Technology, Java Programming, mini projects and Networking.\n\n" +
                    "Software: Ubuntu OS, MySQL, MongoDB, GCC, g++, OpenJDK.\n\n" +
                    "Facilities:\nDell OptiPlex 3020\n6 KVA Rudra UPS",

            "Java Programming Lab\n\n" +
                    "Used for Advance C, Data Structures, Information Security, Compiler Construction.\n\n" +
                    "Software: Ubuntu OS, OpenJDK, GCC.\n\n" +
                    "Facilities:\nDell OptiPlex 3020\nMicroprocessor Kit\nIOT Kit\nHP LaserJet 1020\n6 KVA Rudra UPS",

            "Project Lab\n\n" +
                    "Used for Project I, Project II, Advance C, System Programming and Database Engineering.\n\n" +
                    "Software: Ubuntu OS, MySQL, Atom, Brackets, GCC, g++, OpenJDK.\n\n" +
                    "Facilities:\nDell OptiPlex 5090 & 390\n6 KVA Renutron UPS\nHP LaserJet P1008",

            "Python Programming Lab\n\n" +
                    "Used for Compiler Construction, BDA, OS, Database Engineering.\n\n" +
                    "Software: Ubuntu OS, PyCharm, Atom, Brackets, GCC, g++, OpenJDK.\n\n" +
                    "Facilities:\nDell OptiPlex 3020\n6 KVA Renutron UPS\nCanon Printer",

            "Research Lab\n\n" +
                    "Used for Projects, Data Structures, Java Programming, Operating System.\n\n" +
                    "Software: Ubuntu OS, Atom, Brackets, PyCharm, MySQL, MongoDB, GCC, OpenJDK.\n\n" +
                    "Facilities:\nDell OptiPlex 390\n6 KVA Emerson UPS\nHP 1020 Printer",

            "R Programming Lab\n\n" +
                    "Used for Data Structures, Web Technology, Java Programming.\n\n" +
                    "Software: Ubuntu OS, RStudio, GCC, g++, OpenJDK.\n\n" +
                    "Facilities:\nDell OptiPlex 5090\n6 KVA Renutron UPS",

            "Web Technology Lab\n\n" +
                    "Used for Web Tech, Advance C, Java Programming and mini projects.\n\n" +
                    "Software: Ubuntu & Windows, XAMPP, WAMP, Atom, Brackets, GCC, OpenJDK.\n\n" +
                    "Facilities:\nDell OptiPlex 5090\nHP LaserJet M1522\n6 KVA Renutron UPS"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.labImage);
        textView = findViewById(R.id.labText);

        int position = getIntent().getIntExtra("lab", 0);

        imageView.setImageResource(images[position]);
        textView.setText(descriptions[position]);
    }
}