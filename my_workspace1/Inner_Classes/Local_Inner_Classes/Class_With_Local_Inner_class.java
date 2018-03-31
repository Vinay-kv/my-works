package Local_Inner_Classes;

public class Class_With_Local_Inner_class {

	public static void main(String[] args) 
	{
		public class Local_Inner_Class
		/*Illegal modifier for the local class Local_Inner_Class; only abstract or final is permitted*/
		/*as by default these class declared inside method will be local to this method only and only this 
		 * method has access to the class declared inside it*/
		/*so no need of explicitly specifiying access level for local inner class(it will be implicitely 
		 * private to the method inside which class is declared)*/
		{
			
		}

	}

}
