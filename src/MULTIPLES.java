public class MULTIPLES {
    public static void main(String[] args) {
        int multiple = 5;
        int multiples = 3;
        for(int i = 0; i < 1000;i ++){
            boolean a = i % multiple == 0;
            boolean b = i % multiples == 0;
            if (a){
                System.out.println(i);
            } else if(b) {
                System.out.println(i);
            }
        }
    }
}
