package com.example.trabajopractico_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class ModoAvion extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean avion = intent.getBooleanExtra("state",false);

        if(avion){
            Toast.makeText(context, "El Modo Avion se activo", Toast.LENGTH_LONG).show();
            Intent llamada = new Intent(Intent.ACTION_DIAL);
            llamada.setData(Uri.parse("tel:2664553747"));
            llamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(llamada);
        }else {
            Toast.makeText(context, "El Modo Avion se desactivo", Toast.LENGTH_LONG).show();

        }
    }
}