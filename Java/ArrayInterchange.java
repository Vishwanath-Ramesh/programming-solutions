import java.util.*;

class ArrayInterchange {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int min = 0, max = N - 1, itr = 0, temp = 0;
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = s.nextInt();
        }
        int q = s.nextInt();
        int[] query = new int[2*q];
        int[] loc = new int[query.length];
        for (int j = 0; j < 2 * q; j++)        
            	query[j] = s.nextInt();        
        for (int l = 0; l < query.length; l++) {
            for (int m = 0; m < values.length; m++) {
                if(values[m] == query[l]){
                    loc[itr] = m;
                    itr++;
                    break;
                }
            }
        }
        for (int n = 0; n < loc.length; n++) {
            temp = values[loc[n]];
            values[loc[n]] = values[max - loc[n]];
            values[max - loc[n]] = temp;
        }
        for(int result : values)
            System.out.printf("%d ", result);
	}
}
