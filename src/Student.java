import java.sql.*;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        String name,college;
        int rollno,admnum;






        while(true) {
            System.out.println("Select an option from below");
            System.out.println("1.Add Student ");
            System.out.println("2.View all  Student ");
            System.out.println("3.Search a Student ");
            System.out.println("4.Update a Student ");
            System.out.println("5.Delete a Student ");
            System.out.println("6.Exit ");
            System.out.println("Enter your choice:  ");
            choice = input.nextInt();

           switch (choice){
               case 1:
                   System.out.println("Add student");
                   System.out.println("Enter name: ");
                   name = input.next();
                   System.out.println("Enter the rollnumber: ");
                   rollno = input.nextInt();
                   System.out.println("Enter the admission number: ");
                   admnum = input.nextInt();
                   System.out.println("Enter the college: ");
                   college = input.next();

                   try {
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
                       String sql = "INSERT INTO `students`(`name`, `rollnumber`, `admno`, `college`) VALUES (?,?,?,?)";
                       PreparedStatement stmt = con.prepareStatement(sql);
                       stmt.setString(1,name);
                       stmt.setInt(2,rollno);
                       stmt.setInt(3,admnum);
                       stmt.setString(4,college);
                       stmt.executeUpdate();
                   }
                   catch (Exception e ){
                       System.out.println(e);
                   }



                   break;
               case 2:
                   System.out.println("View all student");
                   try{
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","");
                       String sql = "SELECT `name`, `rollnumber`, `admno`, `college` FROM `students` ";
                       Statement stmt = con.createStatement();
                       ResultSet rs = stmt.executeQuery(sql);
                       while (rs.next()){
                           String getName = rs.getString("name");
                           String getRoll = rs.getString("rollnumber");
                           String getAdm = rs.getString("admno");
                           String getCollege = rs.getString("college");
                           System.out.println("Name="+getName);
                           System.out.println("Rollno="+getRoll);
                           System.out.println("Admission No="+getAdm);
                           System.out.println("College="+getCollege+"\n");

                       }

                   }
                   catch (Exception e){
                       System.out.println(e);
                   }
                   break;
               case 3:
                   System.out.println("Search student");
                   System.out.println("Enter the admission number: ");
                   admnum = input.nextInt();

                   try {
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
                       String sql = "SELECT `name`, `rollnumber`, `admno`, `college` FROM `students` WHERE `admno` = "+String.valueOf(admnum);

                       Statement stmt = con.createStatement();
                       ResultSet rs = stmt.executeQuery(sql);
                       while (rs.next()){
                           String getName = rs.getString("name");
                           String getRoll = rs.getString("rollnumber");
                           String getAdm = rs.getString("admno");
                           String getCollege = rs.getString("college");
                           System.out.println("Name="+getName);
                           System.out.println("Rollno="+getRoll);
                           System.out.println("Admission No="+getAdm);
                           System.out.println("College="+getCollege+"\n");

                       }


                   }
                   catch (Exception e){
                       System.out.println(e);
                   }


                   break;
               case 4:
                   System.out.println("Update student");
                   System.out.println("Enter the admission number: ");
                   String adm = input.next();

                   System.out.println("Enter name to update: ");
                   name = input.next();
                   System.out.println("Enter the rollnumber to update: ");
                   rollno = input.nextInt();
                   System.out.println("Enter the collegename to update: ");
                   college = input.next();

                   try {
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
                       String sql = "UPDATE `students` SET `name`='"+name+"',`rollnumber`='"+rollno+"',`college`='"+college+"' WHERE `admno` = " + adm;
                       Statement stmt = con.createStatement();
                       stmt.executeUpdate(sql);
                       System.out.println("Data updated successfully.");
                   }
                   catch (Exception e){
                       System.out.println(e);
                   }

                   break;
               case 5:
                   System.out.println("Delete student");
                   System.out.println("Enter the admission number: ");
                   String admn = input.next();

                   try {
                       Class.forName("com.mysql.jdbc.Driver");
                       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
                       String sql = " DELETE FROM `students` WHERE `admno` =  " + admn;
                       Statement stmt = con.createStatement();
                       stmt.executeUpdate(sql);
                       System.out.println("Data deleted successfully.");
                   }
                   catch (Exception e){
                       System.out.println(e);
                   }

                       break;
               case 6:
                   System.out.println("Exit");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Enter correct value");


           }

        }
    }
}