class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header

        Karyawan budi = new Karyawan("Budi Santoso",4000000);
        // Buat objek Karyawan biasa (Budi)
        budi.tampilInfo();

        // Buat objek Manajer (Siti)
        Manajer siti =new Manajer("Siti Aminah",6000000,2500000);
        siti.tampilInfo();
        // Tampilkan info Manajer
        
    }
}