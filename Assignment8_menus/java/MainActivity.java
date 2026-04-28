package com.example.assignment8;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnOption, btnContext, btnPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOption = findViewById(R.id.btnOption);
        btnContext = findViewById(R.id.btnContext);
        btnPopup = findViewById(R.id.btnPopup);

        // Register context menu for button
        registerForContextMenu(btnContext);

        // OPTION MENU (shown manually using PopupMenu style)
        btnOption.setOnClickListener(v -> {
            PopupMenu optionMenu = new PopupMenu(this, btnOption);
            optionMenu.getMenuInflater().inflate(R.menu.menu_main, optionMenu.getMenu());

            optionMenu.setOnMenuItemClickListener(item -> {
                Toast.makeText(this, "Option: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            });

            optionMenu.show();
        });

        // CONTEXT MENU (long press normally, but we force show)
        btnContext.setOnClickListener(v -> openContextMenu(btnContext));

        // POPUP MENU
        btnPopup.setOnClickListener(v -> {
            PopupMenu popup = new PopupMenu(this, btnPopup);
            popup.getMenuInflater().inflate(R.menu.menu_popup, popup.getMenu());

            popup.setOnMenuItemClickListener(item -> {
                Toast.makeText(this, "Popup: " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            });

            popup.show();
        });
    }

    // Context Menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, "Context: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}