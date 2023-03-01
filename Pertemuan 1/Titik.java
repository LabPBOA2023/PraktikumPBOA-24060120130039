/**
 * File		: Titik.java	01/03/23
 * Penulis		: Hikmal Arkan Nur Zaidan
 * Deskripsi	: kelas yang berisi program utama yang memanfaatkan 
 *			   kelas Titik
 * 
 */ 
 
 class Titik{
	double absis; 
	double ordinat; 
	static int counterTitik;
  
	Titik(double a,double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
  
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
		
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}

 }
