fun main(args: Array<String>) {

    val v = readLine()!!.toInt()
    val a = IntArray(10).toMutableList()

    for (i in 0 until a.size) { a[i] = if(i == 0) v else a[i-1] * 2 }
    
    for (k in 0 until a.size) { println("N[$k] = ${a[k]}") }    
}