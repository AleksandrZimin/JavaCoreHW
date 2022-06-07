package Homework1;

public class Course {

    // Создаем полосу препятствий
    public Course RunDistance;

    public Course(int i) {
        int distance = 175;

    }


    // Метод, который просит всю команду пройти полосу препятствий
    public void doIt(Team t) {
        System.out.println("\nTeam \"" + t.nameTeam + "\":\n");
        // Что то здесь происходит, но я хз
        final Competitor[] teammates = t.getTeammates();
    }
}
