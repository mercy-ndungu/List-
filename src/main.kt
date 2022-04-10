import javax.management.MBeanRegistration

/*Given a list of 10 strings, write a function that returns a list of the strings
at even indices i.e index 2,4,6 etc*/
//create a function and declare its a list and it will return a list//
/*Given a list of Person objects, each with the attributes, name, age,
height and weight. Sort the list in order of descending age*/
//create my variables that will be in my list//
/*Given a list similar to the one above, write a function in which you will
create 2 more people objects and add them to the list at one go.*/
/*Write a function that takes in a list of Car objects each with a
registration and mileage attribute and returns the average mileage of
all the vehicles in the list.*/
fun main() {
var myNameList = myNames(listOf("Mercy","Faith","Grace","Charles","Lewis","Meek","Victor","Miriam","Fiona","Shemy"))
    var tall = myHeight(listOf(10,11,12,13,14,15))
    println(tall)
    var x = Person("Cate", 23, 55, 60)
    var y = Person("Natalie", 18, 45, 55)
    var z = Person("Ein", 24, 30, 44)
    var b = Person("Nicky", 26, 56, 63)
    var myListPerson = mutableListOf(x,y,z,b)
    var peeps = myListPerson.sortedByDescending {person -> person.age}
    println(peeps)

   var e = Person("Ndungu", 55, 45, 82)
    var f = Person("Wambugu", 54, 43, 81)
    var fullList = mutableListOf(e,f)
println(fullList.plus(myListPerson))


    var subaru = Vehicle("KBZ107L",23)
    var jeep = Vehicle("KCD230P",45)
    var mustang = Vehicle("KVT184D",34)
    var range = Vehicle("KJS345M",21)
    var locomotive = listOf(subaru, jeep, mustang, range)
    println(myVehicle(locomotive))
}


fun myNames(names: List<String>): List<String>{
    names.forEachIndexed { index, s ->
        if (index%2==0){
            println(s)
        }
    }
   return names
}



fun myHeight(height: List<Int>): String{
    var addition = height.sum()
    var average = height.average()
    var both = "$addition, $average"

    return both

    }
/*Given a list of Person objects, each with the attributes, name, age,
height and weight. Sort the list in order of descending age*/
/*create a data class*/
data class Person(var names: String, var age: Int, var height:Int, var weight: Int){

}
/*Given a list similar to the one above, write a function in which you will
create 2 more people objects and add them to the list at one go.*/
fun Individual(people2:List<Person>): List<Any>{

return listOf()
}
/*number 5*/
data class Vehicle(var registration: String, var mileage: Int, ){

}
fun myVehicle(cab:List<Vehicle>):Int{
    var y = 0
    cab.forEach { x -> x.mileage
        y+=x.mileage

    }
    var total = y/cab.count()
return total
    }








