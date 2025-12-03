public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}
//Stack Diyagramı:
main
main→zoop
main→zoop→baffle
main→zoop→baffle→ping
main→zoop
main→zoop→baffle    
main
main→baffle
main→baffle→ping
main→baffle
main
//Tam çıktısı:
just for
any not more 
It's breakfast 
!







    
