package com.example.word;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Word apple;
    LinearLayout container;

    TextView nameTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (LinearLayout)findViewById(R.id.container);

        nameTextview = new TextView(getApplicationContext());

        apple = new Word(R.drawable.ic_launcher_background,"リンゴ");

        nameTextview.setText(apple.name);

        nameTextview.setTextColor(Color.rgb(0,0,0));

        container.addView(nameTextview);

        LinearLayout layout = new LinearLayout(this.getApplicationContext());

        layout.setOrientation(LinearLayout.HORIZONTAL);

        ImageView = new  ImageView(this);

        imageView.setImageResource(apple.resId);

        layout.addView(imageView);
        layout.addView(nameTextview);

        container.addView(layout);
    }
}
