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
}
