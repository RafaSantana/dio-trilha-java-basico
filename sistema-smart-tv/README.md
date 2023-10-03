# Exercitando - Criar uma classe SmartTV

Vamos criar um exemplo de uma classe para representar uma SmartTV onde:

1. Ela tenha as características: ligada (boolean), canal (int) e volume (int);
1. Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
1. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
1. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.

## SmartTV

Este é um exemplo de uma classe para representar uma SmartTV. A classe possui as seguintes características:

- `ligada` (boolean): indica se a TV está ligada ou desligada.
- `canal` (int): indica o canal atual da TV.
- `volume` (int): indica o volume atual da TV.

A classe possui os seguintes métodos:

- `ligarTv()`: liga a TV.
- `desligarTv()`: desliga a TV.
- `aumentarVolume()`: aumenta o volume em 1.
- `diminuirVolume()`: diminui o volume em 1.
- `mudarCanal(int novoCanal)`: muda o canal para o número especificado.
- `aumentarCanal()`: aumenta o canal em 1.
- `diminuirCanal()`: diminui o canal em 1.

## Melhorias no código

- Realizamos algumas verificações nos métodos para garantir o funcionamento correto.
- Criamos testes para tornar a validações mais rápidas.

## Como usar

1. Clone este repositório.
2. Abra o projeto em sua IDE preferida.
3. Execute o arquivo `SmartTvTest.java` para executar os testes.
4. Use a classe `SmartTv` em seu próprio código para controlar uma SmartTV.
