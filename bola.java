

public class bola {
    private double jariJari;

    // Method untuk mengatur nilai jari-jari
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menampilkan diameter
    public void showDiameter() {
        double diameter = 2 * jariJari;
        System.out.println("Diameter: " + diameter);
    }

    // Method untuk menampilkan luas permukaan
    public void showLuasPermukaan() {
        double luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);
        System.out.println("Luas Permukaan: " + luasPermukaan);
    }

    // Method untuk menampilkan volume
    
    
    public void showVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        System.out.println("Volume: " + volume);
    }
}