import java.util.*;
import java.sql.*;
import java.io.IOException;
public class FlightManagementSystem{
    public static boolean sr;
    public boolean addFlight(Flight flightObj) 
    {
        try{           
        
        Connection co=DB.getConnection();      
        
       PreparedStatement ps=co.prepareStatement("insert into flight values(?,?,?,?,?)");
       ps.setInt(1, flightObj.getFlightId());
       ps.setString(2, flightObj.getSource());
       ps.setString(3, flightObj.getDestination());
       ps.setInt(4,flightObj.getNoOfSeats());
       ps.setDouble(5, flightObj.getFlightFare());
       int k= ps.executeUpdate();
        
        if(k==1)
        {
            System.out.println("Flight details added successfully");
            
            sr=true;
           // return true;
            
        }
        else
        {
            System.out.println("Addition not done");
            //return false;
            sr=false;
            
        }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return sr;
    }
}