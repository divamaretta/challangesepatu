/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayabaru;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author necha
 */
public class Jayabaru {

    public static void main(String[] args) {

        System.out.println("********************************************");
        System.out.println("==================JAYABARU==================");
        System.out.println("          Welcome & Happy Shopping           ");
        System.out.println("********************************************");
        Scanner nama = new Scanner(System.in);
        System.out.print("Nama pembeli : ");
        String dib = nama.nextLine();
        System.out.print("Nama Kasir : ");
        String div = nama.nextLine();
        Scanner a = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();

        System.out.println("\nSilahkan pilih merk sepatu yang tersedia");
        Jayabaru.merk("");
        System.out.println("Masukkan pilihan anda: ");
        int jawab = a.nextInt();
        if (jawab == 1) {

            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 900000 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");

        } else if (jawab == 2) {

            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 0 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");

        } else if (jawab == 3) {
            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 700000 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 4) {
            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 700000 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 5) {
            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 500000 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 6) {
            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 200000 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 7) {
            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 300000 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 8) {
            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 200000 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        } else if (jawab == 9) {
            Scanner b = new Scanner(System.in);
            System.out.println("\nPilih size yang tersedia");
            Jayabaru.size("");
            System.out.println("Masukkan size pilihan anda: ");
            int pilih = b.nextInt();

            Scanner c = new Scanner(System.in);
            System.out.println("\nPilih warna yang anda inginkan");
            Jayabaru.warna("");
            System.out.println("Masukkan pilihan anda: ");
            int pilihan = c.nextInt();

            Scanner d = new Scanner(System.in);
            System.out.println("\nPilih jenis sepatu");
            Jayabaru.jenis("");
            System.out.println("Masukkan pilihan anda: ");
            int jwb = d.nextInt();

            Scanner e = new Scanner(System.in);
            System.out.println("\nPilih kategori sepatu yang anda inginkan");
            Jayabaru.kategori("");
            System.out.println("Masukkan pilihan anda:");
            int jwbb = e.nextInt();

            Scanner f = new Scanner(System.in);
            System.out.print("Jumlah barang yang dibeli : ");
            int jumlahbarang = f.nextInt();
            int harga = 800000 * jumlahbarang;
            System.out.println("********************************************");
            System.out.println("==================JAYABARU==================");
            System.out.println("          Welcome & Happy Shopping           ");
            System.out.println("********************************************");
            System.out.println("Nama Pembeli : " + dib);
            System.out.println("Nama Kasir   : " + div);
            if (jumlahbarang == 1) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 00000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 2) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 50000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            } else if (jumlahbarang == 3) {
                System.out.println("Tanggal pembelian : " + dateFormat.format(cal.getTime()));
                int diskon = 100000;
                int total = harga - diskon;
                System.out.println("Total yang harus dibayarkan : " + total);
            }
            System.out.println("===== TERIMA KASIH TELAH BERBELANJA =====");
        }

    }

    private static void merk(String string) {
        System.out.println("[1]Adidas\n[2]Nike\n[3]Skechers\n[4]Puma\n[5]Reebok\n[6]Vans\n[7]Converse\n[8]Fila\n[9]910");

    }

    private static void size(String string) {
        System.out.println("t30\t31\t32\t33\t34\t35\t36\t37\t38\t39\t40\t41\t42\t43\t44\t45");
    }

    private static void warna(String string) {
        System.out.println("[1]Black\n[2]White\n[3]Gold\n[4]Silver\n[5]Orange\n[6]Green\n[7]Yellow\n[8]Blue\n[9]Red\n[10]Pink");
    }

    private static void jenis(String string) {
        System.out.println("[1]Laki-laki\n[2]Perempuan");
    }

    private static void kategori(String string) {
        System.out.println("[1]Olahraga\n[2]Lari\n[3]Santai\n[4]Kantoran");

    }
}