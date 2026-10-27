public class Soal1 {
    public static void main(String[] args) {
        int d = 8;
        int batas = 5 + (d % 3);
        int jumlah = 0;
        int hitung = 0;

        for (int i = 1; i <= batas; i++){
            for (int j = 1; j <= i; j++){
                if ((i + j + d) % 4 == 0){
                    continue;
                }
                if (i * j > 2 * batas){
                    break;
                }
                jumlah += (i - j);
                hitung++;
            }
        }

        System.out.println(hitung + " " + jumlah);
    }
}
