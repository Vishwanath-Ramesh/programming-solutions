#include<stdio.h>
int m = 0,temp = 0,count = 0;
int reverse(int val){
	while(val != 0){
		temp = val % 10;
		m = m * 10 + temp;
		val = val / 10;
		}
	return m;
	}
int main(){
    int num = 0,rev = 0,temp2 = 0;
    scanf("%d",&num);
	while(num != 0){
	temp2 = num + reverse(num);
	m = 0;
	rev = reverse(temp2);
	if(temp2 == rev){
		printf("Not a Lychrel Number");
	    break;
	}
	else{
	    num = temp2;
	    count++;
	    /*Assuming that a Number is Lychrel if it doesn't form a palindrome even after 50 cycles.*/
	    if(count >=50){
	        printf("It is a Lychrel Number");
	        return 0;
	    }
	}
	}
return 0;
}
