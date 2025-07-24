package Inheritance;
// base class
public class inhe {  
    public static void main(String[] args) {
        fish f = new fish();
        f.color = "Blue";
        f.eat();
        f.sleep();
        f.breathe();
        f.swim();
        
        System.out.println("Fish Color: " + f.color);
    }
}
class Animals{
    String color;

    void eat(){
        System.out.println("Eating...");
    }
    void sleep(){
        System.out.println("Sleeping...");
    }
    void breathe(){
        System.out.println("Breathing...");
    }
}

// derived class
class fish extends Animals{
    void swim(){
        System.out.println("Swimming...");
    }

}