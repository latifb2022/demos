package com.lbenzzine.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStmtExample { 
 
    public static void main(String[] args) throws Exception { 

        Connection connection = null; 
        PreparedStatement pstatement = null; 
        Scanner scanner = null; 
 
        try { 
             
            scanner = new Scanner(System.in); 
            int n = 0; 
            System.out.println("Enter no. of Person to insert"); 
            n = scanner.nextInt(); 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demos", "root", "FSD-Lvc-2022"); 
            if (connection != null) 
            pstatement = connection.prepareStatement("insert into person values(?,?,?)"); 
            if (pstatement != null) { 
                for (int i = 1; i <= n; i++) { 
                    System.out.println("Enter " + i + " Person Details"); 
                    System.out.println("Enter id : "); 
                    int id = scanner.nextInt(); 
                    System.out.println("Enter Person Name : "); 
                    String name = scanner.next(); 
                    System.out.println("Enter Person Address : "); 
                    String address = scanner.next(); 
                    pstatement.setInt(1, id); 
                    pstatement.setString(2, name); 
                    pstatement.setString(3, address);  
                    int result = pstatement.executeUpdate(); 
                    if (result == 0) { 
                        System.out.println("Person details: are not inserted"); 
                    } else { 
                        System.out.println(result + " records(s) are  inserted"); 
                    } 
                } 
            } 
         } catch (ClassNotFoundException cnfe) { 
            cnfe.printStackTrace(); 
          } catch (SQLException se) { 
            se.printStackTrace(); 
          } catch (Exception ex) { 
            ex.printStackTrace(); 
         } finally { 
            try { 
                if (pstatement != null) { 
                    pstatement.close(); 
                } 
            } catch (SQLException se) { 
                se.printStackTrace(); 
            } 
            try { 
                if (connection != null) { 
                    connection.close(); 
                } 
            } catch (SQLException se) { 
                se.printStackTrace(); 
            } 
        } 
    } 
}
 