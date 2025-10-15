// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Karyawan {
   String nama;
   String jabatan;
   int jamKerja;

   public Karyawan(String var1, String var2, int var3) {
      this.nama = var1;
      this.jabatan = var2;
      this.jamKerja = var3;
   }

   public double hitungGajiPokok() {
      double var1 = 0.0;
      if (this.jabatan.equalsIgnoreCase("Manager")) {
         var1 = 20000.0;
      } else if (this.jabatan.equalsIgnoreCase("Staf")) {
         var1 = 15000.0;
      } else if (this.jabatan.equalsIgnoreCase("Magang")) {
         var1 = 10000.0;
      }

      return var1 * (double)this.jamKerja;
   }

   public double hitungTunjangan() {
      double var1 = this.hitungGajiPokok();
      return this.jamKerja > 160 ? 0.1 * var1 : 0.0;
   }

   public double getTotalGaji() {
      return this.hitungGajiPokok() + this.hitungTunjangan();
   }
}
