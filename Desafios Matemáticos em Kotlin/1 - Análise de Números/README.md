# **Desafios Matemáticos em Kotlin**

## Desafio - **1** **/** **3** **-** **Análise de Números**

Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

## Entrada

Você receberá 5 valores inteiros.

## Saída

Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

 

| Exemplos de Entrada | Exemplos de Saída       |
| ------------------- | ----------------------- |
| -5                  | 3 valor(es) par(es)     |
| 0                   | 2 valor(es) impar(es)   |
| -3                  | 1 valor(es) positivo(s) |
| -4                  | 3 valor(es) negativo(s) |
| 12                  |                         |



<hr />

<h4 align="left">Solução</h4>

```kotlin
fun main(args: Array<String>) {

 val inteiros = mutableListOf<Int>()
 val pares = mutableListOf<Int>()
 val impares = mutableListOf<Int>()
 val positivos = mutableListOf<Int>()
 val negativos = mutableListOf<Int>()

//continue declarando as variaveis
  
 for (i in 1..5) { inteiros.add(readLine()!!.toInt()) }
 for (i in inteiros) { if ( (i%2)==0  ) { pares.add(i) } }
 for (i in inteiros) { if ( (i%2)!=0 ) { impares.add(i) } }
 for (i in inteiros) { if ( i>0 ) { positivos.add(i) } }
 for (i in inteiros) { if ( i<0 ) { negativos.add(i) } }

 println("${pares.size} valor(es) par(es)")
 println("${impares.size} valor(es) impar(es)")
 println("${positivos.size} valor(es) positivo(s)")
 println("${negativos.size} valor(es) negativo(s)")

}
```

