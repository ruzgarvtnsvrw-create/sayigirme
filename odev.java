/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevir
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ruzgar = new Scanner(System.in);

        int sayi;
          int toplam = 0;
            int pozitif = 0;
                int negatif = 0;
                    int tek = 0;
                       
      int cift = 0;
                    int enBuyuk = 0;
                          int enKucuk = 0;
                  int asalSayisi = 0;
            int sayac = 0;
        int pozitifToplam = 0;

        while (true) {

            System.out.print("Bir sayi giriniz (Bitirmek icin 0): ");
          
            sayi = ruzgar.nextInt();

            if (sayi == 0) {
                break;
            }

            sayac++;
            toplam = toplam + sayi;

            if (sayac == 1) {
                enBuyuk = sayi;
              
                  enKucuk = sayi;
            }

            if (sayi > enBuyuk) {
              
                enBuyuk = sayi;
              
            }

            if (sayi < enKucuk) {
                              enKucuk = sayi;
            }

            if (sayi > 0) {
                pozitif++;
              
                pozitifToplam = pozitifToplam + sayi;
            } else {
              
                negatif++;
            }

            if (sayi % 2 == 0) {
              
                cift++;
              
            } else {
              
                tek++;
            }

            // asal kontrol iste
            int bolen = 0;

            if (sayi > 1) {
              
                for (int i = 1; i <= sayi; i++) {
                  
                    if (sayi % i == 0) {
                      
                        bolen++;
                    }
                }

                if (bolen == 2) {
                  
                    asalSayisi++;
                }
            }

            // mük sayı kont
            int bolenToplami = 0;

            for (int i = 1; i < sayi; i++) {
              
                if (sayi > 0 && sayi % i == 0) {
                  
                    bolenToplami = bolenToplami + i;
                }
            }

            if (sayi > 0 && bolenToplami == sayi) {
                System.out.println(sayi + " mukemmel sayidir.");
            }

            // basamakv sayı
            int gecici = sayi;
            int basamak = 0;

            if (gecici < 0) {
                gecici = -gecici;
            }

            while (gecici > 0) {
                gecici = gecici / 10;
                basamak++;
            }

            System.out.println("Basamak sayisi: " + basamak);
        }

        if (sayac == 0) {
           
          System.out.println("Hic sayi girilmedi.");
            return;
        }

        System.out.println("\n--- SAYI ANALIZ RAPORU ---");

       
      System.out.println("Pozitif sayi adedi: " + pozitif);
          System.out.println("Negatif sayi adedi: " + negatif);
            System.out.println("Tek sayi adedi: " + tek);
                System.out.println("Cift sayi adedi: " + cift);

        System.out.println("En buyuk sayi: " + enBuyuk);
      
        System.out.println("En kucuk sayi: " + enKucuk);

        System.out.println("Toplam: " + toplam);
      
        System.out.println("Ortalama: " + (double) toplam / sayac);

        System.out.println("En buyuk ve en kucuk farki: " + (enBuyuk - enKucuk));

        System.out.println("Pozitif sayilarin ortalamasi: ");

        if (pozitif > 0) {
            System.out.println((double) pozitifToplam / pozitif);
          
        } else {
            System.out.println("Pozitif sayi girilmedi.");
          
        }

        System.out.println("Asal sayi adedi: " + asalSayisi);

        return;
    }































































  
}
