## Desafio de Código — DIO
### Simulação de Conta Bancária
O módulo de Sintaxe Java do curso de Back-end com Java da DIO, em parceria com o Santander, propôs aos alunos o desenvolvimento de uma conta bancária, a fim de exercitar os conteúdos apresentados ao longo do módulo. Abaixo estão as instruções fornecidas pelo instrutor.

### Instruções
Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

###### Revise sobre regras de declaração de variáveis

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48


###### Revise sobre terminal, main args e a classe Scanner
2. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

* Programa: "Por favor, digite o número da Agência !"
* Usuário: 1021 *(depois ENTER para o próximo campo)* 

###### Revise sobre concatenação e classe String com método concat

3. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.

## Vídeo do Código em Execução
https://github.com/brunarossato/desafio-de-codigo-dio/assets/168563857/c72f7d27-4f7d-4f52-8930-7c2f6ba6a3f8

Na primeira utilização, o usuário preenche seus dados, cria a conta e em seguida solicita um saque, tendo seu valor de saldo alterado conforme o desconto após o saque. Na segunda interação com o terminal, o usuário tenta sacar um valor maior do que o saldo, retornando a mensagem de saldo insuficiente. Por fim, o usuário interage optando por não realizar o saque e o sistema exibe uma mensagem informando que a solicitação de saque foi interrompida. 

## Ferramentas
- ``Java``
- ``VS Code``

## Acesse o Código
Você pode acessar o código fonte [clicando aqui](https://github.com/brunarossato/desafio-de-codigo-dio/tree/main/conta-banco).
