public class Main {
    public static void main(String[] args) {
        int[] numsOne = new int[]{4, 6, 8, 12, 14, 9,7,8};
        int[] numsTwo = new int[]{1, 2, 3, 3, 4, 0};
        int[] c = (newArrFrom(numsOne, numsTwo));
        prinArr(c);

    }

    public static int[] newArrFrom(int[] a, int[] b) {
        int[] newArr = new int[a.length];
        boolean flag = a.length == b.length;
        if (!flag) {
            int[] newArr2 = new int[1];
            newArr2[0] = -1;
            System.err.println("Длины массивов не равны");
            return newArr2;
        } else {

            try {
                for (int i = 0; i < a.length; i++) newArr[i] = a[i] / b[i];
            } catch (RuntimeException e) {
                System.out.println("Ошибка при добавлении елемента в массив" + " " + e);
            }

        }
        return newArr;
    }

    public static void prinArr(int[] arr) {
        for (int elem : arr
        ) {
            System.out.println(elem);
        }
    }



}