package Design_Principles;

interface Workable {
  void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {

    public void work() {
        System.out.println("Human Working");
    }

    public void eat() {
        System.out.println("Human Eating");
    }
}

class Robot implements Workable {

    public void work() {
        System.out.println("Robot Working");
    }
}

public class ISP_Solid {
    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.work();
        Human hm = new Human();
        hm.work();
        hm.eat();
    }
}

