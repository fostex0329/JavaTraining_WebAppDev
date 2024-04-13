public class Main1 {
    public static void main(String[] args) {
        
        int a = 30;
        int b = 40;
        int c = 50;
        int total = 6000;
        int count = 0;

        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                for(int k = 0; k <= c; k ++){
                    if(total == ((500 * i) + (100 * j) + (50 * k))){
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);   

    }
}
