class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] kumpulanmesin = new defaultMesin[5];

        // Isi array dengan objek mesinMotor
        kumpulanmesin[0] = new mesinMotor("Honda Supra X",125,"Bebek");
        kumpulanmesin[1] = new mesinTraktor ("Kubota MX5200",520,5.0);
        kumpulanmesin[2] = new mesinTraktorListrik ("EcoTrac Z900",300,4.2,70);
        kumpulanmesin[3] = new mesinMotor("Yamaha R25",250,"Sport");
        kumpulanmesin[4] = new mesinTraktorListrik ("Volta FarmX",200,3.5,80);

        System.out.println("=== DATA MESIN MEGATECH ===");

        // Loop untuk menampilkan info masing-masing mesin
        for(int i = 0; i < kumpulanmesin.length; i++){
            kumpulanmesin[i].tampilInfo();
            kumpulanmesin[i].kategoriMesin();
            kumpulanmesin[i].nilaiPerforma();
        }
        // Loop untuk menampilkan kategori dan performa

        System.out.println("=== SUARA MESIN ===");
        for(defaultMesin mesin : kumpulanmesin){

            if (mesin instanceof mesinMotor) {

                ((mesinMotor) mesin).suaraMesin();
            }

            else if (mesin instanceof mesinTraktor) {
                ((mesinTraktor) mesin).suaraMesin();
            }

        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin tertinggi = kumpulanmesin[0];
        for(int i = 0; i < kumpulanmesin.length; i++){
            if (kumpulanmesin[i].nilaiPerforma() > tertinggi.nilaiPerforma()){
                tertinggi = kumpulanmesin[i];
            }
        }
        System.out.println(tertinggi.getNamaMesin()+": "+tertinggi.nilaiPerforma());
        // Logika menemukan mesin dengan performa tertinggi

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for(int i = 0; i < kumpulanmesin.length - 1; ++i) {

            int minPerformaIdx = i;
            for(int j = i + 1; j < kumpulanmesin.length; ++j) {
                if(kumpulanmesin[j].nilaiPerforma() > kumpulanmesin[minPerformaIdx].nilaiPerforma()) {
                    minPerformaIdx = j;
                }
            }

            defaultMesin temp = kumpulanmesin[minPerformaIdx];
            kumpulanmesin[minPerformaIdx] = kumpulanmesin[i];
            kumpulanmesin[i] = temp;
        }

        for (int i = 0; i < 3; ++i) {
            System.out.printf("%d. %s -> %f\n", i+1, kumpulanmesin[i].getNamaMesin(), kumpulanmesin[i].nilaiPerforma());
        }
        // Logika sorting 3 performa tertinggi
    }
}
