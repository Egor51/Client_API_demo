
import java.util.List;

public class ConsoleResurce implements Resurce {
    public static void orderList(List<Product> list) {
        System.out.println("---------------------------------------------");
        System.out.println("Товар " + " - " + " Арт " + "-" + " Цена " + "-" + "Возврат");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            int price = list.get(i).totalPrice;
            int discount = list.get(i).discountPercent;
            int realPrice = price - (price * discount / 100) - list.get(i).spp;
            String cancel = list.get(i).isCancel;
            if (list.get(i).isCancel.equals(true)) {
                cancel = "Отказ";
            } else {
                cancel = "Нет";
            }
            System.out.println(list.get(i).subject + " - "
                    + list.get(i).supplierArticle + " - " + realPrice + " - " + cancel);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Было заазано " + " " + list.stream().count() + " " + " Товара");
        System.out.println("---------------------------------------------");
    }
}
