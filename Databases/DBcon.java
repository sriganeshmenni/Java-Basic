import java.sql.*;
public class DBcon
{
 public static void main(String args[])
 {
    String url = "jdbc:mysql://localhost:3306/empdb";
    String userName="root";
    String pwd = "Sri;2005";
    Connection con = null;

    //Establish Connection
    try{
        con = DriverManager.getConnection(url,userName,pwd);
        if(con!=null)
        {
            System.out.println("Connection Established Succesfully");
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
        catch(SQLException e){
            System.out.println(e);
        }
 }
}