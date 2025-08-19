package java12;

public class VarArg {
    public static void main(String[] args) {
        fun();
        multiple(1, 2, "three");
    }
    static void multiple(int a ,int b ,String v){
        System.out.println("Integer a: " + a);
        System.out.println("Integer b: " + b);
        System.out.println("String v: " + v);
    }

    static void fun(int... a) {
        System.out.println("Number of arguments: " + a.length);
        for (int i : a) {
            System.out.println(i);
        }
    }

}
