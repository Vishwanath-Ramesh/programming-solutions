#include<stdio.h>
#include<ctype.h>
int main(){
    int i,j;
    char chr[]= "hi today is very bad day.";
    	for(i = 0; i < sizeof(chr); i++){
    	    if(chr[i] == 32){
    	        chr[0] = toupper(chr[0]);
    	        chr[i+1] = toupper(chr[i+1]);
    	    }
    	   if(chr[i] == 'a') {
    	       chr[i] = 'e';
    	       i++;
    	   }
	       if(chr[i] == 'e') {
	       chr[i] = 'a';
	       i++;
    	   }
    	   }
    	for(j = 0; j < sizeof(chr); j++)
    	    printf("%c",chr[j]);
return 0;
}