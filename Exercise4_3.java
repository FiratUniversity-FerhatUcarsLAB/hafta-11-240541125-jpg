public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
//Stack Diyagramı:
main
main → zoop
main → zoop → baffle
main → zoop → baffle → ping
main → zoop
main → zoop → baffle
main
main → baffle
main → baffle → ping
main

//Tam Çıktısı:
No, I wug.
You wugga wug.
I wug.
