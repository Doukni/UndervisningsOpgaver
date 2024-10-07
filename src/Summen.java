public class Summen {
    public static void main(String[] args) {
        int ialt;
        ialt = summen(1,2,3);

        int a=7;
        int b=4;
        int c=29;
        ialt = summen(a,b,c);

        System.out.println(ialt);

    }

    static int summen(int x, int y, int z){
        int result = x + y + z;
        return result;
    }
}
