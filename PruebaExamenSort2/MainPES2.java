package PruebaExamenSort2;

public class MainPES2 {

    public static void main(String[] args) {
      
        Product[] products = new Product[6];

    products [0] = new Product("leche", 56.45);
    products [1] = new Product("azucar", 45.60);
    products [2] = new Product("huevo", 89.90);
    products [3] = new Product("pan", 12.45);
    products [4] = new Product("croquetas", 15.5);
    products [5] = new Product("cafe", 4.51);

    System.out.println("--- Arreglo original ---");
    for (Product p : products) {
        System.out.println("Producto: " + p.name+ " --- "+ "Precio: "+ p.price);
    }
    
    System.out.println();

     for (int i = 1; i < products.length; i++) {
            Product temp = products[i];
            int j = i - 1;
            while (j >= 0 && products[j].price > temp.price) {
                products[j + 1] = products[j];
                j--;
            }
            products[j + 1] = temp;
        }

        System.out.println("--- Arreglo ordenado ---");
         for (Product p : products) {
        System.out.println("Producto: " + p.name+ " --- "+ "Precio: "+ p.price);
        }

        System.out.println();

    System.out.println("--- os 3 productos más baratos ---");
        for (int i = 0; i < 3; i++) {
            System.out.println(products[i].name + " - $" + products[i].price);
        }

    
    }

}
