package Homework1;

public class Players2 implements Competitor {

    String name;



    int maxRunDistance;


    boolean active;

    public Players2(String name) {
        this.name = name;
        this.maxRunDistance = 150;
        this.active = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " successfully ran");
        } else {
            System.out.println(name + " failed ran");
            active = false;
        }
    }



    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);
    }
}
