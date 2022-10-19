public class Main {
    public static void main(String[] args) {

        Chocolate chocolate=new Chocolate();
        chocolate.addDetails("Dairy milk","19-06-2023");
        chocolate.addPrice(45);
        Store store=new Store();
        store.addChocolate(chocolate);
        System.out.println("Name:"+store.chocolate.name+" Price:"+store.chocolate.price+" Expiry date:"+store.chocolate.expDate);
    }
}