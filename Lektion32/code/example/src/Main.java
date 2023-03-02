public class Main {
    public static void main(String[] args) {
        System.out.println("Пример использования enum - 4 времени года");

        enum Seasons {
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN,
        }

        Seasons mySeason = Seasons.SUMMER;

        switch (mySeason) {
            case SPRING -> {
                System.out.println("Весной светит солнце!");
                System.out.println("Наступает Пасха - всем красить яйца!");
                break;
            }
            case SUMMER -> {
                System.out.println("Планируем и идем в отпуск!");
                break;
            }
            case AUTUMN -> {
                System.out.println("Берем с собой зонтик!");
                System.out.println("Идем по грибы!");
                break;
            }
            case WINTER -> {
                System.out.println("Надеваем валенки и тулупы!");
                break;
            }
        }
    }
}




       /*
        enum Verkehr {
            INTERCITYEXPRESS,
            REGIONALBAHN,
            STRASSENBAHN,
            BUS,
        }

        Verkehr myVerkehr = Verkehr.INTERCITYEXPRESS;
        switch (myVerkehr) {
            case INTERCITYEXPRESS ->
                    System.out.println("Точим лыжи!");
            break;
            case REGIONALBAHN ->
                    System.out.println("Точим лыжи!");
            break;
            case STRASSENBAHN ->
                    System.out.println("Точим лыжи!");
            break;
            case BUS ->
                    System.out.println("Точим лыжи!");
            break;
        }




     /*   enum Seasons {
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN;
        }
        Seasons mySeason = Seasons.WINTER;
        switch(mySeason) {
            case WINTER:
                System.out.println("Точим лыжи!");
                break;
            case SPRING:
                System.out.println("Весной наступает Пасха, красим яйца!");
                break;
            case SUMMER:
                System.out.println("Планируем отпуск!");
                break;
            case AUTUMN: {
                System.out.println("Готовим сани к зиме!");
                break;
            }
        }

      */


