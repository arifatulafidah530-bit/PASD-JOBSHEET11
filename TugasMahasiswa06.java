public class TugasMahasiswa06 {
    String nim, nama, keperluan;

    public TugasMahasiswa06(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampil() {
        System.out.println(nama + " | " + nim + " | " + keperluan);
    }
}