import java.util.Random;

public class HeikinCKadai {
    public static void main(String[] args){
		Kamoku[] kamoku = new Kamoku[100];
		Random r = new Random();
		for(int i=0;i<100;i++){
			int score = r.nextInt(101);
			kamoku[i]= new Kamoku(score);
			System.out.println((i+1)+"人目の点数は"+kamoku[i].getScore());
		}
		int sum=0;
		for(int i=0;i<100;i++){
			sum+=kamoku[i].getScore();

		}
		System.out.println("平均点は"+sum/100);
    }
}
