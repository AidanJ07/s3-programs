public class QuickSort {
    String n[];
    int len;

    public static void main(String[] args) {
        QuickSort ob = new QuickSort();
        String s[] = {"Ram", "Tom", "Carl", "Amal", "John", "Catherine", "Alan", "Rose", "Hari"};
        System.out.println("Before sorting :\n");
        for (String i : s) {
            System.out.print(i + " ");
        }
        ob.sort(s);
        System.out.println("\nAfter sorting :\n");
        for (String i : s) {
            System.out.println(i);
        }
    }

    void sort(String str[]) {
        if (str == null || str.length == 0) {
            System.out.print("No string entered");
            return;
        }
        this.n = str;
        this.len = str.length;
        quickSort(0, len - 1);
    }

    void quickSort(int lower, int upper) {
        int l = lower;
        int u = upper;
        String pivot = this.n[lower + (upper - lower) / 2];
        while (l <= u) {
            while (this.n[l].compareToIgnoreCase(pivot) < 0) {
                l++;
            }
            while (this.n[u].compareToIgnoreCase(pivot) > 0) {
                u--;
            }
            if (l <= u) {
                exchangeNames(l, u);
                l++;
                u--;
            }
        }
        if (lower < u) {
            quickSort(lower, u);
        }
        if (l < upper) {
            quickSort(l, upper);
        }
    }

    void exchangeNames(int l, int u) {
        String temp = this.n[l];
        this.n[l] = this.n[u];
        this.n[u] = temp;
    }
}
