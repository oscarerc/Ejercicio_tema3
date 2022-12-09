public class Main {
    public static void main(String[] args) {
        int resultado=0;
        resultado =tsumar(1, 2, 2);
        System.out.println("el resultado es: "+ resultado);

        coche micoche= new coche();
        micoche.ipuertas();

    }
    public static int tsumar(int int1, int int2, int int3){
        return (int1+int2+int3);
    }

}
