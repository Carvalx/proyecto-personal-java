public class Bucles {
    public static void main(String[] args) {
        //For
        for (int i=1; i<=10; i++) {
            // int par = i % 2;
            // if (par == 0){
            if (i % 2 == 0) {
                System.out.println(i);
            } 
        }

        //While
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        System.out.println("Despegue!!!");
    }
}
