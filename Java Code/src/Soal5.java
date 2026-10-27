public class Soal5 {
    static int[] longestAvailable(char[] row){
        int panjang = 0;
        int indeksAwal = -1;
        int indeksAkhir = -1;
        int total = 0;
        int i = 0;

        while (i < row.length) {
            if (row[i] == 'O'){
                int mulai = i;
                while(i < row.length && row[i] == 'O') {
                    i++;
                }
                int len = i - mulai;

                if (len > panjang) {
                    panjang = len;
                    indeksAwal = mulai;
                    indeksAkhir = i - 1;
                }

                total += len;
            } else {
                i++;
            }
        }
        if (panjang == 0) return new int[]{0, -1, -1, 0};
        return new int[]{panjang, indeksAwal, indeksAkhir, total};
    }

    static int cariBaris(char[][] kursi, int kelompok) {
        int barisTerbaik = -1;
        int panjangTerbaik = 0;
 
        for (int r = 0; r < kursi.length; r++) {
            int[] hasil = longestAvailable(kursi[r]);
            if (hasil[0] >= kelompok && hasil[0] > panjangTerbaik) {
                panjangTerbaik = hasil[0];
                barisTerbaik = r;
            }
        }
        return barisTerbaik;
    }
    
    public static void main(String[] args) {
        char[][] kursi = {
            {'X', 'O', 'O', 'X', 'O', 'O', 'O'},
            {'O', 'O', 'X', 'O', 'O', 'X', 'O'},
            {'X', 'X', 'O', 'O', 'O', 'O', 'X'},
            {'O', 'O', 'O', 'X', 'O', 'O', 'O'}
        };
        int kelompok = kursi.length;

        int baris = cariBaris(kursi, kelompok);
        if (baris == -1) {
            System.out.println("Tidak ada baris yang dapat menampung " + kelompok + " orang berurutan.");
        } else {
            int[] hasil = longestAvailable(kursi[baris]);
            System.out.println("Baris: " + baris + " (baris ke-" + (baris + 1) + ")");
            System.out.println("Panjang: " + hasil[0] + ", Indeks Awal: " + hasil[1] + ", Indeks Akhir: " + hasil[2]);
        }
    }
}
