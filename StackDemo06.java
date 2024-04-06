import java.util.Scanner;

public class StackDemo06 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        Stack06 stk = new Stack06(5);

        char pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Cari dan Tampilkan Data Pakaian dengan Harga Tertinggi");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi (1-6): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine(); // Consume newline

                    Pakaian06 p = new Pakaian06(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    stk.getMax();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine(); // Consume newline
        } while (pilih == 'y' || pilih == 'Y');
    }
}