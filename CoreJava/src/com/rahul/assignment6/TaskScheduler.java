package com.rahul.assignment6;

public class TaskScheduler {
	public void scheduleTask(Task t, int interval) {
		new Thread(()->{
			while(interval > 0) {
				try {
					t.execute();
					Thread.sleep(interval*1000);//execution of task after interval seconds
				} catch(Exception e) {
					System.out.println("failed to execute "+e.getMessage());
				}
			}
		}).start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskScheduler obj = new TaskScheduler();
		Task t1 = ()-> System.out.println("task 1 executing");
		Task t2 = ()-> System.out.println("task 2 executing");
		Task t3 = ()-> System.out.println("task 3 executing");
		obj.scheduleTask(t1, 2);
		obj.scheduleTask(t2, 5);//task2 executing after every 10 seconds
		obj.scheduleTask(t3, 10);//task3 executing after every 15 seconds
	}

}
