public interface AksesSistem {
    
    // ==========================================================
    // METHOD ABSTRAK (WAJIB DIIMPLEMENTASIKAN DI CLASS ProgramerMagang)
    // ==========================================================
    void login(String pin);
    // DEKLARASI METHOD 1: login
    // Menerima satu parameter: String pin
    // Mengembalikan nilai: void

    void logout();
    // DEKLARASI METHOD 2: logout
    // Tidak menerima parameter
    // Mengembalikan nilai: void
    
    
    // ==========================================================
    // DEFAULT METHOD (OPSIONAL DI-OVERRIDE)
    // ==========================================================
    default String getRoleAkses() {
        return "Staff Biasa";
    }
    // DEKLARASI DEFAULT METHOD: getRoleAkses
    // Tidak menerima parameter
    // Mengembalikan nilai: String "Staff Biasa"
    
}