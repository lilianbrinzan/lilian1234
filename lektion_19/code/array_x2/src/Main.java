public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир!");
        System.out.println("Работа с 2-хмерным массивом.");
        //System.out.println();
        System.out.println("Шахматная доска:");
        int [][] field = new int[8][8]; // инициализация массива
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++){
                if ((i + j) % 2 ==0 ){
                    field[i][j]= 0;
                }  else {
                    field[i][j]= 1;
                }

                System.out.print(field[i][j] + "\t"); //  /t - это отступ на размер табуляции
            }
            System.out.println();
        }

    }
}