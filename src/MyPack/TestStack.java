package MyPack;

public class TestStack {

	
	public static void main(String[] args) {
		   FixedStack fs=new FixedStack(3);
           VariableStack ds=new VariableStack(5);
           Stack mystk;
           for(int i=0;i<3;i++)
                   fs.push(i);
           System.out.println("Fixed length Stack Contents are.");
           for(int i=0;i<3;i++)
                   System.out.println(fs.pop());
           for(int i=0;i<7;i++)
                   ds.push(i);
           System.out.println("Dynamic length Stack Contents are");
           for(int i=0;i<7;i++)
                   System.out.println(ds.pop());
           mystk=(Stack) fs;
           for(int i=0;i<3;i++)
                   mystk.push(i);
           System.out.println("Fixed length Stack Contents using interface reference");
           for(int i=0;i<3;i++)
                   System.out.println(mystk.pop());
           mystk=ds;
           for(int i=0;i<7;i++)
                   mystk.push(i);
           System.out.println("Dynamic length Stack Contents using interface reference");
           for(int i=0;i<7;i++)
                   System.out.println(mystk.pop());
   }

	}


