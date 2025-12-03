public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {
        zippo("rattle", 13); //1) Program buradan başlar.
    }

    public static void baffle(String blimp) {
        System.out.println(blimp); //4) "rattle" yazdırılır. 
        zippo("ping", -5); //5) zippo tekrar çağrılır.
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {  //6) -5<0 olduğu için TRUE
            System.out.println(quince + " zoop"); //7) "ping zoop"
        } else {  //2) 13<0 FALSE olduğu için else çalışır.
            System.out.println("ik"); // 3) "ik" yazdırılır.
            baffle(quince);  // 4) baffle ("raffle") çalışır.
            System.out.println("boo-wa-ha-ha"); // 8) Son olarak bu yazılır.
        }
    }
}
