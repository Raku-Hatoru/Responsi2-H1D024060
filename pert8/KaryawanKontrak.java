public interface KaryawanKontrak {
    
    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================
    double hitungGaji(int jamKerja);
    // DEKLARASI METHOD 1: hitungGaji
    // Menerima satu parameter: int jamKerja
    // Mengembalikan nilai: double (total gaji)

    void perpanjangKontrak(int durasiBulan);
    // DEKLARASI METHOD 2: perpanjangKontrak
    // Menerima satu parameter: int durasiBulan
    // Mengembalikan nilai: void
    
    
    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
    // DEKLARASI DEFAULT METHOD: getStatusCuti
    // Tidak menerima parameter
    // Mengembalikan nilai: String "Tersedia 12 hari"
    
}