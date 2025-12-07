public class UjiSDM {
    public static void main(String[] args) {
        
        // ==========================================================
        // DATA UJI COBA
        // ==========================================================
        
        // 1. BUAT OBJEK ProgrammerMagang
        // Gunakan constructor dengan data: "Andi", 50000.0, "1234".
        ProgrammerMagang magang = new ProgrammerMagang("Andi", 50000, "1234");

        
        // 2. PENGUJIAN METODE BERURUTAN
        System.out.println("\n=== Pengujian Programmer Magang ===\n");
        // Panggil method hitungGaji(160).
        int totalJamKerja = 160;
        double gaji = magang.hitungGaji(totalJamKerja);
        System.out.printf("Gaji "+magang.getNama()+" "+totalJamKerja+" adalah: Rp "+ gaji);
        // Cetak hasil dari method getStatusCuti().
        System.out.println("Status Cuti: " + magang.getStatusCuti());
        // Panggil login("9999") (Tes PIN salah).
        magang.login("9999");
        // Panggil login("1234") (Tes PIN benar).
        magang.login("1234");
        // Cetak hasil dari method getRoleAkses().
        System.out.println("Role Akses: " + magang.getRoleAkses());

        // Panggil perpanjangKontrak(6).
        magang.perpanjangKontrak(6);


        // Panggil logout().
        magang.logout();
    }
}