package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String students1 = "Engin";
		String students2 = "Derin";
		String students3 = "Salih";
		String students4 = "Ahmet";
		
		System.out.println(students1);
		System.out.println(students2);
		System.out.println(students3);
		System.out.println(students4);
		
		System.out.println("-----------------------------");
		
		String[] students = new String[4];
		students[0]="Engin";
		students[1]="Derin";
		students[2]="Salih";
		students[3]="Ahmet";
		//students[4]="Ali";

		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("-----------------------------");
		
		for(String student:students) {
			System.out.println(student);
		}
		
	}
}