import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);

    //continue o código

    var H: Double = leitor.nextDouble();
    var P: Double = leitor.nextDouble();
  
    var media: Double= ( H / P);

    println(String.format("%.2f", media));
}