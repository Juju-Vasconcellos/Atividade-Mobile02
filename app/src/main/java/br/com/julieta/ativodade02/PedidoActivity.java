package br.com.julieta.ativodade02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PedidoActivity extends AppCompatActivity {
    private TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        getSupportActionBar().hide(); //Removi a barra da Activity
        double valor = getIntent().getDoubleExtra("valorTotal",0);
        tvTotal = findViewById(R.id.tvValorFinal); // associar variável com componente
        tvTotal.setText(tvTotal.getText() + " " + valor);

    }
}