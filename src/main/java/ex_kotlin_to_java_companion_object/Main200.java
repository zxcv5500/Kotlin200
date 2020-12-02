package ex_kotlin_to_java_companion_object;

import kotlin.jvm.JvmStatic;

public class Main200 {
    public static void main(String[] args) {
        KotlinClass.Companion.setNum(30);
        System.out.println(KotlinClass.Companion.getNum());
        KotlinClass.Companion.hello();

        // @JvmStatic 으로 선언하는 경우 아래 처럼 사용할 수도 있다.
        KotlinClass.setNum2(40);
        System.out.println(KotlinClass.getNum2());
        KotlinClass.hello2();
    }
}
