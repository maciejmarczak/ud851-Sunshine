package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherSummaryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherSummaryTextView = (TextView) findViewById(R.id.tv_weather_summary);

        final Intent intent = getIntent();

        if (intent.hasExtra(Intent.EXTRA_TEXT)) {
            final String extraText = intent.getStringExtra(Intent.EXTRA_TEXT);
            mWeatherSummaryTextView.setText(extraText);
        }
    }
}