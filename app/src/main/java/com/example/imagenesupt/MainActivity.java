package com.example.imagenesupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void miimageloader(View view) {
    startActivity(new Intent(this,MiImageLoader.class));
  }

  public void mipicasso(View view) {
    startActivity(new Intent(this,MiPicasso.class));
  }
}
