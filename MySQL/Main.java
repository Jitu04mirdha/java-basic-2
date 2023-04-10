package python.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/*
public class Main {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection com= DriverManager.getConnection("jdbc:mysql://localhost:3036/collages","root","Jitender@1");
            Statement stml=com.createStatement();

            ResultSet rs=stml.createStatements();
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e);


        }
    }
}


 */