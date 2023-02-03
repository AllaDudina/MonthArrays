import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.StatsService.StatsService;


public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void ShouldFindSum() {
        StatsService service = new StatsService();

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void ShouldFindAverageSum() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindMaxMonth() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindMinMonth() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindBelowAverageMonths() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.belowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldFindAboveAverageMonths() {
        StatsService service = new StatsService();


        long expected = 5;
        long actual = service.aboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}
