package Chuong1;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem ii = new InvoiceItem("24ITB078","Pen Red",888,0.08);

        System.out.println(ii);
        ii.setQty(999);
        ii.setUnitPrice(0.99);
        System.out.println(ii);
        System.out.println("Id : "+ii.getId());
        System.out.println("Desc  : "+ii.getDesc());
        System.out.println("Qty  : "+ii.getQty());
        System.out.println("Unit price : "+ii.getUnitPrice());
        System.out.println("Tong : "+ii.getTotalPrice());

    }
}
