public class UjiCoba {
    public static void main(String[] args) {
   
        Bus busMini=new Bus(20);
        busMini.cetak();

        busMini.pluspenumpang(5);
        busMini.plusBerat(66.4);
        busMini.plusBerat(40);
        busMini.plusBerat(50);
        busMini.plusBerat(60);
        busMini.plusBerat(34);
        busMini.cetak();


        busMini.pluspenumpang(8);
        busMini.plusBerat(61.4);
        busMini.plusBerat(56);
        busMini.plusBerat(58);
        busMini.plusBerat(69);
        busMini.plusBerat(78);
        busMini.plusBerat(47);
        busMini.plusBerat(50 );
        busMini.cetak();
        
        busMini.cetak2();
    }
}

//hello world//