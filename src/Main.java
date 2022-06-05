import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            showMessage();
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 4) return;
            switch (input) {
                case 1:
                    System.out.print("добавить задачу: ");
                    String name = scanner.nextLine();
                    list.add(name);
                    break;
                case 2:
                    if (!showList(list)) System.out.println("Задачи отсутствуют");
                    for (String k : list)
                        System.out.println(k);
                    break;
                case 3:
                    if (!showList(list)) {
                        System.out.println("Задачи отсутствуют");
                        break;
                    }
                    System.out.print("Укажите номер задачи для удаления: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    if (number > list.size() || number <= 0) {
                        System.out.println("Номер отсутствует");
                        break;
                    }
                    list.remove(number - 1);
                    break;
                default:
                    showMessage();
                    break;
            }
        }
    }

    public static void showMessage() {
        System.out.println("Выберите действие");
        System.out.println("1. Добавить задачу");
        System.out.println("2. Вывести список задач");
        System.out.println("3. Удалить задачу");
        System.out.println("4. Выход");
    }

    public static boolean showList(List<String> list) {
        Iterator<String> name = list.iterator();
        int count = 1;
        boolean emptry = false;
        while (name.hasNext()) {
            String s = name.next();
            System.out.println(count + ") " + s);
            count++;
            emptry = true;
        }
        return emptry;
    }
}
