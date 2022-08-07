public class OperasiBoolean {
    public static void main(String[] args) {

        var absensia = 76;
        var valorIkus = 80;

        boolean liuAbsen = absensia >=75;
        boolean valorLiu = valorIkus >=75;

        var liu = liuAbsen && valorLiu;
        System.out.println(liu);
    }
}
