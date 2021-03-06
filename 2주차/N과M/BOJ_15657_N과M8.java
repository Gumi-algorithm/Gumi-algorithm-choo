package N과M;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class BOJ_15657_N과M8 {
	static int n,m;
	static int[] arr;
	static int[] arr2;
	static PrintWriter pw=new PrintWriter(System.out);
	static void combination(int idx,int pre) {
		if(idx==m) {
			for(int a:arr2)
				pw.print(a+" ");
			pw.println();
			return;
		}
		
		for(int i=pre;i<n;i++) {
			arr2[idx]=arr[i];
			combination(idx+1,i);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str= br.readLine().split(" ");
		n=Integer.parseInt(str[0]);
		m=Integer.parseInt(str[1]);
		arr=new int[n];
		arr2=new int[m];
		str= br.readLine().split(" ");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		combination(0,0);
		
		br.close();
		pw.close();
	}
}