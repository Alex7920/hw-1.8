import java.time.LocalDate;

public class Main {


    public static void main(String[] args) {
        // задача 1
        printLearYear(2022);

        //задача 2
        int clientOs = 1;
        int deviceYear = 2021;
        printSuggestionForInstall(clientOs,deviceYear);

        //задача 3
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);



    }

    private static int calculateDeliveryDays(int deliveryDistance){
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = startInterval + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return deliveryDays;

    }

    private static void printSuggestionForInstall(int clientOs, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String output;
        if (deviceYear < currentYear) {
            output = "Установите облегчённую версию ";
        } else {
            output = "Установите обычную версию ";
        }
        if (clientOs == 1) {
            output += "Андройд";
        } else {
            output += "ios";
        }
        System.out.println(output);
    }

    private static void printLearYear(int year) {
        String output;
        if (isLearYear(year)) {
            output = year + " високосный год";
        } else {
            output = year + " не високосный год";

        }
        System.out.println(output);
    }
    private static boolean isLearYear(int year) {
        return( year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

