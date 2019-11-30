import java.util.Scanner;
import java.time.LocalDate; // import the LocalDate class

public class starter extends main
{
    double Version = 1.0;


    static void TimeTalker()
    {

        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

    static void Updates()
    {
        boolean ty = true;
        boolean kill = false;
        Scanner obj = new Scanner(System.in);
        System.out.println("          ");
        while (ty)
        {
            String endless = obj.nextLine();
            System.out.println(endless);
        }
    }

    static void Start()
    {
        starter myclass_OBJ = new starter();
        System.out.println("Hello Welcome to Jlist " + myclass_OBJ.Version);
    }

   //
   // public static void main(String[] args)
   // {
   //
   // }
}
