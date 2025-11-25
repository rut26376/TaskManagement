package main;

import model.Task;
import model.TaskRepository;

public class Main {

	public static void main(String[] args) {
		
		TaskRepository tr = new TaskRepository();
		System.out.println(tr.add(12, "iohi", "jidf"));
		System.out.println(tr.add(14, "iohi", "jidf"));
		tr.listAll();
		System.out.println(tr.getById(14));
		Task t2 = tr.getById(12);
		t2.setTitle("well");
		tr.update(t2);
		
	}

}
