package com.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation ob=new Encapsulation();
		/*ob.name="rahul";
		ob.age=21;
		ob.serialNum=07;*/
		ob.setAge(21);
		ob.setName("rahul");
		ob.setSerialNum(07);
		
		//ob.show();
		System.out.println(ob);
	}

}
