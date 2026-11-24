//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


//    val readOnlyFruits = listOf("apple", "orange", "grape")
//    val mutablefruits = mutableListOf("apple", "orange", "grape")
//
//    println(readOnlyFruits[0])
//    println(mutablefruits.get(0))
//
//    mutablefruits.add("banana")
//    mutablefruits.remove("apple")
//    mutablefruits.removeAt(0)
//    mutablefruits.set(0, "kiwi")
//    mutablefruits[0] = "kiwi"
//    mutablefruits.add("pear")
//    mutablefruits.clear()
//    mutablefruits.sort()
//    println(mutablefruits)


//    val group = mutableListOf<Person>(
//        Person("Shahjahon", 15, "Navoiy"),
//        Person("Jamshid", 15, "Navoiy")
//    )
//
//    group.add(Person("Saidbek", 15, "O'zbekiston"))
//    group.sortBy { it.name }
//    println(group)


    val book = mutableListOf<Book>(
        Book("Binafsha shulasi", "Ozbekiston", 100),
        Book("O'limdan keyingi hayot", "Ozbekiston", 200),
    )
    book.add(Book("Bmn", "China", 250))
    book.sortBy { it.name }
    println(book)

}