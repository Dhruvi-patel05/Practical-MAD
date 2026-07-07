fun main(){
    val a = IntArray(5)
    println("\nPlease enter Array Value:")
    for (i in a.indices) {
        print("a[$i]=")
        a[i] = readLine()!!.toInt()
    }
    val max= a.max()
    println("Maximum number:" +max)
}