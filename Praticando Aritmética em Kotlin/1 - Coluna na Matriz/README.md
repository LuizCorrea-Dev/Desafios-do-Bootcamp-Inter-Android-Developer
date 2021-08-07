# **Praticando Aritmética em Kotlin**

## Desafio - **1** **/** 5 **-** **Coluna na Matriz**

Neste problema você deve ler um número que indica uma coluna de uma matriz na qual uma operação deve ser realizada, um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma matriz **M**[12] [12]. Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 5 para a coluna da matriz, demonstrando os elementos que deverão ser considerados na operação.

![img](https://resources.urionlinejudge.com.br/gallery/images/problems/UOJ_1182.png)

## Entrada

A primeira linha de entrada contem um número **C** (0 ≤ **C** ≤ 11) indicando a coluna que será considerada para operação. A segunda linha de entrada contém um único caractere Maiúsculo **T** ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

## Saída

Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

 

| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 5                   | 12.6              |
| S                   |                   |
| 0.0                 |                   |
| -3.5                |                   |
| 4.1                 |                   |
| ...                 |                   |



<hr />

<h4 align="left">Solução</h4>

```kotlin
fun main(args: Array<String>) {
   
    val leitor = Scanner(System.`in`)

    val C: Int = leitor.nextInt()
    var sum = 0.0
    val T: Char = leitor.next().toUpperCase().charAt(0)
    val M = Array(12) {DoubleArray(12)}
    
    for (i in M.indices) {
        for (j in 0 until M[i].length) {
            M[i][j] = leitor.nextDouble()
        }
    }
    for (j in M.indices) {
        sum += M[C][j]
    }
    if (T == 'M') sum /= M.size.toDouble()
    println(String.format("%.1f", sum))
```

