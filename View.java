public class View {
    public static void corpView(Persona root, int num) {
        String line = "_".repeat(num);
        System.out.println(line + root.Name + "[" + root.PersonaJobTitle + "]");
        for (Persona iterable_element : root.getListName()) {
            corpView(iterable_element, num + 1);
        }
    }
}
