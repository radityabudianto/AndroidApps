package com.rtsp;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
//import android.os.Bundle;
import android.os.Environment;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
	 
    Button button;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_main.xml
        setContentView(R.layout.activity_main);
 
        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.MyButton);
 
        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
 
                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        VideoViewActivity.class);
                startActivity(myIntent);
            }
        });
    }
 
}