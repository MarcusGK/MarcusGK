package pooant;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArchivosJava {
    public static void main (String[]args){
        try{
            FileWriter fl = new FileWriter("test.txt");
            PrintWriter pw = new PrintWriter(fl);
            
            for(int i = 0;i<100;i++){
                pw.println(i + 1);
                System.out.println(i + 1);
            }
            pw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
