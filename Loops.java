import java.util.Scanner;


public class Loops {
    public static void main(String[] args) 
     {

        int i = 0;

        
        while (i <= 10)
        {
            System.out.println(i);
            i++;
        }
         
        i = 0;
     //--------------------------------
        do
        {
            System.out.println(i);
            i++;
        }
        while (i < 10);
//--------------------------------

        for (int j=0; j<=10; ++j)
        {
         System.out.println(j);
        }

//--------------------------------
        Scanner scanner = new Scanner(System.in);
        String input;
        while (!(input = scanner.nextLine()).equals("exit"))
        {
        System.out.println("Eingabe: " + input);
        }

//--------------------------------
        Scanner scanner1 = new Scanner(System.in);
        String input1;
        do {
        System.out.println("Menu: [Option1, Option2, Exit]");
        input = scanner.nextLine();
        } 
        while (!input.equals("Exit"));
//--------------------------------

        int weeks = 10;
        int days = 7;
        int z = 1;

        while (z <= weeks)
        {
           System.out.println("Week: " + z);

           for (int j = 1; j <= days; ++j)
            
           {
                System.out.println("Day: " + j);
           }

              ++z;
        }
    }
}

