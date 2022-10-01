public class NestedLoop {

    public static void main(String[] args) {
        int iterasi = 0;
        int jumlah = 0;    
        System.out.println("Tampilkan dan jumlahkan bilangan ganjil : \n");

        // syarat looping
        for (int i = 1; i <= 50; ++i) {
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

        int iterasi_ = 0;
        int jumlah_ = 0;    
        System.out.println("Tampilkan dan jumlahkan bilangan genap : \n");

        for (int j = 1; j <= 50; ++j) {
            iterasi_++;
            // kondisi cetak bilangan genap
            // akan bernilai true atau menghasilkan angka 1 jika variabel j 
            // habis dibagi 2. Ini artinya variabel a berisi angka genap.
            if (j % 2 == 0) {
                System.out.println(j);
                jumlah_ = jumlah_ + j;
            }

            if (iterasi_ == 10) {
                iterasi_ = 0;
                System.out.println("---");
                System.out.println(jumlah_);
                System.out.println(" ");
                jumlah_ = 0;
            }
        }      
        
    }
}
