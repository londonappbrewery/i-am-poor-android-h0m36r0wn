package com.londonappbrewery.iampoor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String iAmPoor = "I am <b>poor</b>";
        tv = (TextView) findViewById(R.id.textView);
        tv.setText(Html.fromHtml(iAmPoor));
    }
}
