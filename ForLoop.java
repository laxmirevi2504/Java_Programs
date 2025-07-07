package fundamentals;

public class ForLoop {

	public static void main(String[] args) {
		int n=5;
		
//		for(int i=1;i<=n;i++) {
//			System.out.println(i);
//		}
		//System.out.println(i);
		
//		for(int i=1,j=10;i<=n && i<=n;i++,j +=4) {//we can also do like this
//			System.out.println(i+" "+j);
//		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				System.out.println(i+" "+j);
			}
		}
		
	}

}
