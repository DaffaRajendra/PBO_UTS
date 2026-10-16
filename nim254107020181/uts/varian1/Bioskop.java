package nim254107020181.uts.varian1;

public class Bioskop {
    private String nama;
    private Studio[] daftarStudio;
    private Manajer manajer;

    public Bioskop(String nama, int jumlahStudio, int kapasitasStudio) {
        this.nama = nama;
        this.daftarStudio = new Studio[Math.max(jumlahStudio, 0)];
        for (int i = 0; i < daftarStudio.length; i++) {
            daftarStudio[i] = new Studio(i + 1, kapasitasStudio);
        }
    }

    public void setManajer(Manajer manajer) {
        this.manajer = manajer;
    }

    public boolean jualTiket(Tiket t) {
        return jualTiket(t, 1);
    }

    public boolean jualTiket(Tiket t, int nomorStudio) {
        if (t == null) {
            System.out.println("Tiket tidak valid.");
            return false;
        }
        Studio s = getStudio(nomorStudio);
        if (s == null) {
            System.out.println("Studio " + nomorStudio + " tidak tersedia.");
            return false;
        }
        return s.jual(t);
    }

    public Studio getStudio(int nomor) {
        if (nomor < 1 || nomor > daftarStudio.length) {
            return null;
        }
        return daftarStudio[nomor - 1];
    }

    public void tampilInfo() {
        String namaManajer = (manajer == null) ? "-" : manajer.getNama();
        System.out.println("Bioskop " + nama + " | Jumlah studio: " + daftarStudio.length
                + " | Manajer: " + namaManajer);
    }
}
