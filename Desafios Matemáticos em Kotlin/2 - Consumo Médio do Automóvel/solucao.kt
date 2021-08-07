import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);

    //continue o código

    var dist: Double = leitor.nextDouble();
    var cons: Double = leitor.nextDouble();
  
    var mediaConsumo: Double= ( dist / cons);

    println(String.format("%.3f km/l", mediaConsumo));
}