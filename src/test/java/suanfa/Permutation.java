package suanfa;

/**
 * Created by zhangsm on 2017/6/13.
 */
    public class Permutation {

        public static void permulation(int[] list, int start, int length) {
            int i;
            if (start == length) {
                for (i = 0; i < length; i++)
                    System.out.print(list[i] + " ");
                System.out.println();
            } else {
                for (i = start; i < length; i++) {
                    swap(list, start, i);
                    permulation(list, start + 1, length);
                    swap(list, start, i);
                }
            }
        }

        public static void swap(int[] list, int start, int i) {
            int temp;
            temp = list[start];
            list[start] = list[i];
            list[i] = temp;
        }

        public static void main(String[] args) {
            int length = 3;
            int start = 0;
            int list[] = new int[length];
            for (int j = 0; j < length; j++)
                list[j] = j + 1;
            permulation(list, start, length);
        }

    }
