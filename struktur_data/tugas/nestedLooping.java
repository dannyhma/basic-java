/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package begin.struktur_data;

/**
 *
 * @author dannyhma
 */
public class nestedLooping {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        int iterasi = 0;
        int jumlah = 0;
        System.out.println("Tampilkan dan jumlahkan bilangan ganjil : \n");

        // syarat looping
        for (int i = 1; i <= 20; i++) {
            iterasi++;
            // kondisi cetak bilangan ganjil
            // akan bernilai true atau menghasilkan angka 1 jika variabel i 
            // bersisa 1 ketika dibagi 2. Ini artinya variabel a berisi angka ganjil.
            if (i % 2 == 1) {
                // cetak bilangan ganjil
                System.out.println(i);
                // kondisi jumlahkan semua bilangan ganjil
                jumlah = jumlah + i;
            }
            
            // kondisi jika iterasi
            if (iterasi == 10) {
                iterasi = 0;
                // cetak pembatas antara bilangan ganjil (i) dengan jumlah bilangan ganjil (jumlah)
                System.out.println("---");
                // cetak kondisi jumlah semua bilangan ganjil
                System.out.println(jumlah);
                // cetak spasi antara sepuluh bilangan ganjil pertama dan seterusnya
                System.out.println(" ");
                //
                jumlah = 0;
            }
        }
    }
}
