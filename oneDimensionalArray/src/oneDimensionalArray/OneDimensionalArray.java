package oneDimensionalArray;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = new int[3];
		 x[0]=12;
		 x[1]=16;
		 x[2]=18;
		 
		 for(int i=0;i<x.length;i++) {
			 System.out.println(x[i]);
		 }
		
		 int [] y= {1,5,9,8};
		 
		 for(int i=0;i<y.length;i++) {
			 System.out.println("Array y"+ y[i]);
		 }
		 
		 String [] student= {"jon","Adam"};
		 
		 for(int i=0;i<student.length;i++) {
			 System.out.println(student[i]);
		 }
		
		 Student [] newStudent=new Student[3];
		 newStudent[0]=new Student("Tom", 22);
		 newStudent[1]=new Student("Sara", 25);
		 newStudent[2]=new Student("smith", 28);
		 
		 for(Student newst: newStudent)
		 {
			 System.out.println("Name "+newst.name);
			 System.out.println("Age "+newst.age);
		 }
	
		 
		 

	}

}
