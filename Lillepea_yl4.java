import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Vector;

public class Lillepea_yl4 {
    public static void main(String[] args) {
        puhverOneLine("in1.txt", 1);
        puhverOneLine("in2.txt", 5);
        skanner("in3.txt");
    }

    static void puhver(String filename) {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(filename));
            // sama hästi võiks kirjutada ka nii:
            //FileReader fail = new FileReader("src/numbers.txt");
            //BufferedReader rd = new BufferedReader(fail);
            //loeme failist, kuni seal on ridu
            String line = rd.readLine();
            while (line != null) {
                System.out.println(line);
                line = rd.readLine();
            }
            rd.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
  
    static void puhverOneLine(String failname, int rida) {
            try (BufferedReader rd = new BufferedReader(new FileReader(failname))) {
                // sama hästi võiks kirjutada ka nii:
                //FileReader fail = new FileReader("src/numbers.txt");
                //BufferedReader rd = new BufferedReader(fail);
                //loeme failist, kuni seal on ridu
                String line = rd.readLine();
                int i = 0;
                while (line != null) {
                    i++;
                    if (i == rida){
                        System.out.println(line);
                        return;
                    }
                    line = rd.readLine();
                }
                if (i < rida){
                    System.out.println("Nii palju ridu pole!");
                }
        } catch (IOException e) {
            e.printStackTrace();
            }
        }
        
        static void skanner(String failinimi) {
            Vector<Integer> vec = new Vector<>();  
            Vector<String> StringVec = new Vector<>();
            puhver(failinimi);
            //et oleks selge, kuidas meetodi sisendit kasutame
            Path path = Paths.get(failinimi);
                try {
                    Scanner scanner = new Scanner(path);
                    while (scanner.hasNext()) {
                        if (scanner.hasNextInt()) {
                            vec.add(scanner.nextInt());
                        } else {
                            StringVec.add(scanner.next());
                        }
                    }
                    scanner.close();

                } catch (IOException e) {
                     System.out.println("Error reading file:" + e.getMessage());
                     e.printStackTrace();
                }
                kirjutaja("out.txt", StringVec);

        }

        static void kirjutaja(String failinimi, Vector<String> StringVec ){
            try {
                PrintWriter writer = new PrintWriter(failinimi);
                writer.println(StringVec); 
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                }
            puhver(failinimi);
           }
           
}

