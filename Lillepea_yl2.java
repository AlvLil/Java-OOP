public class Lillepea_yl2 {
    public static void main(String[] args){
        String s1 = new String("tere");
        String s2 = new String("hommikust");
        int[] massiiv = {1,1,3,2,1,2,2,2};
        int[] jada = {2,3,5,6};
        System.out.println(korrutis(jada));
        System.out.println(kolmReas(massiiv));
        System.out.println(kaksS6na(s1, s2));
    }

    public static boolean kolmReas(int[] massiiv) {
        for (int i = 0; i < massiiv.length-2;i++){
            if(massiiv[i]+1 == massiiv[i+1]){
                if(massiiv[i+1]+1 == massiiv[i+2]){
                    return true;
                }
            }
        }
        return false;
    }

    public static String kaksS6na(String s1,String s2) {

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)){
            return String.valueOf(s1.substring(0, s1.length() - 1) + s2.substring(1));
        }
        else{
            return String.valueOf(s1 + s2.substring(1));
        }        
    }

    public static int korrutis(int[]jada) {
    
        if (jada.length == 1){
            return jada[0];
        }
        if (jada.length != 0){
            int x = jada[1] * jada[jada.length-1];
            return x;
        }else{
            return 0;
        }
    }
}
