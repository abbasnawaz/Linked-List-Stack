public class TestPostfix 
{
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println(" Postfox to Infix ");
		System.out.println();

		String postfix0="a+b*c-9";
		String postfix1="(a+e)/(b-d)";
		String postfix2="a+(b+c*d)-e/2";
		String postfix3="e-b*c^a+d";

		String infix0=Postfix.convertToPostfix(postfix0);
		String infix1=Postfix.convertToPostfix(postfix1);
		String infix2=Postfix.convertToPostfix(postfix2);
		String infix3=Postfix.convertToPostfix(postfix3);

		System.out.println();
		System.out.println(postfix0+" --> "+infix0);
		System.out.println();
		System.out.println(postfix1+" --> "+infix1);
		System.out.println();
		System.out.println(postfix2+" --> "+infix2);
		System.out.println();
		System.out.println(postfix3+" --> "+infix3);
		System.out.println();

		System.out.println();
		System.out.println(" Evaluting Postfix ");
		System.out.println();


		infix0=infix0.replace("a","2");
		infix0=infix0.replace("b","3");
		infix0=infix0.replace("c","4");
		infix0=infix0.replace("d","5");
		infix0=infix0.replace("e","6");

		System.out.println();
		System.out.println(infix0+"  =  "+Postfix.evalutePostfix(infix0));
		System.out.println();

		infix1=infix1.replace("a","2");
		infix1=infix1.replace("e","6");
		infix1=infix1.replace("b","3");
		infix1=infix1.replace("d","5");

		System.out.println();
		System.out.println(infix1+"  =  "+Postfix.evalutePostfix(infix1));
		System.out.println();

		infix2=infix2.replace("a","2");
		infix2=infix2.replace("b","3");
		infix2=infix2.replace("c","4");
		infix2=infix2.replace("d","5");
		infix2=infix2.replace("e","6");


		System.out.println();
		System.out.println(infix2+"  =  "+Postfix.evalutePostfix(infix2));
		System.out.println();

		infix3=infix3.replace("a","2");
		infix3=infix3.replace("b","3");
		infix3=infix3.replace("c","4");
		infix3=infix3.replace("d","5");
		infix3=infix3.replace("e","6");

		System.out.println();
		System.out.println(infix3+"  =  "+Postfix.evalutePostfix(infix3));
		System.out.println();




	 	}
}