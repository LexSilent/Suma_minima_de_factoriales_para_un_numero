import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int Numero_introducido= entrada.nextInt();
        Principal p =new Principal();
        System.out.println("El mínimo sumatorio de factoriales de "+Numero_introducido+" son: ");

        int numero_Maximo= p.Evaluar(Numero_introducido,1);
        p.minimo_sumatorio(Numero_introducido,numero_Maximo);
    }
    public int Evaluar(int Numero_Introducido, int contador){//calcula el maximo factorial
        Principal p =new Principal();

        int Factorial=contador;
        if(contador>Numero_Introducido) return -1;
        Factorial=p.Factorial(Factorial);

        if (Factorial<=Numero_Introducido){

            contador=Evaluar(Numero_Introducido,contador+1);
            return contador+1;
        }
        return 0;
    }
    public int Factorial(int numero){//calcula el factorial
        if(numero>0){
            for(int multiplo=numero-1;multiplo>1;multiplo=multiplo-1){
                numero=numero*(multiplo);
            }
            return numero;
        }else
            return -1;
    }

    public int minimo_sumatorio(int Numero_introducido,int Factorial_max){//da la suma minima de factoriales
        Principal p =new Principal();
        int resultado_fact=p.Factorial(Factorial_max);

        if(Factorial_max<1){
            return 0;
        }
        if(resultado_fact<=Numero_introducido){
            System.out.println(Factorial_max+"!");
            minimo_sumatorio(Numero_introducido-resultado_fact,Factorial_max);
        }else{
            minimo_sumatorio(Numero_introducido,Factorial_max-1);
        }
        return 0;
    }
}
