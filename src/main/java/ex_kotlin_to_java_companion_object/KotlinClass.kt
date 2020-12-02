package ex_kotlin_to_java_companion_object

class KotlinClass {
    companion object {
        var num = 0

        fun hello() = println("Hello")
        //
        @JvmStatic
        var num2 = 0

        @JvmStatic
        fun hello2() = println("Hello2")

    }
}