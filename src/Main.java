import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ProductManager productManager=new ProductManager();
        int choice;
       do {
           displayMenu();
           choice=scanner.nextInt();
           switch (choice){
               case 1:
                   addNewProduct(productManager);
                   break;
               case 2:
                   change(productManager);
                   break;
               case 3:
                   remove(productManager);
                   break;
               case 4:
                   System.out.println(ProductManager.productList);
                   break;
               case 5:
                   searchByName(productManager);
                   break;
               case 6:
                   productManager.sort();
                   System.out.println(ProductManager.productList);
                   break;
               case 7:
                   productManager.reverseSort();
                   System.out.println(ProductManager.productList);
                    break;

           }
       } while (choice!=0);

    }

    private static void displayMenu() {
        System.out.println("----Menu----");
        System.out.println("1.add new product");
        System.out.println("2.Change information of product by Id");
        System.out.println("3.Remove product by Id");
        System.out.println("4.Display list of product");
        System.out.println("5.Search by product's name");
        System.out.println("6.Sort by increasing of price");
        System.out.println("7.Sort by decreasing of price");
        System.out.println("0.Exit");
    }

    private static void searchByName(ProductManager productManager) {
        System.out.println("Enter name");
        Scanner scanner1=new Scanner(System.in);
        String name= scanner1.nextLine();
        System.out.println(productManager.searchByName(name));
    }

    private static void remove(ProductManager productManager) {
        System.out.println("Enter Id to remove");
        Scanner scanner1=new Scanner(System.in);
        String id = scanner1.nextLine();
        productManager.removeProduct(id);
    }

    private static void change(ProductManager productManager) {
        System.out.println("Enter Id");
        Scanner scanner1=new Scanner(System.in);
        String id =scanner1.nextLine();
        System.out.println("Enter name");
        String name =scanner1.nextLine();
        System.out.println("Enter price");
        int price= scanner1.nextInt();
        productManager.changeProduct(id,name,price);
    }

    private static void addNewProduct(ProductManager productManager) {
        Product product=new Product();
        System.out.println("Enter Id");
        Scanner scanner1=new Scanner(System.in);
        String id =scanner1.nextLine();
        System.out.println("Enter name");
        String name =scanner1.nextLine();
        System.out.println("Enter price");
        int price= scanner1.nextInt();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);
        productManager.addProduct(product);
    }
}
