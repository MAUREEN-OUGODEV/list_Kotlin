fun main() {
println(numberEven(listOf("cat","dog","leg","rabbit","mouse","mat","hat","horn","man","kin","don")))
   println(peopleHeight(listOf(20.0,10.0,10.6)))
    listAddition(listOf())

    var person5=Person("Fabian",34,20.0,65.0 )
    var person6=Person("Otieno",33,30.0,70.0 )
var adding = mutableListOf(person5,person6)
    println()

println()
    var mazda = Car("KCB789T",512)
    var note = Car("KCB678T",560)
    var nissan = Car("KCB342T",420)
    var cars = listOf(mazda,note,nissan)
    println(mileage(cars))
    ageCalculation()



}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)

fun numberEven(item:List<String>):String{

    var list = item.filterIndexed{index, item-> index%2==0}




    return list.toString()


}


//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)

data class HeightPeople(var avheight: Double,var tweight: Double)
fun peopleHeight(number:List<Double>):HeightPeople{
    var average = number.average()
    var sum = number.sum()
    var results = HeightPeople(average,sum)
    return results
}


//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
 data  class Person (var name: String,var age: Int,var height:Double,var weight:Double)
  fun ageCalculation(){
    var person1 = Person("Maureen",20,30.0,52.0)
    var person2 = Person("Akinyi",23,30.0,52.0)
    var person3= Person("Ougo",24,30.0,52.0)
    var person4 = Person("Faith",17,30.0,52.0)
    var ageDescending = mutableListOf(person1,person2,person3,person4)

    var sorting = ageDescending.sortedByDescending { person -> person.age }

    println(sorting)


}



//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
fun listAddition(people:List<Person>):List<Any>{


return listOf()
}

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list. (3)
data class Car(var registration: String,var mileage: Int)
fun mileage(mile:List<Car>):Int {
var fir = 0
    mile.forEach {item ->item.mileage
    fir+=item.mileage
    }
    var total=fir/mile.count()
    return total

}