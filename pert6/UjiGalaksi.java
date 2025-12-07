public class UjiGalaksi {
    public static void main(String[] args) {

        // ==========================================================
        // PEMBUATAN OBJEK
        // ==========================================================

        // TODO:
        PesawatTempur pesawat = new PesawatTempur("Astra-Fury", 2, 8);


        // TODO:
        KapalEksplorasi kapal = new KapalEksplorasi("Voyager X", 10, 4);


        // ==========================================================
        // PENGUJIAN PERILAKU
        // ==========================================================

        System.out.println("--- PENGUJIAN PESAWAT TEMPUR ---");

        // TODO:
        pesawat.aktifkanMesin();

        pesawat.jelajah(10);

        // Pesawat menjelajah 30 km
        pesawat.jelajah(30);

        // Pesawat menembak 3 rudal
        pesawat.tembakRudal(3);

        // Tampilkan status pesawat
        pesawat.tampilaninfo();

        System.out.println("\n--- PENGUJIAN KAPAL EKSPLORASI ---");

        // TODO:
        // Aktifkan mesin kapal eksplorasi
        kapal.aktifkanMesin();

        // Kapal menjelajah 15 km
        kapal.jelajah(15);

        // Kapal melakukan scanPlanet("Kepler-442b")
        kapal.scanPlanet("Kepler-442b");

        // Tampilkan status kapal
        kapal.tampilaninfo();

    }
}
