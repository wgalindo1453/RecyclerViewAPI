package com.example.recyclerviewapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.recyclerviewapi.MainActivity.EXTRA_EVENT_NAME;
import static com.example.recyclerviewapi.MainActivity.EXTRA_EVENT_TYPE;
import static com.example.recyclerviewapi.MainActivity.EXTRA_URL;

public class EventDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra(EXTRA_URL);
        String eventName = intent.getStringExtra(EXTRA_EVENT_NAME);
        String eventType = intent.getStringExtra(EXTRA_EVENT_TYPE);

        ImageView imageView = findViewById(R.id.image_view_detail);
        TextView textviewEventName = findViewById(R.id.text_view_event_name);
        TextView textviewEventType = findViewById(R.id.text_view_event_desc);

        Picasso.with(this).load(imageUrl).fit().centerInside().into(imageView);
        textviewEventName.setText(eventName);
        textviewEventType.setText("Info: " + eventType);
    }
}