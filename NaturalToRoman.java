import java.util.*;
class NaturalToRoman{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int natural = scanner.nextInt();
		StringBuffer roman = new StringBuffer();
loop:		while(natural != 0){
		if(natural >= 50){
			roman .append("L");
			natural -= 50;
			continue loop;}
		if(natural >= 10){
			roman .append("X");
			natural -= 10;
			continue loop;}
		if(natural >= 100){
			roman .append("C");
			natural -= 100;
			continue loop;}
		if(natural >= 1000){
			roman .append("M");
			natural -= 1000;
			continue loop;}
		if(natural <= 10){
			roman .append("I");
			natural -= 10;
			continue loop;}
		if(natural >= 0)
			break;
		}
		System.out.println(roman);
	}
}