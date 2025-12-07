class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipe)
    public String tipe;
    // Constructor
    mesinMotor(String nama, int hp, String tipe) {
        super(nama, hp);
        this.tipe = tipe;
    }

    @Override
    void tampilInfo() {
        super.tampilInfo();
        // Override info mesin motor
    }

    @Override
    double nilaiPerforma() {
        return tenagaHP*1.2;
        // Override performa mesin motor
    }

    @Override
    String kategoriMesin() {
        return "mesin motor";
        // Override kategori
    }

    void suaraMesin() {
        System.out.print("Brummm! Mesin motor menyala!");
        // Suara mesin motor
    }
}
