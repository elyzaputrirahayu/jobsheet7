import java.util.Scanner;

public class PenjualanTiketBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int hargaTiket = 50000;
        int jumlahTiket;
        double totalHarga;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik -1 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == -1) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, silakan masukkan ulang!");
                continue; // kembali ke atas perulangan
            }
            if (jumlahTiket > 10) {
                totalHarga = jumlahTiket * hargaTiket * 0.85; // diskon 15%
            } else if (jumlahTiket > 4) {
                totalHarga = jumlahTiket * hargaTiket * 0.90; // diskon 10%
            } else {
                totalHarga = jumlahTiket * hargaTiket; // tanpa diskon
            }
            System.out.println("Total harga pembelian: Rp " + totalHarga);
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHarga;

        System.out.println("======================================");
        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
        System.out.println("======================================");
        }
        
    }
}
