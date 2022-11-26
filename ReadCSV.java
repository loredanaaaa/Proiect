import java.io.*;
import java.util.Scanner;

public class ReadCSV
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(new File( "C:\\Users\\hp\\Downloads\\CSVnote.csv"));
        sc.useDelimiter(";");
        while (sc.hasNext())
        {
            System.out.print(sc.next());
        }
        sc.close();
        boolean firstLine = true;


        }


    }
