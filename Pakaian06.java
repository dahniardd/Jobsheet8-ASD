public class Pakaian06 {
   String jenis, warna, merk, ukuran;
   double harga;
   
   Pakaian06(String jenis, String warna, String merk, String ukuran, double harga) {
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
   }
    int size;
    int top;
    Pakaian06 data[];

    public Pakaian06(int size) {
        this.size = size;
        data = new Pakaian06[size];
        top = -1;
    }
    public boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Pakaian06 pkn) {
        if (!IsFull()) {
           top++;
           data[top] = pkn; 
        } else {
            System.out.println("Isi Stack penuh!");
        }
    }
    public void pop() {
        if (!IsEmpty()) {
            Pakaian06 x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stock masih kosong");
        }
    }
    public void peek() {
        System.out.println("Elemen teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " 
                            + data[top].ukuran + " " + data[top].harga + " ");
    }
    public void print() {
        System.out.println("Isi stack : ");
        for(int i = top; i>=0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println(" ");
    }
    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i>=0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan!");
        } else {
            System.out.println("Stack masih kosong!");
        }
    }
}
