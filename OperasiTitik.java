/**
 * File		: OperasiTitik.java	01/03/23
 * Penulis		: Hikmal Arkan Nur Zaidan
 * Deskripsi	: kelas yang berisi program utama yang memanfaatkan 
 *			   kelas OperasiTitik
 * 
 */ 

 class OperasiTitik{
	 private void refleksiSumbuX(Titik titik){
		titik.setOrdinat((titik.getOrdinat())*-1);
	 }
	 
	 private void refleksiSumbuY(Titik titik){
		titik.setAbsis((titik.getAbsis())*-1);
	 }
	 
	 public void refleksiX(Titik titik){
		refleksiSumbuX(titik);
	 }
	 
	 public void refleksiY(Titik titik){
		refleksiSumbuY(titik);
	 }
	 
 }