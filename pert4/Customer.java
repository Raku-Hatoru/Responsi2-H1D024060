class Customer {
    public String nama;
    public String id;
    public int total;
    public String Status = "Customer Biasa";
    // TODO: Buatkan atribut

    // TODO: Sediakan constructor
    public Customer(String nama, String id, int total) {
        this.nama = nama;
        this.id = id;
        this.total = total;
    }
    void tampilkanInfo(String status) {
        System.out.println("Status: "+status);
        System.out.println("Nama: "+nama+" | ID: "+id+" | Total Belanja: Rp "+total);
    }
    void tampilkanInfo() {
        tampilkanInfo("Customer Biasa");
    }
}
