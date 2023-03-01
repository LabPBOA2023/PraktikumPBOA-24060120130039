/**
 * File		: Titik.java	01/03/23
 * Penulis		: Hikmal Arkan Nur Zaidan
 * Deskripsi	: kelas yang berisi program utama yang memanfaatkan 
 *			   kelas Titik
 * 
 */ 

class Titik {
    private double absis; 
    private double ordinat; 
    static int counterTitik;
    
    public Titik(double a, double o) { 
        counterTitik++;
        absis = a;
        ordinat = o;
    }
    
    public Titik() { 
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }
    
    public void setAbsis(double a) { 
        absis = a;
    }
    
    public void setOrdinat(double o) { 
        ordinat = o;
    }
    
    public double getAbsis() { 
        return absis;
    }
    
    public double getOrdinat() { 
        return ordinat;
    }
    
    public int getCounterTitik() { 
        return counterTitik;
    }
}
