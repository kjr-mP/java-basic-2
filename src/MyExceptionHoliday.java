import java.util.Scanner;

public class MyExceptionHoliday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		while(true) {
			try{
                System.out.println("日付を入力してください(qを押して終了)");
                String input = scan.next();
                if(input.equalsIgnoreCase("q")){
                    System.out.println("終了します");
                    break;
                }
                int day=Integer.parseInt(input);
                if(isDay(day)){
                    if(isWeekday(day)){
                        System.out.println("この日付は休日です");
                    }else{
                        test();
                    }
                }else{
                    System.out.println("この日付は存在しません");
                }
            }catch(NumberFormatException e){
                System.err.println("日付を正しく入力してください");
            }catch(NoHolidayException e){
                e.printStackTrace();
            }
		}
    }
    private static boolean isDay(int day) {
        return day>=1&&day<=31;
    }
    private static boolean isWeekday(int day) {
        return day%7==4||day%7==5||day==3||day==6;
    }

    static void test() throws NoHolidayException{
		if(true){
			throw new NoHolidayException();
		}
	}
}