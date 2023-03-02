public class Main {
    public static void main(String[] args) {
        System.out.println("Exercitiu");


        enum Seasons {
            SPRING,
            SUMMER,
            AUTUMN,
            WINTER,
        }

        Seasons mySeason = Seasons.SPRING;
        switch (mySeason) {
            case SPRING : {
                System.out.println("Primavara lumineaza soarele!");
                System.out.println("Sarbatorim Pastele!");
                break;
            }
            case SUMMER : {
                System.out.println("Точим лыжи!");
                break;
            }
            case AUTUMN : {
                System.out.println("vvvvv!");
                break;
            }
            case WINTER : {
                System.out.println("bbbbb");
                break;
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



    }
}