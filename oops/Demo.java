class Demo {
    public static void main(String[] args) {
        Oops student = new Oops();
        student.physics = 85;
        student.chemistry = 90;
        student.maths = 95;
        student.calpercentage();
        System.out.println("Percentage: " + student.percentage);
    }
}
class Oops {
    int physics;
    int chemistry;
    int maths;
    int age;
    float percentage;

    void calpercentage() {
        percentage = (physics + chemistry + maths) / 3.0f; // Ensure float division
    }
}
// class Demo{
//     public static void main(String[] args) {
//         System.out.println("This is a demo class for OOP concepts.");
//     }
// }
