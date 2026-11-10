public class Car {
    String color;
    void speed(int num){
        System.out.println("speed"+num);
    }
}
class Dynamic{
    public static void main(String[]args){
        Car tesla=new Car();
        Car ferari=new Car();
        tesla.color="black";
        ferari.color="white";
        System.out.println("tesla.color");
        System.out.println("ferari.color");
        tesla.speed(200);
        ferari.scpeed(500);
    }
}
        
