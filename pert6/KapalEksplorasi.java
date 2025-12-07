public class KapalEksplorasi extends KendaraanGalaksi {

    // ==========================================================
    // ATRIBUT KHUSUS
    // ==========================================================

    // TODO:
    private int modulScan;   // kemampuan scan planet (level 1–5)


    // ==========================================================
    // CONSTRUCTOR
    // ==========================================================

    // TODO:
    public KapalEksplorasi(String namaKendaraan,int KapasitasPenumpang , int modulScan) {
        super(namaKendaraan,KapasitasPenumpang);
        this.modulScan = modulScan;
    }
    // Constructor menerima:
    //   - namaKendaraan
    //   - kapasitasPenumpang
    //   - modulScan


    // ==========================================================
    // IMPLEMENTASI ABSTRACT METHOD
    // ==========================================================

    // @Override
    public  void aktifkanMesin() {
        if (levelEnergi < 15){
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        }else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }
    // Jika energi < 15 → "Energi tidak mencukupi untuk memulai ekspedisi!"
    // Jika cukup → "Kapal eksplorasi siap berangkat!"


    // @Override
    public void jelajah(int jarak){
        if (levelEnergi < 15){
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh  "+jarak+" km.");
        }else {
            levelEnergi = (int) ((int) levelEnergi - ((jarak * (2.0/100.0)) * levelEnergi));
            System.out.println("Kapal eksplorasi menjelajah sejauh "+jarak+" km.");
        }

    }
    // Konsumsi energi: 2% per 1 km (lebih efisien).
    // Jika cukup → kurangi energi & tampilkan jarak perjalanan.


    // @Override
    public void isiEnergi(int jumlah){
        jumlah = levelEnergi + jumlah;
        if (jumlah < 100 ){
            jumlah = 100;
        }
    }
    // Tambah energi secara bertahap sampai 100%.
    // Tampilkan pesan pengisian.


    // ==========================================================
    // METHOD KHUSUS
    // ==========================================================

    // TODO:
    void scanPlanet(String namaPlanet){
        System.out.println("Melakukan scan pada planet "+namaPlanet+" dengan modul level "+modulScan+".");
    }
    // Tampilkan:
    // "Melakukan scan pada planet [namaPlanet] dengan modul level [modulScan]."
}
