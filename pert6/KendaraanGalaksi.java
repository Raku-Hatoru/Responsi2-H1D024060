public abstract class KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT/STATE (semua private)
    // ==========================================================

    // TODO:
    // - String namaKendaraan
    // - int levelEnergi         (0–100)
    // - int kapasitasPenumpang
    public String namaKendaraan;
    public int levelEnergi;
    int kapasistasPenumpang;

    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================
    public KendaraanGalaksi(String namaKendaraan, int kapasistasPenumpang) {
        this.namaKendaraan = namaKendaraan;
        this.levelEnergi = 100;
        this.kapasistasPenumpang = kapasistasPenumpang;
    }
    // TODO:
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    // levelEnergi default = 100.


    // ==========================================================
    // GETTER
    // ==========================================================

    // TODO: Getter namaKendaraan

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    // TODO: Getter levelEnergi

    public int getLevelEnergi() {
        return levelEnergi;
    }

    // TODO: Getter kapasitasPenumpang
    public int getKapasistasPenumpang() {
        return kapasistasPenumpang;
    }


    // ==========================================================
    // METHOD BIASA
    // ==========================================================

    // TODO:
    // Method final tampilStatus()
    void tampilaninfo(){
        System.out.println(namaKendaraan+" | "+levelEnergi+"% | "+kapasistasPenumpang+"awak");
    }
    // Format:
    // "[namaKendaraan] | Energi: [levelEnergi]% | Kapasitas: [kapasitasPenumpang] awak"


    // ==========================================================
    // ABSTRACT METHOD (WAJIB DIIMPLEMENTASI SUBCLASS)
    // ==========================================================

    // TODO:
    abstract void aktifkanMesin();

    // TODO:
    abstract void jelajah(int jarak);

    // TODO:
    abstract void isiEnergi(int jumlah);
}
