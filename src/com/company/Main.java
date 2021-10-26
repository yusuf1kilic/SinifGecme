package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        //matematik
        int mat1,mat2,mat3;
        System.out.println("lütfen 3 matematik notunuzu giriniz");
        System.out.println("ilk notunuzu giriniz");
        mat1= girdi.nextInt();
        System.out.println("ikinci notunuzu giriniz");
        mat2= girdi.nextInt();
        System.out.println("üçüncü notunuzu giriniz");
        mat3= girdi.nextInt();
        System.out.println("3 notunuzun ortalaması şudur :"+ (mat1+mat2+mat3)/3);

        //ingilizce

        int ing1,ing2,ing3;
        System.out.println("Lütfen 3 ingilicze notunuzu giriniz");
        System.out.println("ilk notunuzu giriniz");
        ing1=girdi.nextInt();
        System.out.println("ikinci notunuzu giriniz");
        ing2=girdi.nextInt();
        System.out.println("üçüncü notunuzu giriniz");
        ing3=girdi.nextInt();
        System.out.println("ingilizce notunuzun ortalaması :" +(ing1+ing2+ing3)/3);
        int ortalama = (mat1+mat2+mat3+ing1+ing2+ing3)/6;



        String sonuc = ortalama >= 50 ?"notunuzu 50 den yüksek geçtiniz":
                " ortalama notunz 50 den küçük sınıfta kaldınız geçemediniz";
        System.out.println(sonuc);


    }
}
