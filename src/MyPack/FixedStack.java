package MyPack;

import jdk.nashorn.internal.runtime.regexp.joni.constants.StackType;

public class FixedStack implements StackType {
	 private int stk[ ];
     private int tos;
     FixedStack(int size)
     {
             stk=new int[size];
             tos=-1;
     }
     public void push(int item)
     {
             if(tos==stk.length-1)
             {
                     System.out.println("Stack Overflows");
                     int t[ ]=new int[stk.length * 2];
                     for(int i=0;i<stk.length;i++)
                             t[i]=stk[i];
                     stk=t;
                     stk[++tos]=item;
             }
             else
                     stk[++tos]=item;
     }
     public int pop()
     {
             if(tos<0)
             {
                     System.out.println("Stack Underflows");
                     return 0;
             }
             else
                     return stk[tos--];
     }


	
public static void main(String[] args) {
		

	}
}
