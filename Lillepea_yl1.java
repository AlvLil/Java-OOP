import java.util.ArrayList;
import java.util.Collections;


class Lillepea_yl1 {
    public static void main(String[] args) {
        int x=3,y=1,z=25; //annate muutujatele eri väärtusi
        VaiksemArv(x, y, z);
        JagubSeitsmega(y, z);
        KaksPosArvu(x, y);
    }

    static void VaiksemArv(int arv1, int arv2, int arv3){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(arv1);
        myNumbers.add(arv2);
        myNumbers.add(arv3);
        Collections.sort(myNumbers);
        
        for (int i = 0; i<= 1; i++) {
            System.out.println(myNumbers.get(i));
        }
    }
    static void JagubSeitsmega(int arv1,int arv2){
        if (arv1%7 != 0){
            if (arv2%7 != 0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }
    }

    static void KaksPosArvu(int arv1, int arv2){
        for(int i = 1; i<=8; i++){
            arv1 = arv1 * arv2 + 4;
            if (arv1 > 100000){
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}