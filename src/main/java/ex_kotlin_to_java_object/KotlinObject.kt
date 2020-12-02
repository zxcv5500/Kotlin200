package ex_kotlin_to_java_object

object KotlinObject {
    var num = 52

    fun hello() = println("Hello")

    // INSTANCE 필드 없이 객체에 직접 접근하려면 @JvmStatic을 붙여준다.
    /*
    @JvmStatic
    var num = 52

    @JvmStatic
    fun hello() = println("Hello")
    */
}