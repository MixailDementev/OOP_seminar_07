
import java.util.*;

/*
 * 1. Реализовать собственный ArrayLIst;
 * 2. Реалисовать собственный список;
 * 3. Реализовать собственный двунаправленный список;
 * 4. Реализовать дек;
 * 5. Реализовать стек;
 * 6. Описать иерархию сотрудников организации;
 * 7. Описать класс "Репозиторий", позволяющий выполнять операции добавления\удаления\изменения\чтения данных
 */

public class Main {
    public static void main(String[] args) {
        corpStructure();
        showRepository();
    }

    public ArrayList addArray() {
        ArrayList newArrayList = new ArrayList();
        return newArrayList;
    }

    public List addList() {
        List<Integer> newList = new ArrayList<Integer>();
        return newList;
    }

    public LinkedList addLinkedList() {
        LinkedList<Integer> newLinkedList = new LinkedList<>(null);
        return newLinkedList;
    }

    public Deque addArrayDeque() {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        return stack;
    }

    public Stack addStack() {
        Stack<String> newStack = new Stack<String>();
        return newStack;
    }

    public static void corpStructure() {
        ArrayList<Persona> personaList = new ArrayList<>();
        Persona boss = new Persona("Петров Петр Петрович", "мужской", 53, "Босс");
        Persona manager = new Persona("Высоцкая Екатерина Сергеевна", "женский", 27, "Менеджер");
        Persona worker = new Persona("Сидоров Иван Алексеевич", "Мужской", 31, "Рабочий");

        personaList.add(boss);
        personaList.add(manager);
        personaList.add(worker);

        System.out.println("Список сотрудников:\n ");

        for (Persona i : personaList) {
            System.out.println(i.toString());
        }

        System.out.println("Список подчиненных:\n ");
        boss.addName(manager);
        manager.addName(worker);

        View.corpView(boss, 0);
    }

    public static <E> void showRepository() {
        Repository<String> rep = new Repository<>();

        rep.addToRepo(rep.repo, "addTest0");
        rep.addToRepo(rep.repo, "addTest1");
        rep.addToRepo(rep.repo, "addTest2");
        rep.showRepo(rep.repo);
        System.out.println("1".repeat(10));
        rep.changeRepo(rep.repo, 1, "changeTest");
        rep.showRepo(rep.repo);
        System.out.println("2".repeat(10));
        rep.delFromRepo(rep.repo, 2);
        rep.showRepo(rep.repo);
        System.out.println("3".repeat(10));
    }
}