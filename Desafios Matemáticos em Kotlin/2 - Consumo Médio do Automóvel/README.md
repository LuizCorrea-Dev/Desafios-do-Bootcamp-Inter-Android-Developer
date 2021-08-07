# **Desafios Matemáticos em Kotlin**

## Desafio - **2 **/ **3** **-** **Consumo Médio do Automóvel**

Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).

## Entrada

Você receberá dois valores: um valor inteiro **X** com a distância total percorrida (em Km), e um valor real **Y** que representa o total de combustível consumido, com um dígito após o ponto decimal.

## Saída

Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l".

 

| Exemplos de Entrada | Exemplos de Saída |
| ------------------- | ----------------- |
| 500                 | 14.286 km/l       |
| 35.0                |                   |

| 2254  | 18.119 km/l |
| ----- | ----------- |
| 124.4 |             |

| 4554  | 9.802 km/l |
| ----- | ---------- |
| 464.6 |            |

<hr />

<h4 align="left">Solução</h4>

```kotlin
import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);

    //continue o código

    var dist: Double = leitor.nextDouble();
    var cons: Double = leitor.nextDouble();
  
    var mediaConsumo: Double= ( dist / cons);

    println(String.format("%.3f km/l", mediaConsumo));
}
```

