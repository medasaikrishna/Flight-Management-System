import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        
        FlightManagementSystem oo= new FlightManagementSystem();
        Flight ob= new Flight(10,"hyderabad","chennai",20,555.55);
        boolean b=oo.addFlight(ob);
        System.out.println(b);
       //if(addFlight(ob))
       // {
        //    System.out.println("Flight details added successfully");
      //  }
      //  else
       // {
       //     System.out.println("Addition not done");
       // }
        
    }
}