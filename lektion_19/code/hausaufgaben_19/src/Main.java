public class Main {
    public static void main(String[] args) {
        //  Lektion 19 Hausaufgaben 1
        System.out.println("Arbeit mit 2-zwei Arrays");
        System.out.println("Schach Tabelle-Шахматная доска:");
        int [][] field = new int[8][8];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++){
                if ((i + j) % 2 ==0 ){
                    field[i][j]= 0;
                }  else {
                    field[i][j]= 1;
                }
                System.out.print(field[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Vertig !");
    }
}