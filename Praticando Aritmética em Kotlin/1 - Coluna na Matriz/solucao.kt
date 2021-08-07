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