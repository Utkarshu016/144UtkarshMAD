package com.example.collegelabs;

import android.content.Context;
import android.view.*;
import android.widget.*;

public class ImageAdapter extends BaseAdapter {

    Context context;

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

    String[] labNames = {
            "Advanced System",
            "C++ Lab",
            "Database Lab",
            "Java Lab",
            "Project Lab",
            "Python Lab",
            "Research Lab",
            "R Programming",
            "Web Lab"
    };

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.labImage);
        TextView textView = convertView.findViewById(R.id.labName);

        imageView.setImageResource(images[position]);
        textView.setText(labNames[position]);

        return convertView;
    }
}