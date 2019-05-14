package burbujastring;
import java.util.Scanner;
public class BurbujaString {

    public static void main(String[] args) {
        String auxI="", auxJ="";
        int intOpcion=0;
        Scanner scan = new Scanner(System.in);
        String album[][] = {{"Track 01","Volaverunt opus 666"}, 
            {"Track 02","La voz dormida"}, 
            {"Track 03","Hazme un sitio entre tu piel"}, 
            {"Track 04","El poema de la lluvia triste"}, 
            {"Track 05","El callejón del infierno"}, 
            {"Track 06","El paseo de los tristes"},
            {"Track 07","La posada de los muertos"}, 
            {"Track 08","Desde mi cielo"}, 
            {"Track 09","En nombre de Dios"}, 
            {"Track 10","Incubos y súcubos"}, 
            {"Track 11","Diabulus in musica"}, 
            {"Track 12","Mañana empieza hoy"}, 
            {"Track 13","El príncipe de la dulce pena"}, 
            {"Track 14","Aquelarre"}, 
            {"Track 15","Hoy toca ser feliz"}, 
            {"Track 16", "Creo (La voz dormida - Parte II)"}, 
            {"Track 17", "La Cantata del Diablo (Missit Me Dominus)"}};        
        
        do{
        System.out.println("Seleccione una opcion: \n1.- Orden por track asc\n2.- Orden por track desc\n3.- Orden por Cancion asc\n4.- Orden por Cancion desc\n5.-Salir");
        intOpcion = scan.nextInt();
        
        switch(intOpcion){
            case 1:
                ordenaBurbuja(album,0,0);
                break;
            case 2:
                ordenaBurbuja(album,1,0);
                break;
            case 3:
                ordenaBurbuja(album,0,1);
                break;
            case 4:
                ordenaBurbuja(album,1,1);
                break;
        }
        if (intOpcion != 5)
            imprimir(album);
        }while(intOpcion != 5);
    }
    
    public static void imprimir(String arreglo[][]){
        for(int i= 0; i < arreglo.length; i++){
            System.out.println(arreglo[i][0] + " - " + arreglo[i][1]);
        }
    }
    
    public static void ordenaBurbuja(String arreglo[][], int orden, int dato){
        String aux="";
        for(int i = 0; i< arreglo.length; i++){
            for(int j= 0; j < arreglo.length-1; j++ ){
                if(orden == 0){
                    if (arreglo[j][dato].compareTo(arreglo[j+1][dato])> 0){
                        aux = arreglo[j+1][0];
                        arreglo[j+1][0] = arreglo[j][0];
                        arreglo[j][0] = aux;	

                        aux = arreglo[j+1][1];
                        arreglo[j+1][1] = arreglo[j][1];
                        arreglo[j][1] = aux;
                    }
                }else{
                    if (arreglo[j][dato].compareTo(arreglo[j+1][dato])< 0){
                        aux = arreglo[j+1][0];
                        arreglo[j+1][0] = arreglo[j][0];
                        arreglo[j][0] = aux;	

                        aux = arreglo[j+1][1];
                        arreglo[j+1][1] = arreglo[j][1];
                        arreglo[j][1] = aux;}
                } 
            }
        }
    }
    
}
    
