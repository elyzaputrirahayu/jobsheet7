import java.util.Scanner;

public class kafeDoWhile08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Kopi, Teh, Roti, totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        String namaPelanggan;

        do {
            System.out.println("masukkan nama pelanggan (ketik 'batal' untuk keluar)");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("jumlah kopi :");
            Kopi = sc.nextInt();
            System.out.println("jumlah teh :");
            Teh = sc.nextInt();
            System.out.println("jumlah roti :");
            Roti = sc.nextInt();

            totalHarga = (Kopi*hargaKopi) + (Teh*hargaTeh) + (Roti* hargaRoti);
            System.out.println("Total yang harus dibayar : Rp" + totalHarga);
            sc.nextLine();
        } while(true);
    }
}
