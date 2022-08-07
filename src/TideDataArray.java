public class TideDataArray {
    public static void main(String[] args) {
        String[] arraySrtring;

        arraySrtring = new String[3];

        arraySrtring[0] = "Edinho";
        arraySrtring[1] = "Love";
        arraySrtring[2] = "Melania";

        System.out.println(arraySrtring[0]);
        System.out.println(arraySrtring[1]);
        System.out.println(arraySrtring[2]);

        String[] naranNaran = {"Edinho", "Melania", "Melita"};

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Rivaldo", "Jose"},
                {"De", "Jesus"},
                {"Guterres"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[1][1]);
    }
}
