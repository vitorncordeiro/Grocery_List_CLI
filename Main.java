import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        boolean flag = true;
        while (flag) {
            System.out.println("Enter a command below: [0 to exit]");
            System.out.println("");
            System.out.println(menu());
            int option = sc.nextInt();
            switch (option) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("Enter the name of the item to add: ");
                    String itemNameAdd = sc.next();
                    lista.addItem(itemNameAdd);
                    break;
                case 2:
                    System.out.println("Enter the name of the item to remove: ");
                    String itemNameRem = sc.next();
                    lista.removeItem(itemNameRem);
                    break;
                case 3:
                    lista.printList();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static String menu() {
        return "0 - Exit\n1 - Add item\n2 - Remove item\n3 - Show list";
    }
}
