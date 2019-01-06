package domain;

public class Division {
    //Atributo de la clase
    private int numerador;
    //Atributo de la clase
    private int denominador;

    public Division(int numerador, int denominador) throws OperationException {
        if (denominador == 0) {
            //throw new IllegalArgumentException("Denominador igual a cero");
            throw new IllegalArgumentException("Denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void visualizarOperacion() {
        System.out.println("El resultado de la división es: " + numerador / denominador);
    }
        
}
