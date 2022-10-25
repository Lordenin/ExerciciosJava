package CodeWars;


public class Multiplos {
	  public int solution(int number) {

		    int total1 = 0;
		    int total2 = 0;
		    for(int i = 0; i < 10; i++){
		      if((i % 3) == 0){
		        total1 += i;
		      }
		    }
		    for(int i = 0; i < 10; i++){
		      if((i % 5) == 0){
		        total2 += i;
		      }
		    }
		  return total1 + total2;
		 }
		}