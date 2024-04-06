import java.util.Stack;

public class StrukBelanja06 {
    String nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    double totalHargaBayar;

    public StrukBelanja06(String nomorTransaksi, String tanggalPembelian, int jumlahBarang, double totalHargaBayar) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHargaBayar = totalHargaBayar;
    }
    public String toString() {
        return "Nomor Transaksi: " + nomorTransaksi + "\n" +
                "Tanggal Pembelian: " + tanggalPembelian + "\n" +
                "Jumlah Barang: " + jumlahBarang + "\n" +
                "Total Harga Bayar: " + totalHargaBayar + "\n";
    }
}
   