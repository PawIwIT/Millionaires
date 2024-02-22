package pl.pawit;

public enum Tabela_Kwota {

TYSIAC("1000 zł"),
DZIESIEC_TYSIECY("10000 zł"),
PIECDZIESIAT_TYSIECY("100000 zł"),
PIECSET_TYSIECY("500000 zł"),
MILION("1000000 zł");
private String kwota;

    Tabela_Kwota(String kwota) {
        this.kwota = kwota;
    }

    public String getKwota() {
        return kwota;
    }

    @Override
    public String toString() {
        return "Tabela_Kwota{" +
                "kwota='" + kwota + '\'' +
                '}';
    }
}
