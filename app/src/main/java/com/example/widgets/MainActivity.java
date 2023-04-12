package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout layout = findViewById(R.id.layout);

        List<Integer> colors = new LinkedList<>();
        colors.add(getResources().getColor(R.color.red));
        colors.add(getResources().getColor(R.color.orange));
        colors.add(getResources().getColor(R.color.yellow));
        colors.add(getResources().getColor(R.color.green));
        colors.add(getResources().getColor(R.color.blue));
        colors.add(getResources().getColor(R.color.purple));
        colors.add(getResources().getColor(R.color.pink));
        final ListIterator<Integer> colorsIter = colors.listIterator();
        colorsIter.next();

        final Button button_next = findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorsIter.hasNext()) {
                    int color = colorsIter.next();
                    ColorDrawable background = (ColorDrawable) layout.getBackground();
                    if (color == background.getColor()) {
                        onClick(button_next);
                    } else {
                        layout.setBackgroundColor(color);
                    }
                }
            }
        });

        final Button button_prev = findViewById(R.id.button_previous);
        button_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (colorsIter.hasPrevious()) {
                    int color = colorsIter.previous();
                    ColorDrawable background = (ColorDrawable) layout.getBackground();
                    if (color == background.getColor()) {
                        onClick(button_prev);
                    } else {
                        layout.setBackgroundColor(color);
                    }
                }
            }
        });
    }
}
