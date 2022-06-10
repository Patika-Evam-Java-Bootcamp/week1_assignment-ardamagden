import javax.management.StringValueExp;
import java.lang.reflect.Array;
import java.util.Scanner;

public class HomeWork_1 {
    private static String STR = "<<code>>";
    public static void main(String[] args) {
        String [] Array = new String[5];

        for (int i=0 ; i<5 ; i++)
        {
            Scanner Input = new Scanner(System.in);
            System.out.println("Enter String:");
            String Value = Input.nextLine();
            Array[i]=Value;
        }
        String myString = myMethod(Array);
        System.out.println(myString);
    }
    private static String myMethod(String[] Array)
    {
        for (int i=0 ; i<5 ; i++)
        {
            if (Array[i].equals(STR))
            {
                return "Tanımlı value yu içeren String deger: " + Array[i];
            }
        }
        return null;
    }
}
