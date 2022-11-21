package pablobruixolanavarro.ejercicio1examen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import pablobruixolanavarro.ejercicio1examen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private  ArrayList<Integer>tempList;

    private int temp;
    private int tiempo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn150temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 temp = 150;
                binding.lbTemp.setText(String.valueOf(temp));
            }
        });
        binding.btn300Temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 temp = 300;
                binding.lbTemp.setText(String.valueOf(temp));
            }
        });
        binding.btn600Temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 temp = 600;
                binding.lbTemp.setText(String.valueOf(temp));
            }
        });
        binding.btn900Temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 temp = 900;
                binding.lbTemp.setText(String.valueOf(temp));
            }
        });
        binding.btn30seg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tiempo = 30;
                binding.lbTiempo.setText(tiempo+"seg");
            }
        });
        binding.btn1min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 tiempo = 1;
                binding.lbTiempo.setText(String.valueOf(tiempo));
            }
        });
        binding.btn5min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 tiempo = 5;
                binding.lbTiempo.setText(String.valueOf(tiempo));
            }
        });
        binding.btn15min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 tiempo = 15;
                binding.lbTiempo.setText(String.valueOf(tiempo));
            }
        });
        binding.btn30min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 tiempo = 30;
                binding.lbTiempo.setText(String.valueOf(tiempo));
            }
        });

        actualizar();
    }

    private void actualizar(){
        binding.lbTiempo.setText(String.valueOf(tiempo));
        binding.lbTemp.setText(String.valueOf(temp));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("temp", temp);
        outState.putInt("tiempo", tiempo);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        temp = savedInstanceState.getInt("temp");
        tiempo = savedInstanceState.getInt("tiempo");
        actualizar();
    }
    
    
}