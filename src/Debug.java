public class Debug {

    int balance = 100;

    public static void main(String[] args) {

        System.out.println("inside main....START");

        doSomething();

        System.out.println("inside main....END");
    }

    static void doSomething() {

        System.out.println("Debug.doSomething().....START");
        System.out.println("Doing something....");

        Debug d = new Debug();   
        d.balance = 230;


        System.out.println("Debug.doSomething().....END");
    }
}
