package com.google.firebase.broadcastsender;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  private final static String TAG = "FCM-BROADCAST";
  private final static String ACTION = "com.google.android.yizhaoh.broadcast.test";
  private final static String PACKAGE_NAME = "com.google.firebase.broadcast_test";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void sendBroadcastButtonClicked(View v) {
    for (int i=1; i<=1000; i++) {
      long timeMillis = System.currentTimeMillis();
      Intent intent = new Intent(ACTION);
      intent.setPackage(PACKAGE_NAME);
      intent.putExtra("time", timeMillis);
      intent.putExtra("index", i);
      sendBroadcast(intent);
    }
  }
}