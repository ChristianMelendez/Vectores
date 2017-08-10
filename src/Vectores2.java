/*
 * Construir un vectores de numeros enteros llamados vecnumeros e inicializarlo con los numeros:
 * 11,-22, 33,-44,55,-66,77,-88,99
 *  Construir un vector de enteros llamados vecpositivos de longitud 10, que contenga los numeros positivos de vecnumeros
 *  Construir un vector de enteros llamados vecnegativos de longitud 10 que contengas los numeros negativos de vecnumeros
 *  Acumular la suma de los valores positivos en una variable llamada totalpositivos.
 *  Acumular la suma de los valores negativos en una variable llamada totalnegativos.
 *  El contenido de vecnumeros
 *  El contenido de vecpositivos
 *  El contenido de vecnegativos
 */

/**
 *
 * @author Español
 */
import javax.swing.JOptionPane;
public class Vectores2 {
    public static void main (String []args){
        
    int i;
    int [] vecnumeros={11,-22, 33,-44,55,-66,77,-88,99};
    int [] vecpositivos=new int[10];
    int [] vecnegativos=new int[10];
    int totalpositivos=0;
    int totalnegativos=0;
    int indicepositivo=0;
    int indicenegativo=0;
    //----------------------------------------------
    for (i=0;i<vecnumeros.length;i++){
       
        if (vecnumeros[i]>0){
            vecpositivos[indicepositivo]=vecnumeros[i];
            indicepositivo++;
            totalpositivos+=vecpositivos[i];
            
                }else{
            vecnegativos[indicenegativo]=vecnumeros[i];
            indicenegativo++;
            totalnegativos+=vecnegativos[i];
        }
        
    //--------------------------------------------------------------
     
     }
    //JOptionPane.showMessageDialog(null,"Total positivos: "+totalpositivos+"\n Total negativos: "+totalnegativos);
    System.out.println("Hay:"+indicenegativo+" numeros negativos");
    System.out.println("Hay:"+indicepositivo+" numeros positivos");
    for (i=0;i<indicenegativo;i++){
         System.out.println(vecpositivos[i]+" ");
    }
    for (i=0;i<indicenegativo;i++){
         System.out.println(vecnegativos[i]+" ");
    }
    }
}
