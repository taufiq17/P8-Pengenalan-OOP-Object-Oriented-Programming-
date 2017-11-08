public class Tabungan{

    int saldo;

    //method construktor
    public Tabungan(int initsaldo){
        saldo=initsaldo;
    }

    //method void, tdk mengembalikan nilai
    void ambilUang(int jumlah){
        saldo = saldo - jumlah;
    }
}