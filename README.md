# 🍕 App de Pedido Virtual - Pizzaria

## 📌 Descrição do Projeto
Este aplicativo Android simula um sistema de pedidos em uma pizzaria. O usuário pode escolher os **sabores da pizza** por meio de **CheckBoxes**, definir o **tamanho da pizza** e selecionar o **método de pagamento** usando **RadioButtons**. O app calcula automaticamente o valor com base no tamanho e exibe um **resumo completo** do pedido na última tela.

---

## ✅ Principais Funcionalidades
- Seleção de sabores via **CheckBox**;
- Escolha de tamanho (Pequena, Média, Grande) e forma de pagamento com **RadioGroup**;
- Cálculo automático do valor final com base no tamanho escolhido;
- Exibição de **resumo do pedido**.

---

## 👩‍💻 Informações da Desenvolvedora
**Nome:** Stephany Aliyah Guimarães Eurípedes de Paula  
**Curso:** Ciência da Computação - 3° Semestre  

---

## 🛠️ Processo de Desenvolvimento
O projeto foi estruturado em **três telas (Activities)**, cada uma com um papel específico no processo de pedido:

- **Tela 1:** Seleção de sabores (MainActivity) **CheckBox**
- **Tela 2:** Escolha de tamanho e pagamento (TamanhoPagamentoActivity) **RadioButton**
- **Tela 3:** Resumo final do pedido com valor (ResumoPedidoActivity)

Foi utilizada uma **lógica condicional** simples para calcular o valor total com base no tamanho selecionado. O envio dos dados entre telas foi feito com `Intent`, e o texto final do pedido foi montado com `ArrayList`.

---

### 🚧 Desafios Superados
- Garantir o envio correto de **múltiplos dados entre telas**;
- Evitar que o usuário avance sem selecionar opções obrigatórias;
- Cálculo dinâmico do valor com base no tamanho da pizza.

---

### 💡 Decisões Estratégicas
- Organização clara do app em três etapas, separando bem as responsabilidades;
- Utilização de **ArrayList** para construir listas de pizzas selecionadas;
- Interface limpa, orientada à usabilidade.

---

## ▶️ Como Executar o Aplicativo
1. **Baixe o APK**: [Download do APK] ou acesse a pasta `src/Pizzaria.zip`;
2. Transfira o arquivo para um dispositivo Android;
3. Instale o aplicativo;
4. Execute o app, selecione os sabores, escolha o tamanho e a forma de pagamento para visualizar o resumo.

## 📸 Imagens do Projeto
As imagens utilizadas nas telas estão disponíveis na pasta `/images`.



## 📁 Estrutura do Repositório
```
src/pizzaria.apk/zip
├── app-debug.apk       # APK compilado
├── projeto.zip         # Código-fonte do projeto
├── README.md           # Documentação do projeto
```

---

## 🧰 Tecnologias Utilizadas
- **Java** (lógica de programação);
- **Android Studio** (ambiente de desenvolvimento));
- **Componentes usados**: CheckBox, RadioGroup, Button, Intent, TextView
