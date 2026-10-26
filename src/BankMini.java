import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Rekening rekening = new Rekening("001", "Ani", 100000);

        int pilihan;
        int jumlah;

        System.out.println(" BANK MINI ");
        System.out.print("Rekening ");
        rekening.tampilkanInfo();

        do {
            System.out.print(
                    "Menu (1 setor, 2 tarik, 3 info, 0 keluar): "
            );
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Jumlah: ");
                    jumlah = input.nextInt();

                    if (rekening.setor(jumlah)) {
                        System.out.println("Berhasil");
                    } else {
                        System.out.println("Ditolak");
                    }
                    break;

                case 2:
                    System.out.print("Jumlah: ");
                    jumlah = input.nextInt();

                    if (rekening.tarik(jumlah)) {
                        System.out.println("Berhasil");
                    } else {
                        System.out.println("Ditolak");
                    }
                    break;

                case 3:
                    rekening.tampilkanInfo();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Menu tidak dikenal.");
            }
        } while (pilihan != 0);

        System.out.println("\n SALDO AKHIR ");
        rekening.tampilkanInfo();

        input.close();
    }
}