import java.util.Scanner;

public class StackMain06 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        Stack06 stk = new Stack06(5);
        
        char pilih;
        do {
            System.out.print("Jenis : ");
            String jenis = sc.nextLine();
            System.out.print("Warna : ");
            String warna = sc.nextLine();
            System.out.print("Merk : ");
            String merk = sc.nextLine();
            System.out.print("Ukuran : ");
            String ukuran = sc.nextLine();
            System.out.print("Harga : ");
            double harga = sc.nextDouble();

            Pakaian06 p = new Pakaian06 (jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah anda akan menambahkan data bau ke stack (y/n)? ");
            pilih = sc.next() .charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');

       stk.print();
       stk.pop();
       stk.peek();
       stk.print();
    }
}