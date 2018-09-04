package com.example.dell.mymomtimer;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView timer=findViewById(R.id.textView2);
        final TextView result=findViewById(R.id.textView3);

        new CountDownTimer(10000,1000)
        {
            public void onTick(long milliSecondUntilDone)
            {
                timer.setText("Timer: "+String.valueOf(milliSecondUntilDone/1000));
            }
            public void onFinish()
            {
                result.setText("DONE !!!!");
            }
        }.start();


    }
}
