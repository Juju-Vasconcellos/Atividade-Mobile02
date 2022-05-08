package br.com.julieta.ativodade02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText quantidade;
    private Button btComprar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //Removi a barra da Activity
        setContentView(R.layout.activity_main);
        quantidade = findViewById(R.id.etQnt);
        btComprar = findViewById(R.id.btComprar);
        btComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String qTnd = quantidade.getText().toString();
                if(!qTnd.isEmpty()){ //Não pode ficar vazio
                    int q = Integer.valueOf(qTnd); //transformar em int
                    double valor = (q * 15.9);
                    Intent intent = new Intent(getApplicationContext(),PedidoActivity.class);
                    intent.putExtra("valorTotal", valor);
                    startActivity(intent); // Muda de uma tela para outro , ela starta a próxima tela
                }
            }
        });
    }
}