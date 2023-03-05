import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Lillepea_yl3 {
    public static void main(String[] args) throws IOException{
        //tekstid();
        numbrid();
       } 

    static void tekstid() throws java.io.IOException {
        //loob uue objekti tüüpi BufferedReader
        BufferedReader reader = new BufferedReader(new
       InputStreamReader(System.in));
        System.out.print("Sisesta oma esimene tekst: ");
        String rida1 = reader.readLine();
        System.out.print("Sisesta oma teine tekst: ");
        String rida2 = reader.readLine();
        if(rida1.equals(rida2)){
            System.out.println("read on samad");
        }
        else{
            System.out.println("read ei ole samad");
        }
    }


    static void numbrid() {
        int arv = 0;
        Scanner skanner = new Scanner(System.in);
        while (true) {
            System.out.print("Sisesta arv 1-5: ");
                if (!skanner.hasNext()) {
                    System.out.println("Lõpp!");
                    break;
                }
                if (skanner.hasNextInt()) {
                    arv = skanner.nextInt();
                        if (arv <= 5 && arv > 0) {
                        System.out.println("Tänan!");
                        break;
                    }
                    System.out.println("arv peab olema vahemikus [1-5], proovi uuesti!");
                } else {
                    skanner.next(); //loeb ära vale vastuse, et saaks edasi minna
                    System.out.println("Pole number, proovi uuesti!");
                }
        
        }
        int[] massiiv = new int [arv];
        int vaartus = 0;
        while(true){
            for (int i = 0; i < arv; i++){
                System.out.print("Sisesta arv massiivi ");
                if (!skanner.hasNext()) {
                    System.out.println("Lõpp!");
                    break;
                }
                if (skanner.hasNextInt()) {
                    vaartus = skanner.nextInt();
                } else {
                    skanner.next(); //loeb ära vale vastuse, et saaks edasi minna
                    System.out.println("Pole number, proovi uuesti!");
                }
                massiiv[i] = vaartus;
            }
            if (massiiv.length == arv){
                break;
            }
            else{
                continue;
            }
        }
        int kokku = 0;
        System.out.println("Massiivis on elemendid: ");
        for (int j = 0; j < massiiv.length; j++){
            System.out.println(massiiv[j]);
            kokku += massiiv[j];
        }

        System.out.println("Massiivis arvud kokku on: " + kokku);
        skanner.close();
    } 
       




}
