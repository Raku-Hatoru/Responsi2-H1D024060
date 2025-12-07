// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    public double tunjangan;
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    public Manajer(String nama, double gajiPokok, double tunjangan){
        super(nama,gajiPokok);
        this.tunjangan=tunjangan;
    }

    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent


    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");
        System.out.println("Status: Karyawan Menajer");
        System.out.println("Nama: " + nama+ " | Gaji Pokok: Rp " + gajiPokok+ " | Tunjangan: Rp " + tunjangan);
        System.out.println("Total Pendapatan: Rp "+ (gajiPokok+tunjangan));
    }
}