class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    public String level;
    public int reward;
    public String Status = "Member";

    // TODO: Buat constructor dengan super
    public Member(String nama, String id, int total, int reward, String level) {
        super(nama,id,total);
        this.level=level;
        this.reward=reward;
    }
    @Override
    void tampilkanInfo() {

        super.tampilkanInfo(Status);
        System.out.println("Poin Reward: "+reward+" | Level: "+level);
    }
}
