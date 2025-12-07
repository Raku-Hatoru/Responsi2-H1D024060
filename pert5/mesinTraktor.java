class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor (kapasitasTarik)
    public double tarik;
    // Constructor
    mesinTraktor(String nama, int hp, double tarik) {
        super(nama, hp);
        this.tarik = tarik;
    }

    @Override
    void tampilInfo() {
        super.tampilInfo();
        // Override info mesin traktor
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 0.9) + (tarik * 10);
        // Override performa traktor
    }

    @Override
    String kategoriMesin() {
        return "mesin Traktor";
        // Override kategori traktor
    }

    void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
        // Suara traktor
    }
}
