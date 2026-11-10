class Desktop{
    String brand = "HP";
    int ramsize=16;
    int price=50000;
    void bootup(){
        System.out.println("Desktop is starting");
    }
}

public class Laptop{
    public static void main(String[] args) {
        Desktop l = new Desktop ();
        System.out.println("Brand:"+l.brand);
        System.out.println("Ram:"+l.ramsize +"GB");
        System.out.println("Price:"+l.price);
        l.bootup();
    }
}
