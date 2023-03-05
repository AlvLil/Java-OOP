

class LillepeaKodu1 {
    public static void main(String[] args){
        String sone = new String("aaabxba");
        int[] massiiv =  {3,2,1,4,55,2,1,9,0,2};
        int taisarv = 2;
       // yl1(sone);
        yl2(sone);
       // yl3(massiiv, taisarv);
        //System.out.println(yl4(sone));
    }
    public static void yl1(String sone){
        /*1. Olgu meetodi sisendiks suvalise pikkusega sõne (pikkus võib olla ka 0). Kui sõne
        pikkus on paarisarvuline, tahame vastuseks selle sõne 2 keskmist sümbolit. Kui sõne
        pikkus on paarituarvuline, tahame vastuseks saada sõne 3 keskmist sümbolit. Kui
        sõne on liiga lühike, tuleb tagastada kogu sõne (ehk siis juhtudel, kui sõne pikkus on 0
        või 1). 
        */

        //Kontrollin kas sone pikkus on üle kahe charakteri, kui ei ole siis väljastame sone pikkuse. 
        if (sone.length() < 2){
            System.out.println(sone + " pikkus on " + sone.length());  // Output user input
        }
        //Kui sone pikkus jagub kahega, siis teen substringi mis algab keskminetäht -1 kuni keskmine täht + 1 ja väljastan selle.
        if (sone.length()% 2 == 0){
            System.out.println(sone.substring(sone.length()/2 - 1, sone.length()/2 + 1 ));

        }
        //Kui sone ei jagu kahega ehk on paaritu arv pikk siis leian kolm keskmist sama meetodiga kui paarisarv pikk sonega aga substringi lõpetan yhe tähe kaugemal.
        else{
            System.out.println(sone.substring(sone.length()/2 - 1, sone.length()/2 + 2 ));
        }
    }

    public static void yl2(String sone){
        /*2. Olgu meetodi sisendiks suvalise pikkusega sõne (pikkus võib olla ka 0). Tahame
        saada vastuseks “true”, kui 2. või 4. positsioonil asub alamsõne “aaa”, ja “false”
        muidu.
        Näiteks:
        “aaaaaxxcb" --> true
        “abaxaaaxc” --> true
        "xxabc" --> false
        “aaabxba” --> false  */

        //Kuna meil peab 4ndal postitsioonil asuma aaa ehk + 3 tähte, kontrollin kas sone pikkus on vähemalt 7
        if(sone.length()>=7){
            //Kontrollin kas sone substring asukohast 2 - 5ni on võrdne aaa´ga või 4´st 7ni on võrdne aaa´ga
            //Kui on true siis väljastab true
            if (sone.substring(4, 7).equals("aaa")){
                System.out.println("true");
            }
            if( sone.length() >= 5){
                if(sone.substring(2, 5).equals("aaa")){
                    System.out.println("true");
                }
                else{
                    System.out.println("false");
                }
            }
            //kui ei siis väljastab false
            else{
                System.out.println("false");
            }
        }
        else{
            System.out.println("false");
        }
    }

    public static void yl3(int[] massiiv, int taisarv){
        /* 3. Olgu meetodi sisendiks täisarvude massiiv ja üks täisarv. Vastuseks tahame teada,
        kui mitu korda etteantud arv selles massiivis esineb.
        Nt [3,2,1,4,55,2,1,9,0,2] ja 2 --> 3
            [3,1,4,55,1,9,0] ja 2 --> 0 */

        // teen int tüüpi muutuja massiivi suurusele ja korduste arvule
        int Size = massiiv.length;
        int kordused = 0;
        
        // ühekorde loopiga käin elemendid läbi
        for (int i = 0; i < Size; i++){
            // kui massiivi element on võrdne taisarvuga suurendan korduseid +1
            if (massiiv[i] == taisarv){
                kordused++;
            }
        }
        //kui loop lõpetanud prindin välja korduste arvu
        System.out.println(kordused);
    }

    public static String yl4(String sona){
        /*4. Olgu meetodi sisendiks sõnede massiiv. Tulemuseks tahame massiivi, mille tagant
        kolmas ja viimane element on ära vahetatud – juhul kui massiivis on vähemalt 3
        elementi. Kui massiiv on liiga lühike, trükitakse konsoolile vastav teade.  */

        // kontrollin kas sona on vähemalt 3 tähte pikk
        if(sona.length() >= 3){
            //teen stringi char massiiviks
            char[] uusSona = sona.toCharArray(); 
            //teen ajutise char muutuja TagantKolmast2ht millele määran sona tagant kolmanda väärtuse
            char TagantKolmasT2ht = uusSona[sona.length()-3];
            //muudan char massiivis tagant kolmanda ära viimase väärtusega
            uusSona[sona.length()-3] = uusSona[sona.length()-1];
            //kuna tagant kolmas väärtus oli ajutisse muutujasse salvestatud saan nüüd selle char massiivi viimasele kohale määrata
            uusSona[sona.length()-1] = TagantKolmasT2ht;
            //tagastan String tüüpi väärtuse
            return String.valueOf(uusSona);
        }
        else{
            return "Pole yle kolme tähe pikk";
        }
    }

}