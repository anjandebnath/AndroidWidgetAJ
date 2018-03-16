package com.example.user06.androidwidgetaj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setResult(RESULT_CANCELED);


        /**
         * Simple Widget
         */
        //setContentView(R.layout.activity_main);
        // N.B: to run this just open new_app_widget_info.xml
        // then find android: configure
        // remove that and run

        /**
         * Broadcast Widget
         */
        //setContentView(R.layout.activity_main);


        /**
         * Configure Widget
         */
        //setContentView(R.layout.activity_main);

        //N.B: to run this configuration just open new_app_widget_info.xml
        //then find android:configure
        // and paste this com.example.user06.androidwidgetaj.ConfigurableWidgetConfigureActivity


        /**
         * Updating Widget
         */
        //setContentView(R.layout.activity_main);
        // N.B: change meta-data of NewAppWidget receiver
        // to updating_widget_info
    }
}
