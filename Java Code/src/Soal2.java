public class Soal2 {
    static void ubah(int[] data, int d){
        for (int i = 0; i < data.length; i++){
            if ((data[i] + d) % 2 == 0){
                data[i] += i;
            } else {
                data[i] -= (d % 3);
            }
        }
        data = new int[] {9, 9, 9};
        data[0] = d;
    }

    public static void main(String[] args) {
        int d = 8;
        int[] a = {4, 7, 2, 9, 5};
        ubah(a, d);

        int totalGenap = 0;
        for (int x: a){
            if (x % 2 == 0) totalGenap += x;
        }

        for (int x : a) System.out.print(x + " ");
        System.out.println("| " + totalGenap);
    }
}
