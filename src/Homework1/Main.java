package Homework1;

public class Main {

    public static void main(String[] args) {
        Course c = new Course(120); // Создаем полосу препятствий
        Team team = new Team("Spartak", new Players2("Kenny"), new Player3("Bob"), new Player1("Alex")); // Создаем команду
         c.doIt(team); // Просим команду пройти полосу

        System.out.println("Spartak");

            System.out.println("\nWinners:");
            team.passedTheDistance();

            System.out.println("\nResult:");// Показываем результаты
            team.showResults();
        }
    }

