
package project1;
import java.util.Scanner;
public class Project1{
 public static void main(String [] args ){
     
       
    Scanner scan= new Scanner(System.in);
    
    //harga menu
    int sotoayam, rawondaging, miegoreng, tahutelor, satekambing;
    sotoayam = 15000;
    rawondaging = 17000;
    miegoreng = 5000;
    tahutelor = 8000;
    satekambing = 20000;
    
    System.out.println("selamat datang di tempat makan Ryo");
    System.out.println("menu");
    System.out.println("Soto Ayam:Rp"+sotoayam);
    System.out.println("Rawon Daging:Rp"+rawondaging);
    System.out.println("Mie Goreng:Rp"+miegoreng);
    System.out.println("Tahu Telor:Rp"+tahutelor);
    System.out.println("Sate Kambing:Rp"+satekambing);
    //kode pembelian
    
    String sotoAyam, rawonDaging, mieGoreng, tahuTelor, sateKambing;
   sotoAyam="soto ayam";
   rawonDaging="rawon daging";
   mieGoreng="mie goreng";
   tahuTelor="tahu telor";
   sateKambing="sate kambing";
     System.out.println("");
    
   //makananyang di beli
   String makananyangdibeli;
    System.out.print("makanan yang dibeli:");
   makananyangdibeli=scan.nextLine();

   
    //jumlah pembelian
    int jumlahpembelian;
    System.out.print("jumlah pembelian:");
     jumlahpembelian= scan.nextInt();
     
     
    //harga barang
    int Sotoayam, Rawondaging, Miegoreng, Tahutelor, Satekambing;
    Sotoayam=15000;
    Rawondaging=17000;
    Miegoreng=5000;
    Tahutelor=8000;
    Satekambing=20000;
    
    //total harga menu
    int hargaSotoayam = jumlahpembelian*Sotoayam;
    int hargaRawondaging = jumlahpembelian*Rawondaging;
    int hargaMiegoreng = jumlahpembelian*Miegoreng;
    int hargaTahutelor = jumlahpembelian*Tahutelor;
    int hargaSatekambing = jumlahpembelian*Satekambing;
       
  if("soto ayam".equals( makananyangdibeli)){
        System.out.println("menu yang dibeli:"+sotoAyam);
        System.out.println("total harga:"+hargaSotoayam);
    }
     if("rawon daging".equals( makananyangdibeli)){
         System.out.println("menu yang dibeli:"+rawonDaging);
           System.out.println("total harga:"+hargaRawondaging);
     }
     if("mie goreng".equals( makananyangdibeli)){
         System.out.println("menu yang dibeli:"+mieGoreng);
           System.out.println("total harga:"+hargaMiegoreng);
     }
     if("tahu telor".equals( makananyangdibeli)){
         System.out.println("menu yang dibeli:"+tahuTelor);
           System.out.println("total harga:"+hargaTahutelor);
    }
     if("sate kambing".equals( makananyangdibeli)){
         System.out.println("menu yang dibeli:"+sateKambing);
           System.out.println("total harga:"+hargaSatekambing);
     }
     

 }
}

//     System.out.println("<===gaji pekerja===>");
//     
//     Scanner scan= new Scanner(System.in);
//
//     String nama;
//     System.out.print("nama pekerja?");
//     nama=scan.nextLine();
//     
//     double lamatahunbekerja;
//     System.out.print("lama bekerja?");
//     lamatahunbekerja= scan.nextDouble();
//     
//     scan.nextLine();
//     
//     double gaji;
//     System.out.print("jumlah gaji?");
//     gaji=scan.nextDouble();
//   
//     
//     double gajidiskon;
//     gajidiskon= (gaji)*5/100;
//     
//     if(lamatahunbekerja>3){
//         System.out.print("gaji pekerja:"+gajidiskon);
//     }
//     
//     if(lamatahunbekerja < 3){
//     System.out.println("gaji pekerja:"+gaji);
// }
//             
         
     
     
     
     
     
     
     
     
     
     
     
     
//     System.out.println("alat hitung suhu");
//     Scanner scan=new Scanner(System.in);
//     
//     
//     double suhu;
//     System.out.print("suhu celsius:");
//     suhu=scan.nextDouble();
//   scan.nextLine();
//   
//        double Reamur, Fahreihait, Kelvin;
//    Reamur = (suhu*4)/5;
//    Fahreihait = (9/5*suhu)+32;
//    Kelvin = (273.15-suhu);
//    
//      System.out.print("pilih operator:");
//     String operator = scan.nextLine();
//  String Re, Fa, Ke;
//     Re="R";
//     Fa="F";
//     Ke="K";
//     
//    if("R".equals(operator) ){
//      System.out.println("suhu Reamur"+Reamur);
//    }
//   
//     if("F".equals(operator) ){
//      System.out.println("suhu fahrenheit"+Fahreihait);
//    }
//      if("K".equals(operator) ){
//      System.out.println("suhu kelvin"+Kelvin);
//    }
     
//     
//     System.out.println("selamat datang di website untuk menghitung IMT");  
//     double berat, tinggi, Imt;
//String nama;
//Scanner scan=new Scanner(System.in);
//
//     System.out.print("nama kamu?");
//     nama=scan.nextLine();
//
//     System.out.print("berat badan kamu?");
//     berat=scan.nextDouble();
//      
//     scan.nextLine();
//     System.out.print("tinggi badan kamu?");
//     tinggi=scan.nextDouble();
//     
//     Imt=((tinggi*tinggi)/berat);
//   
//     System.out.println("indeks masa tubuh kamu=" +Imt+ "kg/m2");
//
//     if(Imt < 18.5){  
//         System.out.println(" maaf indeks masa tubuh kamu kurang");
//     }
//       
//     if(Imt == 18.5){
//         System.out.println("selamat indeks masa tubuh kamu normal");
//     }
//     
//     if(Imt > 18.5){
//         System.out.println("maaf indeks masa tubuh kamu berlebihan");
//     }
//int Laptop, Hardisk, Mouse;
//Laptop=7;
//Hardisk=11;
//Mouse=21;
//double harga_Laptop, harga_Hardisk, harga_Mouse;
//harga_Laptop= 100000000;
//harga_Hardisk= 1500000;
//harga_Mouse= 150.000;
//double jumlah_barang_total;
//jumlah_barang_total= Laptop + Hardisk + Mouse;
//
//    System.out.println("jumlah barang yang tersedia:" +Laptop+ "+" +Hardisk+ "+" +Mouse+ "=" +jumlah_barang_total);
//int nilaix, nilaiy;
//nilaix= 90;
//nilaiy= 100;
//
//int nilairata;
//nilairata= (nilaix+nilaiy)/2;
//     System.out.println("nilai rata-rata"+ nilairata);
     
     
     
   




