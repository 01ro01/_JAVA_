public class Main1 {
    public static void main(String[] args) {
        Transaction tr = new Transaction();

        System.out.println("POST TRANSACTION DETAILS.....");
        
        tr.setAmount(2000000.000);
        tr.setTransactionNo(123455);
        tr.setDate("01/01/2024");
        tr.display();

        System.out.println(".....DEPOSIT AMOUNT");
        tr.deposit(3456);
        tr.display();
        
        System.out.println(".....WITHDRAWN AMOUNT.....");
        tr.withdrawn(10000);
        tr.display();
        
    }
}
