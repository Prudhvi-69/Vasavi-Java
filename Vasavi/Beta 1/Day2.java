// class Parent 
// {
//     void f1(){
//         System.out.println("Parenttttt");
//     }
// }
// class Child extends Parent{
//     void f2(){
//         System.out.println("CHild classs");
//     }
// }
// class Grand extends Parent
// {
//     void f3()
//     {
//         System.out.println("Grandiieeeee");
//     }
// }
    // void area(int s)
    // {
    //     System.out.println("Area of square is "+s*s);
    // }
    // void area(int l, int b)
    // {
    //     System.out.println("Area of rectangle is "+l*b);
    // }
    // void area(float h, float b)
    // {
    //     System.out.println("Area of triangle is "+(0.5*h*b));
    // }
    // void area(float r)
    // {
    //     System.out.println("Area of Circle is "+(3.14*r*r));
    // }




    // Day2()
    // {
    //     System.out.println("Constructor is called");
    // }
    // Day2(int val1, int val2)
    // {
    //     System.out.println("Values are "+val1+" and "+val2);
    // }
    
// abstract class CL{
//     void start(){ //concrete method 
//         System.out.println("Start");
//     }
// abstract void stop(); // method without definition
// }
// class Sample extends CL
// {
//     void stop() // abstract method definition
//     {
//         System.out.println("Stoppedd");
//     }
// }

interface Department{
    void countOfstudents();
    void totalYearsOfEducation();           }
class Engineering implements Department{
    public void countOfstudents(){ // specific for engineering
        System.out.println("Engineering has 69 students");
    }public void totalYearsOfEducation(){
        System.out.println("Engineering has 4 years of education");
}}  
class Medicine implements Department{
    public void countOfstudents(){ // specific for medicine
        System.out.println("Medicine has 106 students"); 
    } public void totalYearsOfEducation(){
        System.out.println("Medicine has 5 years of education");
    }
}
public class Day2 {
    public static void main(String[] asfsd) {
        Engineering e = new Engineering();
        Medicine m = new Medicine();
        e.countOfstudents();
        m.countOfstudents();
        e.totalYearsOfEducation();
        m.totalYearsOfEducation();






        // Sample s = new Sample();
        // s.start();  // concrete method inside abstract class
        // s.stop();   // abstract class inside normal class




        // Day2 obj = new Day2();

        // Child obj = new Child();        // obj.f2();
        // obj.f1();
        // Grand g = new Grand();
        // g.f3();
        // g.f1();
        // Day2 obj = new Day2();
        // obj.area(312);
        // obj.area(10, 20);
        // obj.area(10.5f, 20.5f);
        // obj.area(10.055f);
        // String str;
        // Class  object
        // str = "Klaus Mikealson";
        //        value to the object
        // System.out.println(str);

        // Integer a = 10;




    }
}
