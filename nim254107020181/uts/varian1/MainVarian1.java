package nim254107020181.uts.varian1;

public class MainVarian1 {
    public static void main(String[] args) {
        Bioskop bioskop = new Bioskop("Sinema Malang", 3, 50);
        bioskop.setManajer(new Manajer("Pak Hadi"));

        Penonton andi = new Penonton("Andi", "081111111111");
        Penonton sinta = new Penonton("Sinta", "082222222222");

        TiketReguler reguler = new TiketReguler("T-001", "Laskar Pelangi", 40000, true);
        reguler.setPemilik(andi);
        TiketVIP vip = new TiketVIP("T-002", "Laskar Pelangi", 40000);
        vip.setPemilik(sinta);

        bioskop.jualTiket(reguler);
        bioskop.jualTiket(vip, 1);
        bioskop.jualTiket(vip, 4); 

        MesinCetak mesin = new MesinCetak("MC-01");
        mesin.cetak(reguler);
        mesin.cetak(vip);
        System.out.println("Pendapatan Studio 1 : " + bioskop.getStudio(1).hitungPendapatan());

        Tiket t = new TiketVIP("T-099", "Dilan", 50000);
        System.out.println("Harga T-099 : " + t.hitungHarga()); 
    }
}
