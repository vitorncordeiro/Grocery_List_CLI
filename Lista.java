import java.util.ArrayList;

public class Lista {
    private int length = 0;
    private ArrayList<String> lista = new ArrayList<>();

    public int getLength() {
        return length;
    }

    public void addItem(String item) {
        lista.add(item);
        System.out.printf("Item %s added successfully", item);
        System.out.println();
        this.printList();
    }

    public void removeItem(String item) {
        if (lista.contains(item)) {
            lista.remove(item);
            System.out.println("Item removed successfully");
            this.printList();
        } else {
            System.out.println("Item not found");
        }
    }

    public void printList() {
        System.out.println("---------------------");
        for (String s : lista) {
            System.out.println(s);
        }
        System.out.println("---------------------");
    }
}
