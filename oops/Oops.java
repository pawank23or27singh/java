public class Oops{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("Blue");
        p1.setTip(5);

        System.out.println("Pen Color: " + p1.color);
        System.out.println("Pen Tip: " + p1.tip);
        System.out.println();
        BankAccount b1 = new BankAccount();
        b1.name = "John Doe";
    }
}
class Pen{
    String color;
    int tip;

    void setColor(String c){
        color = c;
    }
    void setTip(int t){
        tip = t;
    }
}

class student{
    String name;
    int age;
    float percentage;
    int physics=98;
    int chemistry=87;  
    int maths=87;


    void calpercentage(){
       percentage = (physics + chemistry + maths) / 3.0f;
    }
}

class BankAccount{
    String name;
    int accountNumber;
    float balance;

    void deposit(float amount){
        balance += amount;
    }

    void withdraw(float amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
    