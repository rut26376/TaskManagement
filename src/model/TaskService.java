package model;

public class TaskService extends TaskRepository{
	
	
	public void markAsDone(int id)
	{
		if(tasks.isEmpty())
			listAll();
		Task t = getById(id);
		t.setStatus(Status.DONE);
		update(t);
	}
	
	
	

}
