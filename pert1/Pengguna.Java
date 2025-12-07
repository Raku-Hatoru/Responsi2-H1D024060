class Pengguna {
    final double faktorAktivitas = 1.2;
    public int umur;
    public double beratBadan;
    public double tinggiBadan;
    public double BMI;
    public double kalori;

    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas

    public Pengguna(int umur,double beratBadan,double tinggiBadan) {
        this.umur = umur;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    double hitungBMI() {

        tinggiBadan = tinggiBadan/100;
        BMI = beratBadan/(tinggiBadan*tinggiBadan);
        return BMI;
        // Lengkapi method ini
    }

    void tampilKategori() {
        if (BMI < 18.5 ) {
            System.out.println("Kategori: Kurus");
        } else if (BMI < 25 ) {
            System.out.println("Kategori: Normal");
        }else if (BMI >=25 ) {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        kalori = beratBadan*faktorAktivitas *10 ;
        return kalori;
        // Lengkapi method ini
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: "+umur+" Tahun");
        System.out.println("Tinggi: "+tinggiBadan+" cm");
        System.out.println("BMI: "+hitungBMI());
        tampilKategori();
        System.out.println("Kebutuhan Kalori: "+hitungKalori()+"kal/hari");
        // Lengkapi method ini
    }
}