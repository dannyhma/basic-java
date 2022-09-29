import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Program kalender berbasis teks (dengan mark current tgl)
 */
public class Kalender2 {

  // Jumlah hari di tiap bulan, index 0 = Januari
  private static final int[] jml_hari = {
    31, 28, 31, 30, 31, 30, 31, 31,	30, 31, 30, 31
  };

  public Kalender2() {
    Calendar cal = Calendar.getInstance();

    // Mendapatkan tahun dan bulan sekarang
    int thn = cal.get(Calendar.YEAR);
    int bln = cal.get(Calendar.MONTH);

    // Menciptakan objek GregorianCalendar dengan tahun dan
    // bulan saat ini
    GregorianCalendar gCal = new GregorianCalendar(thn, bln, 1);

    System.out.printf("%tB %<tY %n", new Date());
    System.out.println("====================");
    System.out.println("Mi Se Se Ra Ka Ju Sa");
    System.out.println("--------------------");

    // Jumlah kolom kosong di awal bulan
    int blank = gCal.get(Calendar.DAY_OF_WEEK)-1;

    int dMonth = jml_hari[bln];
    // Jika tahun kabisat, jumlah hari bulan Februari = 29
    if (gCal.isLeapYear(gCal.get(Calendar.YEAR)) && bln == 1) {
      ++dMonth;
    }

    // Mengosongkan kolom sebelum tanggal 1
    for (int i=0; i<blank; i++) {
      System.out.print("   ");
    }

    // Mencetak tanggal sebanyak jumlah hari bulan
    for (int i=1; i<=dMonth; i++) {
      // Tambahkan satu karakter kosong jika tgl <= 9
      if (i <= 9) {
        System.out.print(" ");
      }

      // Jika i = tgl sekarang, cetak tanggal bewarna hijau
      if (i == cal.get(Calendar.DATE)) {
        System.out.print((char)27+"[01;32m"+i+(char)27+"[00;00m");
      } else {
        System.out.print(i);
      }

      if ((blank + i) % 7 == 0) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }
    System.out.println("\n--------------------");

  }

  public static void main(String[] args) {
    new Kalender2();
  }


}