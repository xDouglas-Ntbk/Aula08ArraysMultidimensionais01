package exercico.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String [] args){
        // 1,2,3,4,5 Meses
        // 31,28,31,30 Dias
        int [][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j <dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
    }
}

package exercico.devdojo.maratonajava.introducao;

/*
public class Aula08ArraysMultidimensionais01 {
    public static void main(String [] args){
        // 1,2,3,4,5 Meses
        // 31,28,31,30 Dias
        int [][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;                      // i- Percorre linhas
        dias[0][2] = 31;                      // j - Percorre colunas

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i = 0; i < dias.length; i++) {   // Controla as linhas da Matriz  "new int[3][3]"

            for (int j = 0; j <dias[0].length; j++) { // Controla as colunas
                System.out.println(dias[i][j]);
            }
        }
    }
}

 */

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args){
        int [][] dias = new int[3][3];
        dias [0][0] = 31;
        dias [0][1] = 20;
        dias [0][2] = 15;

        dias [1][0] = 10;
        dias [1][1] = 29;
        dias [1][2] = 11;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j <dias[0].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------");

        for (int [] arrBase:dias) {
            for (int num: arrBase) {
                System.out.println(num);
            }
            
        }
        }
}
