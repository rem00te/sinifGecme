import java.util.Scanner;

public class sinif {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sinif=0;
        int mat = 0, fiz = 0, turk = 0, kim = 0, muz = 0, ortalama;
        System.out.print("Matematik Ders Notunu Girin : ");
        mat = input.nextInt();

        if (mat<0 || mat>=101) {
            System.out.println("0 -100 arasında bir değer giriniz.");

        }

        else if(mat>0 && mat< 101)  {
            System.out.print("Fizik Ders Notunu Girin : ");
            fiz = input.nextInt();

        }

        if (fiz<0 || fiz>= 101) {
            System.out.println("0 -100 arasında bir değer giriniz.");
        }

        else if (fiz>0 && fiz< 101){
            System.out.print("Türkçe Ders Notunu Girin : ");
            turk = input.nextInt();
        }

        if (turk<0 || turk>= 101){
            System.out.println("0 -100 arasında bir değer giriniz.");
        }

        else if (turk>0 && turk< 101) {
            System.out.print("Kimya Ders Notunu Girin : ");
            kim = input.nextInt();

        }
        if (kim<0 || kim>= 101) {
            System.out.println("0 -100 arasında bir değer giriniz.");
        }
        else if (kim>0 && kim< 101){
            System.out.print("Müzik Ders Notunu Girin : ");
            muz = input.nextInt();
        }
        if  (muz<0 || muz>= 101){
            System.out.println("0 -100 arasında bir değer giriniz.");
        }
        else if(muz>0 && muz< 101)  {
            ortalama = ((mat + fiz + turk + kim + muz) / 5);
            if (ortalama >= 55) {
                System.out.println(("Geçtiniz: ")+ (ortalama));
            } else {
                System.out.println(("Kaldınız: ")+ (ortalama));
            }


        }

    }
}