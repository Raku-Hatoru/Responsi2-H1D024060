class Karyawan {
    // Deklarasikan variabel/state dasar (nama, gajiPokok)
    public String nama;
    public double gajiPokok;

    // Gunakan access modifier yang tepat agar bisa diakses oleh subclass (misal: protected)
    
    
    // Constructor untuk inisialisasi nama dan gajiPokok
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    // Method untuk menampilkan informasi dasar karyawan
    void tampilInfo() {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");
        System.out.println("Status: Karyawan Biasa");
        System.out.println("Nama: " + nama+ " | Gaji Pokok: Rp " + gajiPokok);
        
    }
}