class defaultMesin {
    // Variabel umum mesin (namaMesin, tenagaHP)
    public String namaMesin;
    public int tenagaHP;

    // Constructor
    defaultMesin(String nama, int hp) {
        this.namaMesin = nama;
        this.tenagaHP = hp;
    }
    public String getNamaMesin() {
        return namaMesin;
    }
    void tampilInfo() {
        System.out.println("Mesin: " + this.namaMesin+" | Tenaga: "+this.tenagaHP);
        // Tampilkan info dasar mesin
    }

    double nilaiPerforma() {
        // Hitung performa dasar
        return tenagaHP * 1.0;
    }

    String kategoriMesin() {
        // Kategori default
        return "mesin umum";
    }
}
