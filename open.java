



import java.io.FileWriter;
import java.io.IOException;


public class open
{
    static void call()
    {
      starter obj = new starter();
        int[] id = {1, 8, 9, 7};

          try
          {
           FileWriter myWriter = new FileWriter("Saved.txt");
           myWriter.write("Your Valus: " + id);
           myWriter.close();
           System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
           System.out.println("An error occurred.");
           e.printStackTrace();
          }
          obj.Updates();
    }


    public static void main(String[] args)
    {
        call();
    }
}
