package facultativLesson1;

public class Ex3 {

	public static void main(String[] args) {
		String name = "National Aviation University";
		char abr1 = name.charAt(0);
		char abr2 = name.charAt(9);
		char abr3 = name.charAt(18);
		System.out.print (abr1);
		System.out.print (abr2);
		System.out.print (abr3);
		System.out.println ();
//		System.out.println (abr1 + abr2 + abr3);
//		System.out.println (name.indexOf("Aviation"));
//		System.out.println (name.substring(name.indexOf("A"), name.indexOf("viation")) );
//		System.out.println (name.substring(name.indexOf(" ")+1, name.length()- (name.indexOf(" ") + name.indexOf(" ")+2) ));
//		System.out.println (name.indexOf("Aviation"));
//		System.out.println (name.substring(name.indexOf(" ")+1, name.length()- (name.indexOf(" ") + name.indexOf(" ")+2) ));
		System.out.println(name.indexOf(0));
		System.out.println(name.indexOf("University"));
		
		System.out.print(abr1);
		System.out.print (name.substring(name.indexOf(" ")+1, name.length()- (name.indexOf(" ") + name.indexOf(" ")+2) ));
		System.out.print (name.substring(name.lastIndexOf(" ")+1, name.length()-name.indexOf(" ")-1));
		
		
		
		
		
		
		
		
		
		
		
	}

}
