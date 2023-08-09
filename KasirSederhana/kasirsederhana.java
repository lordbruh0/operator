package KasirSederhana;
import java.util.Scanner;
public class kasirsederhana{
public static void main(String[]args){

    System.out.println("selamat datang di tempat makan Ryo");
    System.out.println("menu");
    System.out.println("Soto Ayam");
    System.out.println("Rawon Daging");
    System.out.println("Mie Goreng");
    System.out.println("Tahu Telor");
    System.out.println("Sate Kambing");
    
    //harga menu
    int sotoayam, rawondaging, miegoreng, tahutelor, satekambing;
    sotoayam = 15000;
    rawondaging = 17000;
    miegoreng = 5000;
    tahutelor = 8000;
    satekambing = 20000;
    
    //kode pembelian
    String sotoAyam, rawonDaging, mieGoreng, tahuTelor, sateKambing;
   sotoAyam="soto ayam";
   rawonDaging="rawon daging";
   mieGoreng="mie goreng";
   tahuTelor="tahu telor";
   sateKambing="sate kambing";
   
    Scanner scan= new Scanner(System.in);
   
   //makananyang di beli
   String makananyangdibeli;
    System.out.println("makanan yang dibeli");
   makananyangdibeli=scan.nextLine();
   
   
    //jumlah pembelian
    int jumlahpembelian;
    jumlahpembelian= scan.nextInt();
    System.out.print("jumlah pembelian:");
    
    
    
}
}
