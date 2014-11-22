/**
 * Created by Yuliya on 22.11.2014.
 */
/*Задание 4.2: Создайте два массива int[] x и int[] y и создайте третий массив int[] z так,
чтобы его длина была равна сумме длин x и y и z был получен "склеиванием" x и y.
Напрмер, если x = {2, 3, 4}, y = {7, 6}, то z = {2, 3, 4, 7, 6}.*/
public class Massiv2 {
    public static void main(String[] args) {
        int[] x={2,3,4};
        int[] y={7,8,9};
        int[] z = new int[x.length + y.length];
                System.arraycopy(x, 0, z, 0, x.length);
                System.arraycopy(y, 0, z, x.length, y.length);
        for(int i = 0; i < z.length; i++){
            System.out.println( z[i]);
        }
    }
}

