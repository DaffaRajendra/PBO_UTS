package nim254107020181.uts.varian1;

public class TiketVIP extends Tiket {
    public TiketVIP(String kode, String judulFilm, int hargaDasar) {
        super(kode, judulFilm, hargaDasar);
    }

    public int hitungHarga() {
        return (int) (hargaDasar * 1.5) + 20000;
    }

    @Override
    public String getJenis() {
        return "VIP";
    }
}
