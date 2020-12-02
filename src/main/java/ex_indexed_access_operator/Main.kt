package ex_indexed_access_operator

fun main(args: Array<String>) {
    val person = Person("Kotlin", "2016-02-15")
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "Java"
    person[1] = "2016-03-13"
    println(person.name)
    println(person.birthday)
}