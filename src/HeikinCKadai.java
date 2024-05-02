import java.util.Random;

public class HeikinCKadai {
    public static void main(String[] args){
		Kamoku[] kamoku = new Kamoku[100];
		Random r = new Random();
		for(int i=0;i<100;i++){
			int score = r.nextInt(101);
			kamoku[i]= new Kamoku(score);
		}
		int sum=0;
		for(int i=0;i<100;i++){
			sum+=kamoku[i].getScore();
		}
		System.out.println("平均点は"+sum/100);
		System.out.println("以下が合格者の一覧です");
		for(int i=0;i<100;i++){
			if(kamoku[i].getScore()>=80){
				System.out.println((i+1)+"人目:"+kamoku[i].getScore()+"点");
			}
		}
    }
}
