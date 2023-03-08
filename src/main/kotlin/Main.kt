fun main(){
    var car = Car("Nissan","Altima","Blue",5)
    var bus = Bus("")

    car.carry(4)
    car.carry(9)
    car.identity()
    car.calculateParkingFees(4)



}
//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy” (1 point)
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20 (1 point)

class  Car (var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x = people-capacity
        if (people >= capacity)
        println("Carrying $people passengers")
       if (people<= capacity)
            println("Over capacity by $x people")
    }
    fun identity(){
        println("I am a $color ,$make ,$model")
    }

    open fun calculateParkingFees(hours:Int):Int{
        var fees = hours * 20
        return fees

    }
}

//2. Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus (3 points)
//
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.

class Bus( make:String, model:String, color:String, capacity:Int):Car (make,model,color,capacity){
    fun maxTripFare(fare:Double ,people: Int):Double{
        var maxFare = fare * people
        return fare
    }

    override fun calculateParkingFees(hours: Int , people: Int): Int {
        return super.calculateParkingFees(hours)
        var output = hours * people
        return output

    }


}