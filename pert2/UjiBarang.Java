class UjiBarang {
    public static void main(String[] args) {
        // Buat objek barang pertama gitar
        BarangMusik gitarakustik = new BarangMusik("GTR-001","Gitar Akustik Yamaha");


        // Atur harga gitar
        gitarakustik.harga = 1500000;
        
        // Tambah stok gitar
        gitarakustik.stok = 5;
        
        // Buat objek drum
        BarangMusik drum = new BarangMusik("DRM-001","Drum Set Pearl",8500000,3);
        
        // Tampilkan informasi kedua barang
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitarakustik.tampilInfo();
        drum.tampilInfo();
        
    }
}