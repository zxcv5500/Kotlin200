package ex_object_declaration

object Person {
    var name: String = ""
    var age: Int = 0
    fun print() {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>) {
    // 식별자 Person으로 객체에 바로 접근가능
    Person.name = "Singleton"
    Person.age = 45
    Person.print()
}