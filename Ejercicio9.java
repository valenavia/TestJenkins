package Ejercicio9;

public class Ejercicio9 {
    public static void main(String[] args) {
        Matematica mate = new Matematica((Math.random()*10), (Math.random()*10));
        System.out.println(mate);
        MatematicaService.calcularPotencia(mate);
        MatematicaService.calcularRaiz(mate);
    }
}
