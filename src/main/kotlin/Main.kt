fun main() {
    var name = "Zoia"
    var age = 30
    //  println("My name is $name, i am $age old year")

    println(stringPrint(name, age))

}

fun stringPrint(newName: String, newAge: Int): String {
    return "My name is " + newName + ", I am " + newAge + " old year."

}