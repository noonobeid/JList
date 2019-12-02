import java.util.Scanner;
import java.time.LocalDate; // import the LocalDate class

public class starter
{
    double Version = 1.0;
    String Com1;
    String Com2;
    String Com3;


    static void Lister()
    {

    }

    static void TimeTalker()
    {

        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

    static void Updates()
    {
        int max = 200;
        boolean ty = true;
        boolean kill = false;
        Scanner obj = new Scanner(System.in);
        System.out.println("          ");
        while (ty)
        {
            for (int i = 0; i < max; i++)
            {
              System.out.println("(" + i);
              String endless = obj.nextLine();
            }
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
