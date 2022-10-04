public class Main {
    public static void main(String[] args) {
        System.out.println(suma(1,2,3));
        Coche miCoche = new Coche();
        miCoche.ponerPuertas();
        System.out.println(miCoche.puestas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche {
    int puestas = 2;

    public void ponerPuertas(){
        this.puestas ++;
    }
}