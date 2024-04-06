import java.util.Stack;
public class StrukMain06 {
public static void main(String[] args) {
     // Membuat stack untuk menyimpan data struk belanja
     Stack<StrukBelanja06> stackStruk = new Stack<>();

     // Memasukkan delapan struk belanja ke dalam stack
     stackStruk.push(new StrukBelanja06("001", "2024-01-05", 3, 150000));
     stackStruk.push(new StrukBelanja06("002", "2024-01-12", 2, 100000));
     stackStruk.push(new StrukBelanja06("003", "2024-01-19", 4, 200000));
     stackStruk.push(new StrukBelanja06("004", "2024-01-26", 5, 250000));
     stackStruk.push(new StrukBelanja06("005", "2024-02-02", 1, 50000));
     stackStruk.push(new StrukBelanja06("006", "2024-02-09", 2, 100000));
     stackStruk.push(new StrukBelanja06("007", "2024-02-16", 3, 150000));
     stackStruk.push(new StrukBelanja06("008", "2024-02-23", 2, 100000));

     // Menampilkan informasi struk belanja yang masih tersimpan di dalam stack
     System.out.println("Informasi Struk Belanja yang Tersimpan di Dalam Stack:");
     for (StrukBelanja06 struk : stackStruk) {
         System.out.println(struk);
     }

     // Proses pengambilan lima struk belanja untuk ditukarkan dengan voucher belanja
     System.out.println("\nProses Pengambilan Lima Struk Belanja untuk Ditukarkan dengan Voucher:");
     for (int i = 0; i < 5; i++) {
         if (!stackStruk.isEmpty()) {
             StrukBelanja06 strukDitukar = stackStruk.pop();
             System.out.println("Struk yang ditukar ke-" + (i + 1) + ":");
             System.out.println(strukDitukar);
         } else {
             System.out.println("Stack struk belanja sudah kosong.");
             break;
         }
     }
 }
} 