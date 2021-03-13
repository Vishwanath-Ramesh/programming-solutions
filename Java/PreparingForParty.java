/*---------------------------------QUESTION-------------------------------------*/
/*
Steve is going throw a party at his place tonight. He needs to visit two shops near his home - the first shop is d1 meters away from his place, the second shop is d2 meters away from his place, and there are d3 meters between these shops. Calculate the minimum distance he needs to walk to visit both shops and return back home. Steve always starts from his place. He can only travel using these three routes. He can use any route any amount of times necessary, the only thing he needs to achieve is the minimum distance. 
Input:
 There are three positive integers dl, d2, d3. 
 d1 is the distance betwetn Steve's place and the first shop.
 d2 is the distance between Steve's place and the second shop. 
 d3 is the distance between the 1st and the 2nd shop. 
Output:
 The minimum distance that Steve has to walk to visit both shops and return home.*/

import java.util.*;
import java.lang.*;
import java.io.*;
class PreparingForParty {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner in = new Scanner(System.in);
		String[] elements_0 = (in.nextLine()).split(" ");
		int d1 = Integer.parseInt(elements_0[0]);
		int d2 = Integer.parseInt(elements_0[1]);
		int d3 = Integer.parseInt(elements_0[2]);
		int minimum_distance=0, temp = 0;
		if(d1 < d2){
		    minimum_distance = d1;
		    temp = d1 + d2;
		    if(temp < d3){
		        minimum_distance += temp;
		    }
		    else{
		        minimum_distance += d3;
		    }
		    if((d1+d3) < d2){
		        minimum_distance = minimum_distance + d1 + d3;
		    }
		    else{
		        minimum_distance = minimum_distance + d2;
		    }
		}
		else{
		    minimum_distance = d2;
		    temp = d1 + d2;
		     if(temp < d3){
		        minimum_distance = minimum_distance + temp;
		    }
		    else{
		        minimum_distance = minimum_distance + d3;
		    }
		    if((d3 + d2) < d1){
		        minimum_distance = minimum_distance + d3 + d2;
		    }
		    else{
		        minimum_distance = minimum_distance + d1;
		    }
		}
		System.out.println(minimum_distance);
	}
}
