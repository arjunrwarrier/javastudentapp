import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
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
                   break;
               case 2:
                   System.out.println("View all student");
                   break;
               case 3:
                   System.out.println("Search student");
                   break;
               case 4:
                   System.out.println("Update student");
                   break;
               case 5:
                   System.out.println("Delete student");
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