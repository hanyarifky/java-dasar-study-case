import javax.xml.namespace.QName;
import java.util.Locale;

public class AplikasiTodolist {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        // Testing
//        testShowTodolist();
//        testAddTodolist();
//        testRemoveTodolist();
//        testInput();
//        testViewTodoList();
//        testViewAddTodoList();

        viewShowTodoList();
    }


    // ========== Busisness Logic ==========
    /**
     * Menampilkan Todolist
     */
    public static void showTodolist() {
        System.out.println("TODO LIST");
        for (int i = 0; i < model.length; i++) {

            // Mengambil data todo
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }

        }
        
    }

    /**
     * Testing show todo list
     */
    public static void testShowTodolist() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar: Aplikasi TodoList";

        showTodolist();
    }

    /**
     * Menambahkan Todo ke list
     */
    public static void addTodolist(String todo) {

        // cek apakah model sudah penuh
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // jika penuh kita resize ukuran array model 2x lipat
        if(isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // tambahkan ke posisi yang data array nya null
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null) {
                model[i] = todo;
                break;
            }
        }

    }

    /**
     * Testing add todo list
     */

    public static void testAddTodolist() {
        for (int i = 0; i < 25; i++) {
            addTodolist("Contoh todo ke-"+i);
        }

        showTodolist();

    }

    /**
     * Menghapus Todolist
     */
    public static boolean removeTodolist(Integer number) {

        if ((number - 1) >= model.length) {
            return false;
        } else if(model[number-1] == null) {
            return false;
        } else {
            // model[number - 1] = null;

            for (int i = (number - 1); i < model.length; i++) {
                if(i == (model.length-1)){
                    model[i] = null;
                } else {
                    model[i] = model[i+1];
                }

            }

            return true;
        }

    }

    /**
     * Testing hapus todo list
     */
    public static void testRemoveTodolist() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        var result = removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(7);
        System.out.println(result);

        result = removeTodolist(2);
        System.out.println(result);

        showTodolist();
    }



    public static String input(String info) {
        System.out.print(info+" : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi "+ name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    // ========== View ==========
    /**
     * Menampilkan view todo list
     */
    public static void viewShowTodoList() {
        while(true) {
            showTodolist();

            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            input = input.toLowerCase();

            if (input.equals("1")){
                viewAddTodolist();
            } else if(input.equals("2")) {
                viewRemoveTodolist();
            } else if(input.equals("x")){
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewTodoList() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        viewShowTodoList();
    }

    /**
     * Menampilkan view menambahkan todo list
     */
    public static void viewAddTodolist() {
        System.out.println("MENAMBAH TODO LIST");

        var todo = input("Todo (x Jika Batal)");

        if(todo.equals("x")) {
            // batal
        } else {
            addTodolist(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodolist("Satu");
        addTodolist("Dua");
        viewAddTodolist();

        showTodolist();
    }

    /**
     * Menampilkan view menghapus todo list
     */
    public static void viewRemoveTodolist() {
        System.out.println("MENGHAPUS TODO LIST");

        var number = input("Nomor yang dihapus (x jika batal)");

        if(number.equals("x")) {
            // batal
        } else {
            boolean success = removeTodolist(Integer.valueOf(number));

            if(!success) {
                System.out.println("Gagal menghapus todo list : "+number);
            }
        }
    }

    public static void testViewRemoveTodoList() {
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");

        showTodolist();
        viewRemoveTodolist();

        showTodolist();
    }

}
