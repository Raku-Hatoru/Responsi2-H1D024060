public class PesawatTempur extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    private int jumlahRudal;


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    @Override
    public void aktifkanMesin() {
        if (levelEnergi < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }


    @Override
    public void jelajah(int jarak) {
        double konsumsiEnergi = (jarak * (3.0/100.0)) * levelEnergi;

        if (levelEnergi < konsumsiEnergi) {
            System.out.println("Energi tidak cukup (" + String.format("%.2f", konsumsiEnergi) + ") untuk menjelajah sejauh " + jarak + " km.");
        } else {
            levelEnergi -= konsumsiEnergi;
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
            System.out.println("Energi tersisa: " + levelEnergi + "%.");
        }
    }


    @Override
    public void isiEnergi(int jumlah) {
        int energiSebelum = levelEnergi;

        // Tambah energi sampai max 100%.
        levelEnergi = Math.min(100, levelEnergi + jumlah);

        // Tampilkan pesan peningkatan energi.
        System.out.println("Energi pesawat tempur ditingkatkan dari " + energiSebelum + "% menjadi " + levelEnergi + "%.");
    }


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    void tembakRudal(int jumlah) {
        // Jika jumlahRudal cukup
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
            System.out.println("Rudal tersisa: " + jumlahRudal + " unit.");
        } else {
            // Jika tidak cukup
            System.out.println("Gagal menembak. Rudal tidak cukup (Tersedia: " + jumlahRudal + ").");
        }
    }
}