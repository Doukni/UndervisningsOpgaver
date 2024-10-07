public class multiplikationsTabelMetode {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            printTabel(i);

        }
    }

    static void printTabel(int n){
        for (int t=1; t<=10; t++){
            System.out.print(n*t + "\t");
        }
        System.out.println();
    }
}
