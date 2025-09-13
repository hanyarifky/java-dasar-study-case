import java.util.Scanner;

public class AplikasiAtm {

    public static String pinAtm = "081104";
    public static String nama_nasabah = "Muhammad Rifky Ramadhani";
    public static float saldo = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
    }


    // ========== Business Logic ==========
    /**
     * Fungsi untuk menampilkan saldo dan nama nasabah
     */
    public static void showData()
    {
        System.out.println("Selamat Datang, " + nama_nasabah);
        System.out.println("Saldo Anda = " + saldo);
    }

    public static void testShowData()
    {
        showData();
    }

    /**
     * Fungsi untuk menarik uang dari ATM
     */
    public static void withdraw(int nominal)
    {
        if(nominal > 10000000){
            System.out.println("Jumlah penarikan tidak boleh lebih dari Rp 10.000.000");
        } else if(nominal >= saldo){
            System.out.println("Saldo anda tidak mencukupi untuk melakukan penarikan");
        }
        else {
            saldo -= nominal;
            System.out.println("Berhasil melakukan penarikan");
        }

    }

    public static void testWithdraw()
    {
        System.out.println("Saldo sekarang adalah = " + saldo);
        withdraw(10000);
        System.out.println("Saldo setelah fungsi withdraw dijalankan adalah = " + saldo);
    }

    /**
     * Fungsi untuk melakukan deposit
     *
     */
    public static void deposit(int nominal)
    {
        if(nominal > 10000000)
        {
            System.out.println("Jumlah deposit tidak boleh lebih dari Rp 10.000.000");
        } else {
            saldo += nominal;
            System.out.println("Berhasil melakukan deposit");
        }
    }

    // ========== View ==========
    /**
     * Fungsi untuk menampilkan menu utama
     */
    public static void viewMainMenu()
    {
        while(true)
        {

        }
    }
//
    /**
     * Fungsi untuk menampilkan menu deposit tabungan
     */
    public static void viewDeposit()
    {
        System.out.println("======== Menu Deposit ========");
        System.out.print("Silahkan masukkan jumlah nominal = ");
        int nominal = scanner.nextInt();
        deposit(nominal);
    }

    public static void testViewDeposit()
    {
//        System.out.println("Saldo ATM sebelum di deposit = "+saldo);
        viewDeposit();
//        System.out.println("Saldo ATM setelah di deposit = "+saldo);
    }

//    /**
//     * Fungsi untuk menampilkan menu ambil tabungan
//     */
    public static void viewWithdraw()
    {
        System.out.println("======== Penarikan Tunai ========");
        System.out.print("Silahkan masukkan jumlah nominal = ");
        int nominal = scanner.nextInt();
        withdraw(nominal);
    }

    public static void testViewWithdraw()
    {
//        System.out.println("Saldo sekarang adalah = " + saldo);
        viewWithdraw();
//        System.out.println("Saldo setelah fungsi withdraw dijalankan adalah = " + saldo);
    }

    /**
     * Fungsi untuk menampilkan menu saldo tabungan
     */
    public static void viewSaldo()
    {
        System.out.println("======== Informasi Saldo ========");
        System.out.print("Saldo Anda = "+saldo);
    }

    public static void testViewSaldo()
    {
        viewSaldo();
    }


}
