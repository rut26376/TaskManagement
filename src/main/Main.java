package main;

import java.util.Scanner;

import model.TaskService;

public class Main {

	 public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
		int type = -1;
		TaskService ts = new TaskService();
		System.out.println("Choose an option:\n"
				+ "0. Exit"
				+ "1. Add\n"
				+ "2. Update\n"
				+ "3. Delete\n"
				+ "4. Get By Id\n"
				+ "5. List all\n"
				+ "6. Mark as done\n"
				+ "7. Search by text\n"
				+ "8. Sort by status");
		while(type != 0)
		{
			
			System.out.print("Your choice: ");
			type = console.nextInt();
			switch (type)
			{
			case 1:
				System.out.print("id: ");
				int id = console.nextInt();
				console.nextLine();
				System.out.print("title: ");
				String title = console.nextLine();
				System.out.print("description: ");
				String des = console.nextLine();
				System.out.println(ts.add(id, title, des));
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			
			}
		}
		 
		 
		 
		 
		 
		 
	    }

}
