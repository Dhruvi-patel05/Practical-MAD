class Car(
    var company: String,
    var year: Int,
    var owner: String,
    var milesDrive: Int,
    var Price: Double
) {
    init {
        println("Object of class is created ")
    }
    fun getCurrentPrice(): Double {
        return Price - (milesDrive * 0.5)
    }
    fun displayInformation() {
        println("\nCar Information: $company, $year")
        println("Car Owner: $owner")
        println("Miles Drive: $milesDrive")
        println("Original Car Price: $Price")
        println("Current Car Price: ${getCurrentPrice()}")
    }
}

fun main() {
    val car1 = Car("BMW", 2018, "Aman", 105, 100000.0)
    car1.displayInformation()
    val car2 = Car("BMW", 2019, "Karan", 20, 400000.0)
    car2.displayInformation()
    val carList = ArrayList<Car>()
    carList.add(Car("Toyota", 2017, "KJS", 100, 108000.0))
    carList.add(Car("Maruti", 2020, "NPP", 200, 400000.0))
    for (car in carList) {
        car.displayInformation()
    }
}