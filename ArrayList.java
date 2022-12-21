import java.util.*;

public class ArrayList {
    public Scanner input = new Scanner(System.in);
    
    int n;
    int[] a = new int[11];

    ArrayList() {
        
    }
    
    public void add(int element) {
        a[n++] = element;
    }

    public int size() {
        return n;
    }

    public int get(int index) {
        return a[index];
    }

    public void add(int index, int element) {
        n += 1;
        for (int i = n - 1; i >= index; i--) {
            if(i != 0) {
                a[i] = a[i - 1];
            }  else a[1] = a[0];
        } 
        a[index] = element;
    }

    public boolean contains(int element) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                count++;
            }
        }
        if (count != 0) {
            return true;
        }
        return false;
    }

    public void clear() {
        for (int i = size(); i >= 0; i--) {
            a[i] = '\0';
        }
        n = 0;
    }

    public int indexOf(int element) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == element) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }

    public int lastIndexOf(int element) {
        int index = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == element) {
                index = i;
                count++;
            }
        }
        if (count != 0) {
            return index;
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        if (n == 0) {
            return true;
        }
        return false;
    }

    public void remove(int index) {
        for (int i = index; i < n; i++) {
            if(i != n - 1) {
                a[i] = a[i + 1];
            } else a[n - 1] = '\0';
        }
        n -= 1;
    }

    public void removeElement(int element) {
        for (int i = 0; i < n; i++) {
            if (a[i] == element) {
                remove(i);
                break;
            }
        }
    }

    public int set(int index, int element) {
        int tempValue = 0;
        for (int i = 0; i < n; i++) {
            if (i == index) {
                tempValue = a[i];
            }
        }
        a[index] = element;
        return tempValue;
    }

    public int[] subList(int fromIndex, int toIndex) {
        int size = (toIndex - fromIndex) + 1;
        int[] arr = new int[size];
        int n = 0;
        for (int i = fromIndex; i <= toIndex; i++) {
            arr[n++] = a[i];
        }
        return arr;
    }

    public String toString() {
        String s1 = "";
        s1 += "[";
        for (int i = 0; i < n; i++) {
            if (i < (n - 1)) {
                s1 += a[i] + ", ";
            } else {
                s1 += a[i];
            }
        }
        s1 += "]";

        return s1;
    }

    public void trimToSize() {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }
        System.out.println("Array after changed: ");
        for(int i = 0; i < arr.length -1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length - 1] + "\n");
    }
    
    public void Sort(int[] a) {
        // handle
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // add
        System.out.println("Enter the quantity to add: ");
        int addNNumber = sc.nextInt();
        ArrayList b1 = new ArrayList();
        for (int i = 0; i < addNNumber; i++) {
            int value = sc.nextInt();
            b1.add(value);
        }
        System.out.println("Array: " + Arrays.toString(b1.a));
        // size
        System.out.println("Size of array: " + b1.size());
        // get
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        if (index < 0 || index >= b1.size()) {
            System.out.println("Out of range!");
        } else {
            System.out.println("a[" + index + "] = " + b1.get(index));
        }
        // add(insert)
        System.out.println("Enter the index you want to insert and its value: ");
        index = sc.nextInt();
        int element = sc.nextInt();
        if (index < 0 || index > b1.size()) {
            System.out.println("Out of range!");
        } else {
            b1.add(index, element);
            System.out.println("Array after changed: " + Arrays.toString(b1.a));
        }
        // contains
        System.out.println("Enter the element you want to check: ");
        element = sc.nextInt();
        if (b1.contains(element)) {
            System.out.println("The above array contains this element");
        } else {
            System.out.println("The above array doesn't contains this element");
        }
        // indexOf
        System.out.println("Enter the value: ");
        element = sc.nextInt();
        System.out.println("Index of this element: " + b1.indexOf(element));
        // lastIndexOf
        System.out.println("Enter the value to check last index: ");
        element = sc.nextInt();
        System.out.println("Index of last this element: " + b1.lastIndexOf(element));
        // isEmpty
        if (b1.isEmpty()) {
            System.out.println("Null!");
        } else {
            System.out.println("Not null!");
        }
        // remove element from index
        System.out.println("Enter the index you want to remove element: ");
        index = sc.nextInt();
        if (index < 0 || index > b1.size()) {
            System.out.println("Out of range!");
        } else {
            b1.remove(index);
            System.out.println("Array after changed: " + Arrays.toString(b1.a));
        }
        // remove direct element
        System.out.println("Enter the element you want to remove: ");
        element = sc.nextInt();
        b1.removeElement(element);
        System.out.println("Array after changed: " + Arrays.toString(b1.a));
        // set
        System.out.println("Enter the index and element you want to replace: ");
        index = sc.nextInt();
        element = sc.nextInt();
        if (index < 0 || index > b1.size()) {
            System.out.println("Out of range!");
        } else {
            System.out.println("The element previously " + b1.set(index, element));
            System.out.println("Array after changed: " + Arrays.toString(b1.a));
        }
        // subList
        System.out.println("Enter index-start and index-end: ");
        int fromIndex = sc.nextInt();
        int toIndex = sc.nextInt();
        int[] array = b1.subList(fromIndex, toIndex);
        System.out.println("Sub array: " + Arrays.toString(array));
        // toString
        System.out.println("Convert to string: " + b1.toString());
        // strimToSize
        b1.trimToSize();
        // clear
        b1.clear();
        System.out.println("Array after clear: " + Arrays.toString(b1.a));
        System.out.println("Size of array after clear: " + b1.size());
        //
        b1.Sort(b1.a);
    }

    static class java {

        public java() {
        }
    }
}