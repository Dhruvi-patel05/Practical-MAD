fun factorial(n: Int): Long {
    var fact = 1L
    for (i in 1..n) {
        fact *= i
    }
    return fact
}

tailrec fun tailFactorial(n: Int, acc: Long = 1): Long {
    return if (n <= 1) acc
    else tailFactorial(n - 1, acc * n)
}

fun main() {
    print("Enter Number: ")
    val num = readLine()!!.toInt()

    println("Factorial of $num = ${factorial(num)}")
}