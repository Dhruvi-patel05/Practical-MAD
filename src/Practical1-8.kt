fun main() {

    val arr1 = arrayOf(10, 90, 60, 80, 100)
    println("Create Array by using arrayOf() method:")
    println(arr1.contentToString())

    val arr2 = Array(5) { 0 }
    println("\nCreate Array by using Array<>:")
    println(arr2.contentToString())

    val arr3 = Array(8) { it }
    println("\nCreate Array by using Array<> and lambda function:")
    println(arr3.contentToString())

    val arr4 = IntArray(5)
    println("\nCreate Array by using IntArray():")
    println(arr4.joinToString(", "))

    val arr5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("\nCreate Array by using intArrayOf():")
    println(arr5.joinToString(", "))

    val arr6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("\nCreate 2D Array by using arrayOf() and intArrayOf():")
    println(arr6.contentDeepToString())

    val a = IntArray(5)
    println("\nPlease enter Array Value:")
    for (i in a.indices) {
        print("a[$i]=")
        a[i] = readLine()!!.toInt()
    }
    println("\nEntered Array:")
    println(a.contentToString())
    val builtInSorted = a.copyOf()
    builtInSorted.sort()
    println("After sorting by built-in function:")
    println(builtInSorted.joinToString(", "))
    val manualSorted = a.copyOf()
    println("Before Sorting:")
    println(manualSorted.joinToString(", "))

    for (i in manualSorted.indices) {
        for (j in i + 1 until manualSorted.size) {
            if (manualSorted[i] > manualSorted[j]) {
                val temp = manualSorted[i]
                manualSorted[i] = manualSorted[j]
                manualSorted[j] = temp
            }
        }
    }

    println("\nAfter Sorting without built-in function:")
    println(manualSorted.joinToString(", "))
}