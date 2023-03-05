public class Main {
    public static void main(String[] args) {
        String[]nameOfWeek = new String[7];
        nameOfWeek[0] = "Montag";
        nameOfWeek[1] = "Dienstag";
        nameOfWeek[2] = "Mitwoch";
        nameOfWeek[3] = "Donastag";
        nameOfWeek[4] = "Freitag";
        nameOfWeek[5] = "Samstag";
        nameOfWeek[6] = "Sontag";
        for (int i = 0; i < 7; i++) {

            if (i >= 5) {
                System.out.println("Wochenende: " + nameOfWeek[i]);
            }
        }


        // Hausaufgaben2New

        System.out.println("Monat Februar: tag1=4, 2=5, 3=6; 4=7; 5=8; 6=5; 7=4; 8=6 und so weiter ");

        int[]temperaturMonat ={4,5,6,7,8,5,4,6};
        double sum = 0;
        double average = 0;

        for (int i = 0; i < temperaturMonat.length; i++)
        {sum = sum +temperaturMonat[i];}

        average = sum/temperaturMonat.length;
        System.out.println("Sum of element " + average);


        System.out.println("Fertig !!!");
    }

}
