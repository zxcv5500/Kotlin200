package ex_is_operator

import ex_inheritance.Person
import ex_inheritance.Student

class Professor(name:String, age:Int): Person(name, age)

fun main(args: Array<String>) {
    val person:Person = Student("Mark Zuckerberg", 33, 20171225)
    print("${person is Person} ")
    print("${person is Student} ")
    print("${person is Professor} ")

    val person2: Person = Professor("Kim", 48)
    print("${person2 is Person} ")
    print("${person2 is Student} ")
    print("${person2 !is Professor} ")

}