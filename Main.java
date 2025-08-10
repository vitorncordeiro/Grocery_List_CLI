import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        boolean flag = true;
        while (flag) {
            System.out.println("Digite um comando abaixo: [0 para sair]");
            System.out.println("");
            System.out.println(menu());
            int option = sc.nextInt();
            switch (option) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("Digite o nome do item que deseja incluir: ");
                    String nomeItemAdd = sc.next();
                    lista.addItem(nomeItemAdd);
                    break;
                case 2:
                    System.out.println("Digite o nome do item que deseja excluir: ");
                    String nomeItemRem = sc.next();
                    lista.removeItem(nomeItemRem);
                    break;
                case 3:
                    lista.printList();
                    break;
            }
        }
    }
    public static String menu() {
        return "0 - Sair\n1- Incluir item\n2- Excluir item\n3- Mostrar lista";
    }

}
