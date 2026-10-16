package nim254107020181.uts.varian1;

public class Studio {
    private int nomor;
    private Tiket[] tiketTerjual;
    private int jumlah;

    public Studio(int nomor, int kapasitas) {
        this.nomor = nomor;
        this.tiketTerjual = new Tiket[Math.max(kapasitas, 0)];
        this.jumlah = 0;
    }

    public int getNomor() {
        return nomor;
    }

    public boolean jual(Tiket t) {
        if (t == null) {
            return false;
        }
        if (jumlah >= tiketTerjual.length) {
            return false;
        }
        tiketTerjual[jumlah] = t;
        jumlah++;
        return true;
    }

    public int hitungPendapatan() {
        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += tiketTerjual[i].hitungHarga();
        }
        return total;
    }
}
