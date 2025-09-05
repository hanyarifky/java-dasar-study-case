import java.util.Scanner;

public class AplikasiAtm {

    public static String pinAtm = "081104";
    public static String nama_nasabah = "Muhammad Rifky Ramadhani";
    public static float saldo = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        testShowData();
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
     * Fungsi untuk
     */
    public static void withdraw()
    {
        System.out.print("Silahkan masukkan jumlah nominal = ");
        int jumlahUang = scanner.nextInt();
        if(jumlahUang >= saldo){
            System.out.println("Saldo anda tidak mencukupi untuk melakukan penarikan");
        } else {
            System.out.println("Berhasil melakukan penarikan");
        }

    }

    public static void testWithdraw()
    {
        withdraw();
    }

    // ========== View ==========
    /**
     * Fungsi untuk menampilkan menu utama
     */
    public static void viewMainMenu()
    {

    }

    /**
     * Fungsi untuk menampilkan menu deposit tabungan
     */
    public static void viewDeposit()
    {

    }

    /**
     * Fungsi untuk menampilkan menu ambil tabungan
     */
    public static void viewWithdraw()
    {

    }

    /**
     * Fungsi untuk menampilkan menu saldo tabungan
     */
    public static void viewSaldo()
    {

    }


}
