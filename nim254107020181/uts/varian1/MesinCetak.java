package nim254107020181.uts.varian1;

public class MesinCetak {
    private String kodeMesin;

    public MesinCetak(String kodeMesin) {
        this.kodeMesin = kodeMesin;
    }

    public void cetak(Tiket t) {
        if (t == null) {
            System.out.println("Tiket tidak valid.");
            return;
        }
        String namaPemilik = (t.getPemilik() == null) ? "-" : t.getPemilik().getNama();
        System.out.println("[" + t.getJenis() + "] " + t.getKode() + " " + t.getJudulFilm()
                + " | " + namaPemilik + " | Rp" + t.hitungHarga());
    }
}
