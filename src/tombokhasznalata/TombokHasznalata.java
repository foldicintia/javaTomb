
package tombokhasznalata;

public class TombokHasznalata {

    public static void main(String[] args) {
       // pyLista = ["egy","ketto","harom"];
       // index:       0      1        2
       String[] tomb = {"egy","ketto","harom"};
       
       System.out.println("tömb= " + tomb);
       
       
       for(int i = 0; i<tomb.length; i++){ 
           System.out.printf("[%d. index] = %s\n",i,tomb[i]);
       }
       
       tomb = new String[4]; //megadom az uj meretet
       System.out.println("az üres tömb: ");
       for(int i = 0; i<tomb.length; i++){ 
           System.out.printf("[%d. index] = %s\n",i,tomb[i]);
       }
       tomb[2] = "zwei";
       for(int i = 0; i<tomb.length; i++){ 
            System.out.printf("[%d. index] = %s\n",i,tomb[i]);
       }
        System.out.println("teljesen angol: ");
        tomb[0]="one";
        tomb[1]="two";
        tomb[2]="three";
        tomb[3]="four";
        //tomb[4]="five";
        
       for(int i = 0; i<tomb.length; i++){ 
            System.out.printf("[%d. index] = %s\n",i,tomb[i]);
    }
       
    String[] nevek = {"Anna","János","Dalma","József"};
    int[] korok = {20,25,26,30};
    int osszKor = 0;
    for(int i = 0; i<nevek.length; i++){ 
        String nev = nevek[i];
        int kor = korok[i];
        osszKor += kor;
            System.out.printf("%6s kora: %3d év \n",nev,kor);
    }       
        //double atlag 1.0 = osszKor / korok.length;
        double atlag = (double)osszKor / korok.length;
        System.out.printf("a korok átlaga: %d\n",atlag);
    }

}
