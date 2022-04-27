package ie.tudublin;

import java.io.FileReader;
import java.io.IOException;//signals an exception of some kind has occurred
import java.io.BufferedReader;//Reads text from a character-input stream
class readcsv
{
    public static void main(String[] args)
    {
        String sample = ",";
        String mystring;
        try
        {
            BufferedReader brdrd = new BufferedReader(new FileReader("C:\\Users\\davis\\eclipse-workspace\\CSVdocuments\\commaseperated.csv"));
            while ((mystring = brdrd.readLine()) != null)  //Reads a line of text
            {
                String[] student = mystring.split(sample);//utilized to split the string
                System.out.println("Name: " + student[0] + ",Faculty: " + student[1] + ", Registration No: " + student[2] + ", Fees Balance: " + student[3] + ", Campus:  " + student[4] +"");
            }
        }
        catch (IOException e)//catches exception in the try block
        {
            e.printStackTrace();//Prints this throwable and its backtrace
        }
    }
}