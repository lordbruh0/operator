public class Bus {
    private int penumpang, maxpenumpang;
    private double beratTotal;

    // konstruktor
    public Bus(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
        beratTotal = 0;
    }

    // method mutator
    public void pluspenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Overload penumpang");
        } else {
            this.penumpang = temp;
        }
    }


    public void plusBerat(double berat) {
        beratTotal += berat;
    }

    public double getAverage() {
       
            return beratTotal / penumpang;        
        }


    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("penumpang seharusnya adalah =" + maxpenumpang);
        System.out.println("Berat sekarang = " + beratTotal);
    }
    public void cetak2(){
        System.out.println("Berat rata rata = " + getAverage());
    }
}
