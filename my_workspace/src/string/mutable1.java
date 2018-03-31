package string;

public class mutable1 
{
Thread a=new Thread();
StringBuffer f = new StringBuffer();//you can create any instance outside method body
//but for accessing any members pointed by reference variable(inside instance)
//you need to execute reference_variable.member_variable inside method body only
//i.e., f.append(); inside method body only
f.append(false);

public void s()
{
	f.append(false);
	a.run();
	
}


}
