package com.example.disenoboton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.disenoboton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(view -> Toast.makeText(this,"Boton 1 selecionado", Toast.LENGTH_SHORT).show());
        binding.btn2.setOnClickListener(view -> Toast.makeText(this,"Boton 2 selecionado", Toast.LENGTH_SHORT).show());
        binding.btn3.setOnClickListener(view -> Toast.makeText(this,"Boton 3 selecionado", Toast.LENGTH_SHORT).show());
        binding.btn4.setOnClickListener(view -> Toast.makeText(this,"Boton 4 selecionado", Toast.LENGTH_SHORT).show());
        binding.btn5.setOnClickListener(view -> Toast.makeText(this,"Boton 5 selecionado", Toast.LENGTH_SHORT).show());
        binding.btn6.setOnClickListener(view -> Toast.makeText(this,"Boton 6 selecionado", Toast.LENGTH_SHORT).show());

        /*
        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Boton1 selecionado", Toast.LENGTH_SHORT).show();
            }
        });
        */

    }
}