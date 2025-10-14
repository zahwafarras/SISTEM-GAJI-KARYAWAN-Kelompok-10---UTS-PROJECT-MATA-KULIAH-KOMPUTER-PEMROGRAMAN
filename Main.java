// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Perusahaan var2 = new Perusahaan("PT. Maju Bersama");
      System.out.print("Masukkan jumlah karyawan: ");
      int var3 = var1.nextInt();
      var1.nextLine();

      for(int var4 = 1; var4 <= var3; ++var4) {
         System.out.println("\nData Karyawan ke-" + var4);
         System.out.print("Nama: ");
         String var5 = var1.nextLine();
         System.out.print("Jabatan (Manager/Staf/Magang): ");
         String var6 = var1.nextLine();
         System.out.print("Jumlah jam kerja: ");
         int var7 = var1.nextInt();
         var1.nextLine();
         Karyawan var8 = new Karyawan(var5, var6, var7);
         var2.tambahKaryawan(var8);
      }

      var2.tampilkanDaftarGaji();
      double var9 = 0.0;

      Karyawan var11;
      for(Iterator var10 = var2.daftarKaryawan.iterator(); var10.hasNext(); var9 += var11.getTotalGaji()) {
         var11 = (Karyawan)var10.next();
      }

      PrintStream var10000 = System.out;
      Object[] var10002 = new Object[]{var9};
      var10000.println("Total Gaji Seluruh Karyawan: Rp " + String.format("%.2f", var10002));
      var1.close();
   }
}
