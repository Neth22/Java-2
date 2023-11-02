 class Book {
    int qty;

    public void printBooks(){
        int com = 4000;
        int crt= 7000;
        int printQty = com + crt;
        System.out.println("Printed : "+ printQty);
    }
}
class Press extends Book{
    public void display(){
        System.out.println("Books Printed Qty :"+qty);
    }
}
class TestI{
    public static void main(String[] args) {
        Press p= new  Press();
        p.qty = 14000;
        p.display();
        p.printBooks();


    }
}
