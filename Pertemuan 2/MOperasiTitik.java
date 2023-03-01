/**
 * File		: MOperasiTitik.java	01/03/23
 * Penulis		: Hikmal Arkan Nur Zaidan
 * Deskripsi	: kelas yang berisi program utama yang memanfaatkan 
 *			   kelas MOperasiTitik
 * 
 */ 

class MOperasiTitik {
    public static void main(String[] args) {
        Titik titik = new Titik(4, 4);
        OperasiTitik operasititik = new OperasiTitik();
        
        System.out.println("titik (" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
        
        operasititik.refleksiX(titik);
        
        System.out.println("titik setelah refleksi sb X (" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
        
        operasititik.refleksiY(titik);
        
        System.out.println("titik setelah refleksi sb Y (" + titik.getAbsis() + ", " + titik.getOrdinat() + ")");
    }
}
