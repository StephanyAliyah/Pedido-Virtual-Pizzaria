# App de Pedido Virtual Pizzaria - Android

## Descrição do Projeto:
Este aplicativo permite que o usuário selecione o **tipo de pizza**, o **tamanho** e o **método de pagamento**. O valor é calculado automaticamente e exibido junto ao resumo do pedido.

### **Principais Funcionalidades:**
- Seleção de pizzas com CheckBox;
- Escolha de tamanho e pagamento com RadioGroup;
- Cálculo do valor total;
- Exibição do resumo completo.

## Informações do Desenvolvedor
**Nome:** Stephany Aliyah Guimarães Eurípedes de Paula  
**Curso:** Ciência da Computação - 3° Semestre

## Processo de Desenvolvimento
Este projeto simula um fluxo de compra em uma pizzaria, permitindo ao usuário escolher o sabor, tamanho e forma de pagamento. Utiliza componentes como CheckBox, RadioGroup e TextView, junto com lógica condicional para calcular o valor total. Foi uma ótima oportunidade para praticar a navegação entre telas e o uso de dados dinâmicos no Android.

### **Desafios Superados:**
- Cálculo correto dos valores com base no tamanho da pizza;
- Envio e recepção de múltiplos dados entre Activities.

### **Decisões Estratégicas:**
- Separação clara por funcionalidades em cada tela;
- Uso de `StringBuilder` para montar pedidos compostos;
- Interface clara e objetiva.

## Como Executar o Aplicativo
1. **Baixar o APK**: [Download do APK](./app-debug.apk)  Ou ir na pasta src.
2. Transferir o arquivo para um dispositivo Android.
3. Instalar e abrir o aplicativo.
4. Inserir os dados solicitados (altura e peso) e obter o resultado do IMC.

## Estrutura do Repositório
```
Pizzaria/
├── app-debug.apk    # Arquivo compilado do aplicativo
├── projeto.zip      # Código-fonte do projeto(pasta src/Pizzaria.zip)
├── README.md        # Documentação do projeto
```

## Tecnologias Utilizadas
- **Java** para a lógica de programação (linguagem utilizada);
- **Android Studio** como ambiente de desenvolvimento;
