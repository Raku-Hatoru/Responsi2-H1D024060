public class EWalletPayment implements PaymentMethod {

    // TODO: Buat atribut yang diperlukan, misalnya:
    public String provider;
    public double saldo;
    public double nominal;
    // - nama penyedia layanan (contoh: Dana, OVO, Gopay)
    // - jumlah saldo
    // - nominal transaksi

    // TODO: Buat constructor untuk mengisi nilai atribut
    public EWalletPayment(String provider, double saldo, double nominal) {
        this.provider = provider;
        this.saldo = saldo;
        this.nominal = nominal;
    }
    // TODO: Implementasikan semua method yang ada pada interface PaymentMethod

    // Catatan:
    // - Pada method processPayment(), lakukan pengecekan kecukupan saldo

    @Override
    public void processPayment() {
        System.out.println("Memproses pembayaran sebesar "+nominal);
        double kembalian = saldo - (nominal + getTransactionFee());
        if (kembalian <= 0) {
            System.out.println("Pembayaran Gagal");
        }else {
            this.saldo = kembalian;
            System.out.println("Pembayaran berhasil! ");
        }
    }
    public double getBalance() {
        return saldo;
    }
    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi: Pembayaran dilakukan melalu " + provider ;
    }
    public double getTransactionFee() {
        return 2000;
    }
    // - Jika saldo cukup, kurangi saldo lalu tampilkan pesan berhasil
    // - Jika saldo tidak cukup, tampilkan pesan gagal

}
