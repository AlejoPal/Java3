public class App {

    public static int obtenerNumeroSuerte(String fecha ){
            int numeroSuerte = 0; 
            String [] arreglofecha = fecha.split("/",3);
            int valorDia = Integer.parseInt(arreglofecha[0]);
            int valorMes = Integer.parseInt(arreglofecha[1]);
            int valorAnio = Integer.parseInt(arreglofecha[2]);
    
            int sumaPartesFechas = valorDia + valorMes + valorAnio;
            while(sumaPartesFechas > 0){
                numeroSuerte += sumaPartesFechas%10;
                sumaPartesFechas = sumaPartesFechas / 10;
            }
            return numeroSuerte;
        }
    
    public static void main(String[] args) {
        System.out.println(obtenerNumeroSuerte("12/12/1992"));
        }
    
}
