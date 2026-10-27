public class Soal3 {
    public static void main(String[] args) {
        int[][] nilai = {
            {81, 72, 94},
            {65, 88, 76},
            {90, 91, 83}
        };

        double[] rata = new double[nilai.length];

        for (int i = 0; i < nilai.length; i++){
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++){
                total += nilai[i][j];
            }

            rata[i] = (double) total / nilai[i].length;
            System.out.printf("Nilai rata-rata tiap mahasiswa: "+ rata[i]);
        }
        
        double rataKelas = 0;
        for (double r : rata) rataKelas += r;
        rataKelas = rataKelas / (rata.length);

        System.out.printf("Nilai rata-rata kelas: "+ rataKelas);
    }
}
