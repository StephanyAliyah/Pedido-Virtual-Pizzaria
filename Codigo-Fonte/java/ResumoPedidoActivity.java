package br.com.pizzaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.graphics.Insets;

import java.util.ArrayList;

public class ResumoPedidoActivity extends AppCompatActivity {

    // TextView que exibirá o resumo do pedido
    TextView textResumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pedido); // Define o layout da tela

        // Conecta o TextView com o componente do layout
        textResumo = findViewById(R.id.textResumo);

        // Recupera os dados enviados pela tela anterior (TamanhoPagamentoActivity)
        ArrayList<String> pizzas = getIntent().getStringArrayListExtra("pizzas");
        String tamanho = getIntent().getStringExtra("tamanho");
        String pagamento = getIntent().getStringExtra("pagamento");
        int valor = getIntent().getIntExtra("valor", 0);

        // Cria a string do resumo com as informações do pedido
        String resumo = "Pizzas Selecionadas:\n";

        // Adiciona cada pizza selecionada à string
        for (String pizza : pizzas) {
            resumo += "- " + pizza + "\n";
        }

        // Adiciona tamanho, forma de pagamento e valor total
        resumo += "\nTamanho: " + tamanho;
        resumo += "\nPagamento: " + pagamento;
        resumo += "\nValor Total: R$" + valor;

        // Exibe o resumo no TextView
        textResumo.setText(resumo);

        // Ajusta o layout para não ficar escondido atrás da barra de status ou navegação
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Metodo chamado ao clicar no botão "Voltar ao Início"
    public void voltarInicio(View view) {
        // Cria uma intent para voltar para a tela principal (MainActivity)
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // Finaliza a activity atual para impedir o retorno com o botão "Voltar"
    }
}

