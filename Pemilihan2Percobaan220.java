import java.util.Scanner;

public class Pemilihan2Percobaan220{
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Masukkan Sudut Pertama segitiga : ");
        int sudut1 = input20.nextInt();
        System.out.print("Masukkan Sudut Kedua segitiga : ");
        int sudut2 = input20.nextInt();
        System.out.print("Masukkan Sudut Ketiga segitiga : ");
        int sudut3 = input20.nextInt();

        int totalSudut= sudut1+sudut2+sudut3;

        if(totalSudut==180){
            if((sudut1==90) || (sudut2==90) || (sudut3==90)){
                System.out.println("Segitiga tesebut adalah segitiga siku-siku");
            }
            else{
                System.out.println("Segitiga tersebut bukan segitiga siku-siku");
            }
        }else{
            System.out.println("Bukan segitiga");
        }
    }
}