package com.example.imagenesupt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class MiPicasso extends AppCompatActivity {
  ImageView miimagen;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mi_picasso);
    miimagen=findViewById(R.id.miimagen2);
    //Picasso.with(this).invalidate("https://testand1.000webhostapp.com/mifoto.jpg");
    Picasso.with(this).load("https://fagsgs.000webhostapp.com/upt/mifoto.jpg")
            //SIEMPRE ESTARA CARGANDO
            /*.memoryPolicy(MemoryPolicy.NO_CACHE)
            .networkPolicy(NetworkPolicy.NO_CACHE)*/

            //.placeholder(R.drawable.cargando)
            .error(R.mipmap.ic_launcher)
            .into(miimagen, new com.squareup.picasso.Callback() {
              @Override
              public void onSuccess() {
                Toast.makeText(MiPicasso.this, "Carga exitosa", Toast.LENGTH_SHORT).show();
              }
              @Override
              public void onError() {
                Toast.makeText(MiPicasso.this, "Ocurrio un error en la descarga", Toast.LENGTH_SHORT).show();
              }
            });
  }

  public void invalidar(View view) {
    Picasso.with(this).invalidate("https://testand1.000webhostapp.com/mifoto.jpg");
  }
}
