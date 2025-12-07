class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    public String id ;
    public String NamaBarang;
    public double harga;
    public int stok;

    public BarangMusik (String id,String nama) {
        this.id=id;
        this.NamaBarang=nama;
    }
    public BarangMusik(String id,String nama,double harga) {
        this.id=id;
        this.NamaBarang=nama;
        this.harga=harga;
    }
    public BarangMusik(String id, String nama,double harga, int stok) {
        this.id=id;
        this.NamaBarang=nama;
        this.harga=harga;
        this.stok=stok;
    }
    // Constructor
    
    
    void ubahHarga(double hargaBaru) {
        harga=hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        stok+=jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + NamaBarang +
                " | Kode: " + id +
                " | Harga: Rp " + harga +
                " | Stok: " + stok + " unit");
    }
}