package model;

import java.util.List;

public class TaskService extends TaskRepository{
	
	
	public void markAsDone(int id)
	{
		Task t = getById(id);
		t.setStatus(Status.DONE);
		update(t);
	}
	
	public List<Task> searchByText(String text)
	{
	
		return null;
	}
	
	

}
