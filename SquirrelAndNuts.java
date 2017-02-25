/*-----------LOGIC------------*/
/*STEP:1 The squirrel takes 200 nuts and goes 50kms.
  STEP:2 After reaching 50th km,it leaves 100 nuts and return bake to initial position with remaining nuts(200-(50+100)=50nuts).
  STEP:3 Again it takes 200 nuts and goes 50km,at this point, it has 150(2nd travel)+100(left during 1st travel)=250 nuts left at this position.
  STEP:4 Then,the squirrel takes 200 nuts from 50th km and covers remaining distance(200-50=150) ie.,150km.
  STEP:5 After reaching final position the squirrel have 50nuts i.e.,(200-150=50)nuts*/
         
import java.util.*;
class SquirrelAndNuts{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt(),Y = scanner.nextInt(),Z = scanner.nextInt();
		int dist_1 = 0,Rem_nuts = 0,R_trip = 0,F_trip = 0,T_trip = 0,carry_1 = 0,Rem_dist = 0;
		dist_1 = X / 4;
		while(T_trip < Y){
			carry_1 = Y;
			Z = Z - carry_1;
			F_trip = carry_1 - dist_1;
			R_trip = F_trip - dist_1;
			T_trip += R_trip;
		}
		Rem_dist = X - dist_1;
		Rem_nuts = T_trip - Rem_dist;
		System.out.println(Rem_nuts);
	}
}
