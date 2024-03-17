package class1.ex.productOrder;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "계란";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "두유";
        order3.price = 2000;
        order3.quantity = 3;

        ProductOrder[] orders = new ProductOrder[]{ order1, order2, order3 };
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품 이름: " + order.productName + ", 가격: " + order.price + ", 개수: " + order.quantity);
            totalPrice += order.price * order.quantity;
        }
        System.out.println("총 결제 금액 = " + totalPrice);
    }
}
