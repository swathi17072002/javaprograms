/*Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.*/
import java.util.Scanner;
class PointOfSale{
  Scanner ss = new Scanner(System.in);
  
   public void addProduct(Product prod[],int m,double[] totalCost,float[] quantities){
     //prod[m] = new Product();
    System.out.println("Enter product name :");
     prod[m].name = ss.nextLine();
     System.out.println("Enter product price :");
     prod[m].price = ss.nextDouble();
     totalCost[m] = prod[m].price;
     System.out.println("Enter product quantity :");
     prod[m].quantity = ss.nextFloat();
     quantities[m] = prod[m].quantity;
  }
  public void removeProduct(Product obj,int p,double[] totalCost,float[] quantities){
    //obj=null;
    obj.name=null;
    obj.price=0;
    obj.quantity=0;
    totalCost[p] =0;
    quantities[p] = 0;
  }
  static public double getTotalCost(double[] totalCost,int n,float[] quantities){
    double cost=0;
    for(int i=0;i<=n;i++){
      cost = cost+(totalCost[i]*quantities[i]);
    }
    return cost;
  }
}

class Product extends PointOfSale{
  String name;
  double price;
  float quantity;
  Product(){
    System.out.println("enter new product details :");
  }
  Product(String name1,double price1,float quantity1){
    name = name1;
    price = price1;
    quantity = quantity1;
  }
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public float getQuantity(){
    return quantity;
  }
}
public class ProductExample{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of products");
    int n = sc.nextInt();
    Product prod[] = new Product[100];
    double totalCost[] = new double[100];
    float quantities[] = new float[100];
    for(int i=0;i<n;i++){
      sc.nextLine();
      System.out.println("enter details of the product "+(i+1));
      System.out.println("enter name of the product :");
      String name1 = sc.nextLine();
      System.out.println("enter price of the product :");
      double price1 = sc.nextDouble();
      totalCost[i] = price1;
      System.out.println("enter quantity of the product :");
      float quantity1 = sc.nextFloat();
      quantities[i] = quantity1;
      prod[i] = new Product(name1,price1,quantity1);
      //sc.nextLine();
    }
    /*for(int i=0;i<n;i++){
      System.out.println("Product "+(i+1)+" details :");
      System.out.println("Name : "+prod[i].getName());
      System.out.println("Price : "+prod[i].getPrice());
      System.out.println("Quantity : "+prod[i].getQuantity());
    }*/
    prod[n] = new Product();
    prod[0].addProduct(prod,n,totalCost,quantities) ;
    for(int i=0;i<=n;i++){
      System.out.println("Product "+(i+1)+" details :");
      System.out.println("Name : "+prod[i].getName());
      System.out.println("Price : "+prod[i].getPrice());
      System.out.println("Quantity : "+prod[i].getQuantity());
    }
    System.out.println();
    System.out.println("Total cost : "+PointOfSale.getTotalCost(totalCost,n,quantities));
    System.out.println();
    System.out.println("enter which product want to remove");
    int p = sc.nextInt();
    prod[p-1].removeProduct(prod[p-1],p-1,totalCost,quantities);
    System.out.println("After removing the product"+p+"details");
    for(int i=0;i<=n;i++){
      System.out.println("Product "+(i+1)+" details :");
      System.out.println("Name : "+prod[i].getName());
      System.out.println("Price : "+prod[i].getPrice());
      System.out.println("Quantity : "+prod[i].getQuantity());
      System.out.println();
    }
    System.out.println("New Total Cost : "+PointOfSale.getTotalCost(totalCost,n,quantities));
  }
}