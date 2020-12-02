package ex_nested_class

class Outer // 바깥 클래스
{
    class Nested // 중첩클래스
    {
        fun hello() = println("중첩된 클래스")
    }
}

fun main(args: Array<String>)
{
    val instance: Outer.Nested = Outer.Nested()
    instance.hello()
}