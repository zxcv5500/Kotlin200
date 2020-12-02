package ex_kotlin_to_java_object;

public class Main199 {
    public static void main(String[] args) {
        System.out.println(KotlinObject.INSTANCE.getNum());
        KotlinObject.INSTANCE.setNum(0);
        KotlinObject.INSTANCE.hello();

        // @JvmStatic 어노테이션을 붙였을 경우 INSTANCE 없이 접근 할 수 있다.
        /*
        KotlinObject.setNum(0);
        KotlinObject.hello();
        */
    }
}
