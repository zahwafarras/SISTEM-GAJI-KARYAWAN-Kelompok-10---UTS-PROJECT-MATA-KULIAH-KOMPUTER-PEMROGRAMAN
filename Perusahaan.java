// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Perusahaan {
   String namaPerusahaan;
   List<Karyawan> daftarKaryawan;

   public Perusahaan(String var1) {
      this.namaPerusahaan = var1;
      this.daftarKaryawan = new ArrayList();
   }

   public void tambahKaryawan(Karyawan var1) {
      this.daftarKaryawan.add(var1);
   }

   public void tampilkanDaftarGaji() {
      System.out.println("\nDaftar Gaji Karyawan di " + this.namaPerusahaan);
      System.out.println("----------------------------------------------");
      Iterator var1 = this.daftarKaryawan.iterator();

      while(var1.hasNext()) {
         Karyawan var2 = (Karyawan)var1.next();
         System.out.println("Nama     : " + var2.nama);
         System.out.println("Jabatan  : " + var2.jabatan);
         PrintStream var10000 = System.out;
         Object[] var10002 = new Object[]{var2.getTotalGaji()};
         var10000.println("Total Gaji: Rp " + String.format("%.2f", var10002));
         System.out.println("----------------------------------------------");
      }

   }
}
