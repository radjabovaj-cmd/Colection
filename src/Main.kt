//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val fruits = mutableSetOf<String>("apple", "banana", "orange")
//    fruits.add("apple")
//    fruits.add("lemon")
//    println(fruits)
//
//    val fruitList = fruits.sortedBy { it }
//    fruitList.forEach { println(it) }


//    val animal = mutableSetOf<Animal>(
//        Animal("Dog", 5, "Black"),
//        Animal("Cat", 4, "White"),
//        Animal("Horse", 2, "Brown"),
//    )
//    animal.add(Animal("Dog", 4, "Black"))
//    animal.add(Animal("Donkey", 2, "Pink"))
//    animal.forEach { println(it.color) }


    val kasb = mutableSetOf<Job>(
        Job("Doctor", 3000000, "treating patients"),
        Job("Teacher", 2000000, "Teaching children"),
        Job("Businessman", 1000000000, "Biliman ay"),
    )
    kasb.add(Job("Developer", 1009867568, "creating a program"))

    kasb.forEach { println(it) }
}