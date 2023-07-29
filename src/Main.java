import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            /*
            System.out.println("Enter ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter Price: ");
            Double price = Double.parseDouble(scanner.nextLine());

            Product product = new Product(id, name, price);
            System.out.println("Product Information: "+product);
            double vat = product.Vat();
            System.out.println("VAT: "+vat);
            */
            //bai2
            System.out.println("Enter id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            System.out.println("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter experience: ");
            double exp = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter placeWork: ");
            String place = scanner.nextLine();

            Employee employee=new Employee(id, name, address,age, exp, place);
            System.out.println("Employee information: "+employee);

    }
}