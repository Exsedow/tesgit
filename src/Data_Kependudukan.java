/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Data_Kependudukan {
    public static void main(String[] args) {
        Kependudukan pendudukAkmal = new Kependudukan();
         Kependudukan pendudukPaw = new Kependudukan();
         
         pendudukAkmal.nama = "Akmal";
         pendudukAkmal.umur = 21;
         pendudukAkmal.nik = 29187;
         
         pendudukPaw.nama = "Paw";
         pendudukPaw.umur = 20;
         pendudukPaw.nik = 1789;
         
         System.out.println("Nama :" + pendudukAkmal.nama);
         System.out.println("Umur :" + pendudukAkmal.umur);
         System.out.println("NIK :" + pendudukAkmal.nik);
         
         System.out.println("Nama :" + pendudukPaw.nama);
         System.out.println("Umur :" + pendudukPaw.umur);
         System.out.println("NIK :" + pendudukPaw.nik);
         
    }
}
