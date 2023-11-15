public class VirtualDemo {
    public static void main(String[] args) {
        Pegawai s = new Gaji("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai --");
        e.mailCheck();
        
        // Menggunakan polimorfisme untuk mengakses metode computePay
        System.out.println("\nMenghitung pembayaran untuk " + s.getName() + ": " + s.computePay());
        System.out.println("Menghitung pembayaran untuk " + e.getName() + ": " + e.computePay());
    }
}
