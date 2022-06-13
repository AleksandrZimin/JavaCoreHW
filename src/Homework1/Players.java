package Homework1;

public class Players implements Competitor {

    String type;
    String name;

    int maxRunDistance;


    boolean onDistance;

    public Players(String type, String name, int maxRunDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " successfully ran");
        } else {
            System.out.println(type + " " + name + " failed ran");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}
