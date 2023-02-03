import ru.netology.javaqa.StatsService.StatsService;

public class Main {
    static StatsService service = new StatsService();

    public static void main(String[] args) {
        long[] sales = new long[12];
        sales[0] = 8;
        sales[1] = 15;
        sales[2] = 13;
        sales[3] = 15;
        sales[4] = 17;
        sales[5] = 20;
        sales[6] = 19;
        sales[7] = 20;
        sales[8] = 7;
        sales[9] = 14;
        sales[10] = 14;
        sales[11] = 18;

        System.out.println(service.sumSales(sales));
        System.out.println();
        System.out.println(service.maxSales(sales));
        System.out.println();
        System.out.println(service.minSales(sales));
        System.out.println();
        System.out.println(service.averageSales(sales));
        System.out.println();
        System.out.println(service.belowAverage(sales));
        System.out.println();
        System.out.println(service.aboveAverage(sales));
    }
}
