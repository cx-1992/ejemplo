package com.example.app_viaje;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaHotelesActivity extends AppCompatActivity {
    private ListView lista;
    private ArrayAdapter<String> adapter;
    private ArrayList<String> hotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.lista = (ListView) findViewById(R.id.listaHoteles);
        hotel = new ArrayList<String>();
        hotel.add("Restaurantes Internacionales");
        hotel.add("Bares");
        hotel.add("Cafeterias");
        hotel.add("Comida Rapida");
        hotel.add("Pizzerias");
        this.adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, hotel);
        lista.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
