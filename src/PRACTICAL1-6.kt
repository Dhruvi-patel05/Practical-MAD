fun main(){
    var a1=readln().toInt()
    var a2=readln().toInt()
    println(add(a1,a2))
    println(sub(a1,a2))
    println(mul(a1,a2))
    println(div(a1,a2))
}
fun add(a1: Int, a2:Int): Int{
    return a1 +a2
}
fun sub(a1:Int,a2:Int):Int{
    return a1 -a2
}
fun mul(a1:Int,a2:Int):Int{
    return a1 * a2
}
fun div(a1:Int,a2:Int):Int{
    return a1 / a2
}