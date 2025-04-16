package br.com.pizzaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Declaração dos checkboxes usados para selecionar sabores de pizza
    CheckBox cbCalabresa, cbMarguerita, cbPortuguesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Define o layout da tela

        // Associa os checkboxes aos elementos do layout
        cbCalabresa = findViewById(R.id.cbCalabresa);
        cbMarguerita = findViewById(R.id.cbMarguerita);
        cbPortuguesa = findViewById(R.id.cbPortuguesa);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Metodo chamado quando o botão "Avançar" (ou similar) é pressionado
    public void enviar(View view) {
        // Lista para armazenar os sabores selecionados
        ArrayList<String> pizzasSelecionadas = new ArrayList<>();

        // Verifica quais checkboxes foram marcados e adiciona à lista
        if (cbCalabresa.isChecked()) pizzasSelecionadas.add("Calabresa");
        if (cbMarguerita.isChecked()) pizzasSelecionadas.add("Marguerita");
        if (cbPortuguesa.isChecked()) pizzasSelecionadas.add("Portuguesa");

        // Verifica se pelo menos um checkbox foi selecionado
        if (pizzasSelecionadas.isEmpty()) {
            // Nenhuma pizza foi selecionada, não faz nada
            return;
        }

        // Cria uma intent para abrir a próxima tela (TamanhoPagamentoActivity)
        Intent intent = new Intent(this, TamanhoPagamentoActivity.class);

        // Envia a lista de pizzas selecionadas para a próxima tela
        intent.putStringArrayListExtra("pizzas", pizzasSelecionadas);

        // Inicia a próxima Activity
        startActivity(intent);
    }
}
