
import java.util.*;

public class BAI03 {

    int arr[] = new int[10];

    void sum(BAI03 x, BAI03 y) {
        int result[] = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = x.arr[i] + y.arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    void sort() {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    void inputs() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(9) + 4;
        }
        System.out.println(Arrays.toString(arr));
    }

    void outputs() {
        System.out.println(Arrays.toString(arr));
    }

    void add(BAI03 x, BAI03 y) {
        int result[] = new int[20];
        for (int i = 0; i < 10; i++) {
            result[i] = x.arr[i];
            result[20 - i - 1] = y.arr[i];
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    void chia1(BAI03 x, BAI03 y) {
        int result[] = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = x.arr[i] / y.arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    void chia2(BAI03 x, BAI03 y) {
        int result[] = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = y.arr[i] / x.arr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    void giao(BAI03 x, BAI03 y) {
        int[] result = new int[15];
        int size = 0;
        for (int i = 0; i < x.arr.length; i++) {
            for (int j = 0; j < y.arr.length; j++) {
                if (x.arr[i] == y.arr[j]) {
                    result[size] = x.arr[i];
                    size++;
                }
            }
        }
        int[] ans = new int[result.length];
        int count = 0;
        boolean check ;
        for (int i = 0; i < result.length; i++) {
            check = false;
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] == result[j]) {
                    check = true;
                    break;
                }
            }
            if(!check)
            {
                ans[count]=result[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(ans));

    }

    void hop(BAI03 x, BAI03 y) {
        int temp[] = new int[20];
        for (int i = 0; i < 10; i++) {
            temp[i] = x.arr[i];
            temp[20 - i - 1] = y.arr[i];
        }
        int size = 0;
        int[] result = new int[x.arr.length];
        boolean check = false;
        for (int i = 0; i < 10; i++) {
            check = false;
            for (int j = 0; j < 10; j++) {
                if (temp[i] == result[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                result[size] = temp[i];
                size++;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        Random rand = new Random();
        BAI03 m1 = new BAI03();
        BAI03 m2 = new BAI03();
        m1.inputs();
        m2.inputs();
        System.out.println("Array 1 :");
        m1.outputs();
        System.out.println("Array 2 :");
        m2.outputs();
        BAI03 s = new BAI03();
        System.out.println("Array 1 + Array 2 :");
        s.sum(m1, m2);
        System.out.println(" Mang 1 tang dan :");
        m1.sort();
        System.out.println(" Mang 2 tang dan :");
        m2.sort();
        BAI03 m3 = new BAI03();
        System.out.println("Hop 2 mang tang dan");
        m3.add(m1, m2);
        System.out.println("Array 1 / Array 2");
        m3.chia1(m1, m2);
        System.out.println("Array 2 / Array 1");
        m3.chia2(m1, m2);
        System.out.println("Array 1 hop Array 2");
        m3.hop(m1, m2);
        System.out.println("Array 1 giao Array 2");
        m3.giao(m1, m2);
    }
}
