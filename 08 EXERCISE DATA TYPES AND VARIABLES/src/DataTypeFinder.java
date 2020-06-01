import java.awt.*;
import java.util.Scanner;

public class DataTypeFinder {
    public static <FormatException> void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String dataType ="";



        while (!"END".equals(input)){
            try {
                int num = Integer.parseInt(input);
                dataType="Integer";
            }catch(Exception i)
            {
                try
                {
                    double number = Double.parseDouble(input);
                    dataType = "floating point";
                }
                catch(Exception d)
                {
                    try
                    {
                        char number = '0';
                        dataType = "character";
                    }
                    catch (Exception b)
                    {
                        try
                        {
                            boolean number;
                            dataType = "boolean";
                        }
                        catch (Exception s)
                        {
                            dataType = "string";
                        }
                    }
                }
            }

            System.out.println(input+" is "+dataType);
            input=scan.nextLine();
        }

    }
}
