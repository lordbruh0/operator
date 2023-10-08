import java.util.Scanner;
public class TugasPerulangan {
public static void main(String[] args){ 
     
     boolean running = true;
     boolean replay = true;
     while( replay == true ) {
        
     
    Scanner scan = new Scanner(System.in);
       
    System.out.println("------Selamat Datang dI Toko Surya Abadi-----");
    System.out.println("kami menyediahkan barang: \n 1. Sabun Cuci     Rp15000/Batang \n 2. Minyak Goreng  Rp40000/Liter \n 3. Telur          Rp25000/Kg \n 4. Beras          Rp13500/Kg \n 5. Gula           Rp12500/Kg");
    
    
    String nama, belanja, jawab, jawabreplay;
    int jumlahBelanjaan, totalHarga, counter = 0, TotalNota = 0;
    
    

        
    System.out.print("Yang belanja atas nama:");
    nama=scan.nextLine();
    
    System.out.print("Mau belanja apa:");
    belanja=scan.nextLine();
    
   
        if( belanja.equalsIgnoreCase("Sabun Cuci") ){
            
    
                 while( running == true ) {
           System.out.print("Mau beli berapa batang:");
            jumlahBelanjaan=scan.nextInt();
            totalHarga= 15000 * jumlahBelanjaan;
            System.out.println("Total belanjaan adalah: Rp"+totalHarga);
           
                 TotalNota +=totalHarga;
                System.out.println("jadi total semua: Rp"+TotalNota);
         
           
                      System.out.println("Apakah anda sudah selesai belanja?");
                      System.out.print("Jawab [sudah/belum]> ");
                      scan.nextLine();
                      jawab = scan.nextLine();
                    
                      
            if( jawab.equalsIgnoreCase("sudah") ){
                running = false;
            
            
                      System.out.println("!!Terima Kasih sudah belanja " + nama + " datang lagi ya!!");
                
            counter++;
        }
        }        
        }
       
        else if( belanja.equalsIgnoreCase("Minyak Goreng") ){
            
    
                 while( running == true ) {
           System.out.print("1 Liter = 1000 Gram \n Mau beli berapa liter Minyak Goreng:");
            jumlahBelanjaan=scan.nextInt();
            totalHarga= 40000 * jumlahBelanjaan/1000;
            System.out.println("Total belanjaan adalah: Rp"+totalHarga);
         
                      System.out.println("Apakah anda sudah selesai belanja?");
                      System.out.print("Jawab [sudah/belum]> ");
                      scan.nextLine();
                      jawab = scan.nextLine();
                      
            if( jawab.equalsIgnoreCase("sudah") ){
                running = false;
            
                   System.out.println("!!Terima Kasih sudah belanja " + nama + " datang lagi ya!!");
            
                   
                   counter++;
        }
        }        
        }
       
        else if( belanja.equalsIgnoreCase("Telur") ){
            
    
                 while( running == true ) {
           System.out.print("1 Kg = 1000 Gram \n Mau beli berapa Kg Telur:");
            jumlahBelanjaan=scan.nextInt();
            totalHarga= 25000 * jumlahBelanjaan/1000;
            System.out.println("Total belanjaan adalah: Rp"+totalHarga);
           
            
         
           
                      System.out.println("Apakah anda sudah selesai belanja?");
                      System.out.print("Jawab [sudah/belum]> ");
                      scan.nextLine();
                      jawab = scan.nextLine();
                      
            if( jawab.equalsIgnoreCase("sudah") ){
                running = false;
            
    System.out.println("!!Terima Kasih sudah belanja " + nama + " datang lagi ya!!");
            
            counter++;
        }
        }        
        }
       
       else if( belanja.equalsIgnoreCase("Beras") ){
            
    
                 while( running == true ) {
           System.out.print("1 Kg = 1000 Gram \n Mau beli berapa Kg Beras: ");
            jumlahBelanjaan=scan.nextInt();
            totalHarga= 13500 * jumlahBelanjaan/1000;
            System.out.println("Total belanjaan adalah: Rp"+totalHarga);
           
            
         
           
                      System.out.println("Apakah anda sudah selesai belanja?");
                      System.out.print("Jawab [sudah/belum]> ");
                      scan.nextLine();
                      jawab = scan.nextLine();
                      
            if( jawab.equalsIgnoreCase("sudah") ){
                running = false;
            
 System.out.println("!!Terima Kasih sudah belanja " + nama + " datang lagi ya!!");
            counter++;
        }
        }        
        }
       
       else if( belanja.equalsIgnoreCase("Gula") ){
            
    
                 while( running == true ) {
           System.out.print("1 Kg = 1000 Gram \n Mau beli berapa Kg Gula:");
            jumlahBelanjaan=scan.nextInt();
            totalHarga= 12500 * jumlahBelanjaan/1000;
            System.out.println("Total belanjaan adalah: Rp"+totalHarga);
           
            
         
           
                      System.out.println("Apakah anda sudah selesai belanja?");
                      System.out.print("Jawab [sudah/belum]> ");
                      scan.nextLine();
                      jawab = scan.nextLine();
                      
            if( jawab.equalsIgnoreCase("sudah") ){
                running = false;
            
 System.out.println("!!Terima Kasih sudah belanja " + nama + " datang lagi ya!!");
            counter++;
        }
        }        
        }
        
  
                      System.out.println("Apakah anda ingin belanja lagi?");
                      System.out.print("Jawab [iya/tidak]> ");
                      
                      jawabreplay = scan.nextLine();
                      
            if ( jawabreplay.equalsIgnoreCase("tidak") ){
                replay = false;
            System.out.println("!!terima kasih sudah berbelanja!!");
       
            }
    
        
}
}
}




