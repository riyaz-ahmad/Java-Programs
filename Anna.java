import java.util.*;

public class Anna{
	static boolean isAnna(String a, String b){
		if(a.length() != b.length())
			return false;
		else{
			char []c1 = a.toCharArray();
			char []c2 = b.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			for(int i=0; i<c1.length;i++){
				if(c1[i]!=c2[i])
					return false;
			}
			return true;
		}
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		
		s.close();
		boolean r = isAnna(a,b);
		System.out.println((r)? "Anagram" : "Not Anna");
	}
} 