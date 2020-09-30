package com.example.objetointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText nome,sobrenome;
Button btProxima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome=findViewById(R.id.editTextNome);
        sobrenome=findViewById(R.id.editTextSobrenome);
        btProxima=findViewById(R.id.buttonProxima);


        btProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it =new Intent (getApplicationContext(),Resultado.class);

                Pessoa p= new Pessoa();
                p.setNome(nome.getText().toString());
                p.setSobrenome(sobrenome.getText().toString());
                // atribuindo o objeto a intent
                it.putExtra("pessoa",p);

                //chama a outra activity

                startActivity(it);
            }
        });
    }
}