# Kelompok_14_Algoritma_Pemrograman

# 1. Pengertian Program Bangun Ruang

Program Bangun Ruang dalam Java adalah program yang digunakan untuk menghitung volume dan luas permukaan dari bangun ruang tiga dimensi menggunakan bahasa pemrograman Java.

Bangun ruang yang dihitung dalam program ini yaitu:

Kubus

Balok

Bola

Tabung

Program bekerja dengan cara:

Menampilkan menu pilihan bangun ruang

Pengguna memasukkan data yang dibutuhkan seperti sisi, panjang, lebar, tinggi, atau jari-jari

Program akan menghitung volume dan luas permukaan

Hasil perhitungan ditampilkan di layar

Program ini menggunakan:

Class Scanner untuk input data

Percabangan Switch Case untuk memilih bangun ruang

Rumus matematika untuk menghitung volume dan luas permukaan

# 2. Rumus Bangun Ruang yang Digunakan
1. Kubus

Volume
V = s × s × s

Luas Permukaan
L = 6 × s²

Keterangan:

s = sisi kubus

2. Balok

Volume
V = p × l × t

Luas Permukaan
L = 2(pl + pt + lt)

Keterangan:

p = panjang

l = lebar

t = tinggi

3. Bola

Volume
V = 4/3 × π × r³

Luas Permukaan
L = 4 × π × r²

Keterangan:

r = jari-jari

4. Tabung

Volume
V = π × r² × t

Luas Permukaan
L = 2πr(r + t)

Keterangan:

r = jari-jari

t = tinggi

# 3. Source Code Program Java
import java.util.Scanner;

public class BangunRuang {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=================================");
        System.out.println("PROGRAM PERHITUNGAN BANGUN RUANG");
        System.out.println("=================================");

        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.print("Pilih bangun ruang (1-4): ");
        pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan sisi kubus: ");
                double sisi = input.nextDouble();

                double volumeKubus = sisi * sisi * sisi;
                double luasKubus = 6 * sisi * sisi;

                System.out.println("Volume Kubus = " + volumeKubus);
                System.out.println("Luas Permukaan Kubus = " + luasKubus);
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();

                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();

                double volumeBalok = p * l * t;
                double luasBalok = 2 * (p*l + p*t + l*t);

                System.out.println("Volume Balok = " + volumeBalok);
                System.out.println("Luas Permukaan Balok = " + luasBalok);
                break;

            case 3:
                System.out.print("Masukkan jari-jari bola: ");
                double r = input.nextDouble();

                double volumeBola = (4.0/3.0) * Math.PI * r * r * r;
                double luasBola = 4 * Math.PI * r * r;

                System.out.println("Volume Bola = " + volumeBola);
                System.out.println("Luas Permukaan Bola = " + luasBola);
                break;

            case 4:
                System.out.print("Masukkan jari-jari tabung: ");
                double rt = input.nextDouble();

                System.out.print("Masukkan tinggi tabung: ");
                double tt = input.nextDouble();

                double volumeTabung = Math.PI * rt * rt * tt;
                double luasTabung = 2 * Math.PI * rt * (rt + tt);

                System.out.println("Volume Tabung = " + volumeTabung);
                System.out.println("Luas Permukaan Tabung = " + luasTabung);
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }

        input.close();
    }
# 4. Penjelasan Struktur Program
1. Import Library
import java.util.Scanner;

Digunakan untuk mengambil input dari pengguna melalui keyboard.

2. Membuat Class
public class BangunRuang

Class adalah wadah utama program Java.

3. Method Main
public static void main(String[] args)

Method main() adalah titik awal program dijalankan.

4. Membuat Scanner
Scanner input = new Scanner(System.in);

Digunakan untuk membaca input dari pengguna.

5. Switch Case
switch(pilihan)

Digunakan untuk memilih bangun ruang yang ingin dihitung.

6. Perhitungan Rumus

Contoh pada kubus:

double volumeKubus = sisi * sisi * sisi;

Program melakukan perhitungan menggunakan rumus matematika.
