import ru.netology.stats.services.StatsService;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static int[] arr = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int sumAll = service.sumSales(arr);
        System.out.println(sumAll);

        int average = service.averageSumSales(arr);
        System.out.println(average);

        int peakSales = service.numbMonthMaxSales(arr);
        System.out.println(peakSales);

        int minSales = service.numbMonthMinSales(arr);
        System.out.println(minSales);

        int belowAverage = service.belowAverage(arr);
        System.out.println(belowAverage);

        int aboveAverage = service.aboveAverage(arr);
        System.out.println(aboveAverage);
    }
}
