public class UjiCustomer {
    public static void main(String[] args) {
        Customer budi = new Customer("Budi Santoso","CST-001",500000);
        // TODO: Buat object Customer
        Member siti = new Member("Siti Aminah","MBR-110",1250000,240,"Gold");
        // TODO: Buat object Member

        // TODO: Tampilkan judul data pelanggan
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");
        // TODO: Tampilkan info untuk Customer biasa
        budi.tampilkanInfo();
        // TODO: Tampilkan info untuk pelanggan Member
        siti.tampilkanInfo();
    }
}
