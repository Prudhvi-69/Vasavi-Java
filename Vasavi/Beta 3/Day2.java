import java.io.Console;
// class Parent{
//     int a;
//     int b;
//     void f1(){
//         a=10;
//         b=59;
//         System.out.println("This is going to call parent");
//     }
// }
// class Child extends Parent{
//     void mobile(){
//         System.out.println("Value of a = "+a);
//         System.out.println("Value of b = "+b);
//     }
// }
// class Grand extends Child { // this is a classic example of MultiLevel Inhertance
//     void nike()
//     {
//         System.out.println("This is going to call Nike");
//         System.out.println("SUm = "+(a+b));   
//     }
// }
// class Parent{
//     int a=30000;
//     int b=39000;
//     void salary(){
//         System.out.println("Dadddyyy : Any problem, call DADDYY");
//     }
// }
// class Child1 extends Parent{
//     void pocketmoney(){
//         System.out.println("Child1 : Need money, DADDDYYYY");
//         System.out.println("Money for child1 = "+a);
//     }
// }
// class Child2 extends Parent{
//     void pocketmoney(){
//         System.out.println("Child2 : Need money, DADDDYYYY");
//         System.out.println("Money for child2 = "+b);
//     }
// }

// class Parent{
//     void abc(){
//         System.out.println("This is Parent class");
// }}    
// class Child extends Parent{
//     void abc(){
//         super.abc();
//         System.out.println("This is Child class");
// }}

// abstract class Vehicle // abstract class
// {
//    abstract void details(); // abstract method
//     void speed(int s)      // concrete method
//     {
//         System.out.println("Max speed is : "+s);
//     }
// }
// class Car extends Vehicle
// {
//     @Override
//     void details() {
//         {
//             System.out.println("This is an Abstract Method of Car");
//         }
//         speed(106);
//     }
// }

public interface sample{
    int value1=69;
    abstract void details();
    abstract int add(int a,int b);
    abstract float area(int l, int b);    
}
public class Day2 implements sample {
    public static void main(String sasdsd[])    {
      






    // public static void main(String sasdsd[])    {
    //     Child c1 = new Child();
    //     c1.abc();


    // Day2()// Default constructor
    // {
    //     System.out.println("This is Constructor");
    // }
    // Day2(int a, int b) // Parameterized Constructor
    // {
    //     System.out.println("This is a Parameterized Cons");
    //     System.out.println(" Sum of 2 value is : "+(a+b));
    // }

    // int area(int l, int b){ // area of rectangle
    //     return l*b;
    // }
    // int area(int s){ //area of square
    //     return s*s;
    // }
    // float area(float h, int b){ // area of triangle
    //     return 0.5f*h*b;
    // }
    // float area(float r){  // area of circle
    //     return 3.14f*r*r;
    // }
   
        // Day2 obj = new Day2();
        // int a = obj.area(5);
        // int b = obj.area(12, 13);
        // float c = obj.area(2.5f,2);
        // float d = obj.area(1.1f);

        // System.out.println("Area of sqaure is : "+a);
        // System.out.println("Area of rectangle is : "+b);
        // System.out.println("Area of triangle is : "+c);
        // System.out.println("Area of circle is : "+d);
    






        //obj.add(10,59);
        //System.out.println("This is inside Main function");

    // void add(int a,int b)
    // {
    //     System.out.println("Sum of 2 values is : "+(a+b));
    // }





        // Child1 c1=new Child1()
        // c1.salary();
        // c1.pocketmoney();

        // Child2 c2=new Child2();
        // c2.salary();
        // c2.pocketmoney();


        // Grand g = new Grand();
        // g.f1();        // parent class method
        // g.mobile();     // child class method
        // g.nike();          // grand child method

        // Child c1=new Child();
        // c1.f1();
        // c1.mobile();


    // String s1;
    // String s2; //This keyword and usage 
    // void display(String s1, String s2)
    // {   
    //     this.s1 = s1;
    //     this.s2 = s2;
    //     System.out.println(s1+" "+s2); // Parameter values
    // }
    // void paparazzi()
    // {
    //     System.out.println(s1+" "+s2); // Class values
    // }
    
        //Lets start where we stopped yesterday
        //that 2nd way of taking input in java without Scanner class
        // Console co=new Console();
        // String name=co.readLine();
        // System.out.println("Value : "+name);

        //this 
        // super   - we need to discuss about inheritance first
        // inheritance 
        // oop concepts 
        // Day2 obj=new Day2();
        // obj.display("Ganesh", "Pittal");
        // obj.paparazzi();

        

    }
}
