public class UjiCoba {
    public static void main(String[] args) {
   
        Bus busMini=new Bus(10);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.plusBerat(66.4);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.plusBerat(87.9);
        busMini.cetak();


        busMini.pluspenumpang(1);
        busMini.plusBerat(10.6);
        busMini.cetak();

        busMini.pluspenumpang(1);
        busMini.plusBerat(49.6);
        busMini.cetak();


        busMini.pluspenumpang(1);
        busMini.plusBerat(100.6);
        busMini.cetak();
        
        busMini.cetak2();
    }
}

