fun main() {
    val intValue: Int = 10
    println("Integer Value:$intValue")
    val doubleFromInt: Double = intValue.toDouble()
    println("Double Value (From Integer):$doubleFromInt")
    val stringValue: String = intValue.toString()
    println("String Value:$stringValue")
    val intValue1: Int = stringValue.toInt()
    println("Integer Value1 (From String):$intValue1")
    val intValue2: Int = "10".toInt()
    println("Integer Value2 (From String):$intValue2")
    val doubleValue: Double = "11.12".toDouble()
    println("Double Value (From String):$doubleValue")
}