public class Soal4 {
    static int hitung(int[] a, int i){
        if (i == a.length) return 0;
;
        if(a[i] % 2 == 0){
            return (a[i] / 2) + hitung(a, i + 1);
        } else {
            return (i + 1) + hitung(a, i + 1);
        }
    }

    public static void main(String[] args) {
        int d = 8;
        int[] a = {3 + d, 6, 2 + d, 5, 8};
        System.out.println(hitung(a, 0));
    }
}
