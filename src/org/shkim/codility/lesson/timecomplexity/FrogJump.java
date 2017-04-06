package org.shkim.codility.lesson.timecomplexity;

public class FrogJump
{
	public static int solution(int X, int Y, int D){
		
		if (X > Y)
		{
			return 0;
		}		
		int t= (Y-X)%D;
		int cnt= 0;
		
		if (t == 0)
		{
			cnt =(Y-X)/D;
		}else{
			cnt = (Y-X)/D +1;			
		}
		
		
		return cnt;
	}
}
