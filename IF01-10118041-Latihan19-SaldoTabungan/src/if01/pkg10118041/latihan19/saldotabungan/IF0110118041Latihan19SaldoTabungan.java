/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118041.latihan19.saldotabungan;
import  java.text.DecimalFormat;
/*
 * NAMA              : Eki salman sya'bani
 * KELAS             : IF-01
 * NIM               : 10118041
 * DESKRIPSI PROGRAM : Program yang dapat menampilkan saldo perbulan    
 */

public class IF0110118041Latihan19SaldoTabungan {



    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        int i, Saldo;

        DecimalFormat satuan = new DecimalFormat();

        i = 1;

        Saldo = 2500000;

        while (i < 7) {

            Saldo += (Saldo * 0.15);

            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(Saldo));

            i++;

        }

    }



}
