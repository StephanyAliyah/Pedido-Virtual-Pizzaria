package br.com.pizzaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;

import java.util.ArrayList;

public class TamanhoPagamentoActivity extends AppCompatActivity {

    // Declaração dos RadioGroups para seleção de tamanho e forma de pagamento
    RadioGroup rgTamanho, rgPagamento;

    // Lista que receberá os sabores de pizza escolhidos anteriormente
    ArrayList<String> pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamanho_pagamento); // Define o layout da tela

        // Conecta os RadioGroups aos componentes do layout
        rgTamanho = findViewById(R.id.rgTamanho);
        rgPagamento = findViewById(R.id.rgPagamento);

        // Recupera a lista de pizzas selecionadas enviada pela MainActivity
        pizzas = getIntent().getStringArrayListExtra("pizzas");

        // Ajusta o layout para respeitar as barras do sistema (status e navegação)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Metodo chamado ao clicar no botão "Confirmar Pedido"
    public void confirmarPedido(View view) {
        // Obtém os IDs dos RadioButtons selecionados
        int selectedTamanhoId = rgTamanho.getCheckedRadioButtonId();
        int selectedPagamentoId = rgPagamento.getCheckedRadioButtonId();

        // Se algum dos dois não estiver selecionado, não faz nada
        if (selectedTamanhoId == -1 || selectedPagamentoId == -1) return;

        // Recupera os RadioButtons selecionados
        RadioButton rbTamanho = findViewById(selectedTamanhoId);
        RadioButton rbPagamento = findViewById(selectedPagamentoId);

        // Obtém os textos (valores) selecionados
        String tamanho = rbTamanho.getText().toString();
        String pagamento = rbPagamento.getText().toString();

        // Define o valor unitário da pizza com base no tamanho
        int valorUnitario = 0;
        if (tamanho.contains("Pequena")) valorUnitario = 20;
        else if (tamanho.contains("Média")) valorUnitario = 30;
        else if (tamanho.contains("Grande")) valorUnitario = 40;

        // Calcula o valor total com base na quantidade de pizzas
        int total = valorUnitario * pizzas.size();

        // Cria a intent para abrir a tela de resumo
        Intent intent = new Intent(this, ResumoPedidoActivity.class);
        intent.putStringArrayListExtra("pizzas", pizzas);
        intent.putExtra("tamanho", tamanho);
        intent.putExtra("pagamento", pagamento);
        intent.putExtra("valor", total);

        // Inicia a próxima activity
        startActivity(intent);
    }
}

