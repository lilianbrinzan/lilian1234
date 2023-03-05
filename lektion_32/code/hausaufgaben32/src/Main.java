public class Main {
    public static void main(String[] args) {
        System.out.println("Пример использования enum - Verker");

        enum Verkehr {
            INTERCITYEXPRESS,
            REGIONALBAHN,
            STRASSENBAHN,
            BUS,
        }
        Verkehr myVerkehr = Verkehr.INTERCITYEXPRESS;
        switch (myVerkehr) {
            case INTERCITYEXPRESS ->{
                System.out.println("Sie fahren 1000 km!");
                break;
            }
            case REGIONALBAHN ->{
                System.out.println("Sie fahren 100 km!");
                break;
            }
            case BUS ->{
                System.out.println("Sie fahren 10 km");
                break;
            }
            case STRASSENBAHN ->{
                System.out.println("Sie fahren 5 km");
                break;
            }
        }

    }
}



