import java.util.Scanner;
    public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;
        
        do {
            System.out.println("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();
            
            // Jika pengguna ingin keluar
            if (jenis == 0) {
                break;
            }

            // Validasi jenis kendaraan
            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid! Masukkan 1 untuk Mobil atau 2 untuk Motor.");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            
            // Hitung tarif
            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) { // Mobil
                total += durasi * 3000;
            } else if (jenis == 2) { // Motor
                total += durasi * 2000;
            }

        } while (jenis != 0);
        System.out.println("Total pembayaran parkir hari ini: Rp " + total);
        sc.close();

    }
}

