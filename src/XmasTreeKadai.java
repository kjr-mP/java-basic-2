public class XmasTreeKadai {

    public static void main(String[] args) {
        int Y=Integer.parseInt(args[0]);
        int X=Integer.parseInt(args[0]);
        int m=2;
        for(int i=0; i<=Y; i++){
            if(i%3==0)m=2;
            else if(i%3==1)m=1;
            else if(i%3==2)m=0;
            for(int j=0; j<X; j++){
                if(j%3==m){
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
            }
            X--;
            for(int n=0; n<i*2; n++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int y=0; y<Integer.parseInt(args[2]); y++){
            for(int n=0; n<Y-2; n++){
                System.out.print(" ");
            }
            for(int n=0; n<Integer.parseInt(args[1]); n++){
                System.out.print("*");
            }
            System.err.println();
        }
    }
}
