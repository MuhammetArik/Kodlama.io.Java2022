package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String message = "Today weather very beautiful.";
		System.out.println(message);

		/*
		System.out.println("Number of elements : " + message.length());
		System.out.println("5. number element : " + message.charAt(4));
		System.out.println(message.concat(" I'm happy!"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));
		char[] characters = new char[5];
		message.getChars(0, 5, characters,0);
		System.out.println(characters);
		System.out.println(message.indexOf("ea"));
		System.out.println(message.indexOf("v"));
		*/
		
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		System.out.println(message.substring(2,5));
		
		for(String word : message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		
		String messageSpace = "     Today weather very beautiful.     ";
		System.out.println(messageSpace);
		System.out.println(messageSpace.trim());
		
	}
}