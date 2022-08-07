public class IfStatement {
    public static void main(String[] args) {

        var valor = 80;
        var asbsensia = 20;

        var valorAprovado = valor >= 75;
        var liuAbsensia = asbsensia >= 75;

        if (valor >= 75 && asbsensia >= 75) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Koko fali tinan oin");
        }

        if (valor >= 80 && asbsensia >= 80) {
            System.out.println("O nia valor A");
        } else if (valor >= 70 && asbsensia >= 70) {
            System.out.println("O nia valor B");
        } else if (valor >= 60 && asbsensia >= 60) {
            System.out.println("O nia valor C");
        } else if (valor >= 50 && asbsensia >= 50) {
            System.out.println("O nia valor D");
        } else {
            System.out.println("O nia valor E");
        }
    }
}