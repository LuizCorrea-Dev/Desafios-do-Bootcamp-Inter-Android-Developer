# **Praticando Aritmética em Kotlin**

## Desafio - **5** **/** 5 **-** **Exibindo Números Pares**

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

## Entrada

Você receberá 1 valor inteiro **N**, onde **N > 0**.

## Saída

Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 

 

| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 6                   | 2                 |
|                     | 4                 |
|                     | 6                 |



<hr />

<h4 align="left">Solução</h4>

```kotlin
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for (i in 2.rangeTo(n).step(2)) println(i) // insira o valor correto
}
```

