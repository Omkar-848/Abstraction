package Abstraction;

abstract class Bike21 {
    abstract void run_1();
}

class Honda21 extends Bike21 {
    @Override
    void run_1() {
        System.out.println("running safely");
    }

    public static void main(String args[]) {
        Bike21 obj = new Honda21();
        obj.run_1();
    }
}


