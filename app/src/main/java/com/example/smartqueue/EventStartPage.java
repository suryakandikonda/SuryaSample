package com.example.smartqueue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class EventStartPage extends AppCompatActivity {

    TextView eventName;
    String eventNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_start_page);


    }

    public void selectEventLocation(View view) {

        eventName = (TextView)findViewById(R.id.eventNameXML);
        eventNameString = eventName.getText().toString();
        Toast.makeText(this, ""+eventNameString, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("eventName",eventNameString);
        startActivity(intent);

    }
}
