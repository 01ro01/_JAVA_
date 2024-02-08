public class Main {
    public static void main(String[] args) {
        accounts acc = new accounts();

     System.out.println("......Set Value: ");
    acc.setaccTitle("ROSE");
    acc.setaccNo(12345);
    acc.setbalance(100000.00);
    acc.display();

    System.out.println(".....DEPOSIT AMOUNT.....");
    acc.deposit(50000);
    acc.display();
    System.out.println(".....WITHDRAWN AMOUNT......");
    acc.withdrawn(10000);
    acc.display();

}
}
