// public class constractor {
//     public static void main(String  args[]){
//         Student s = new Student();
//         s.name = "Alice";
//         s.age = 18;
//         s.percentage = 85.5f;
//         System.out.println("Student Name: " + s.name);
//         System.out.println("Student Age: " + s.age);
//         System.out.println("Student Percentage: " + s.percentage);
//     }
// }
// class Student {
//     String name;
//     int age;
//     float percentage;
//     Student(){
//         System.out.println("This is a constructor of Student class");
//     }
// }


// This is a constructor example in Java
// public class constr{
//     public static void main(String args[]){
//         Student s1=new Student();
//         Student s2=new Student("Pawan");
//         Student s3=new Student(123);
//         System.out.println("s1 Name: " + s1.name);
//         System.out.println("s2 Name: " + s2.name);
//         System.out.println("s3 Roll: " + s3.roll);


//     }
// }
// class Student {
//     String name;
//     int roll;

//     Student(){
//         System.out.println("Default constructor called");
//     }
//     Student(String name){
//         this.name=name;
//         System.out.println("Parameterized constructor called with name: " + name);
//     }
//     Student(int roll){
//         this.roll=roll;
//         System.out.println("Parameterized constructor called with roll: " + roll);
//     }
// }

// copy constructor
// public class constr{
//     public static void main(String args[]){
//         Student s1=new Student();
//         s1.name = "Pawan";
//         s1.roll = 123;
//         s1.password="abcde";
//         Student s2 = new Student(s1); // Copy constructor
//         s2.password = "xyz";
//         System.out.println("s1 Name: " + s1.name);
//         System.out.println("s1 Roll: " + s1.roll);
//         System.out.println("s1 Password: " + s1.password);
//         System.out.println("s2 Name: " + s2.name);
//         System.out.println("s2 Roll: " + s2.roll);
//         System.out.println("s2 Password: " + s2.password);
//     }
// }

// class Student{
//     String name;
//     int roll;
//     String password;
//     Student(){
//         System.out.println("Default constructor called");
//     }

//     Student(Student s1){
//         this.name=s1.name;
//         this.roll=s1.roll;
//         this.password=s1.password;
//     }
// }

// destructor example
// garbage collection
public class constr{
    protected void finalize() throws Throwable {
        System.out.println("Destructor called");
    }
}