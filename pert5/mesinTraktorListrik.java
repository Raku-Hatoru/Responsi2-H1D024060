class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)

    // Constructor
    public double baterai;
    mesinTraktorListrik(String nama, int hp, double tarik, double baterai) {
        super(nama, hp, tarik);
        this.baterai = baterai;
    }

    @Override
    void tampilInfo() {
        super.tampilInfo();
        // Override info traktor listrik
    }

    @Override
    double nilaiPerforma() {
        return (tenagaHP * 1.1) + (baterai * 5);
        // Override performa traktor listrik
    }

    @Override
    String kategoriMesin() {
        return "Mesin Traktor Listrik";
        // Override kategori listrik
    }

    @Override
    void suaraMesin() {
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
        // Suara traktor listrik
    }
}
