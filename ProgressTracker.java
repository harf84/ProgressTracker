

public class ProgressTracker {

	public static void main(String[] args) {
		int n= 100000000;int v=n/100;
		String str="Progress";
		String sp = "                                                  ";
		int spaces =51;//1 space per 2%
		while (n != 0){
			if (((double)n/v) % 2 == 0){
				str += "=";
				System.out.print ("\r"+str+sp.substring(0,--spaces)+ (100-n/v)+" %");
			}
			n--;
		}
		str += "=";
		System.out.print ("\r"+str+ 100+" %\n");
	}

}
