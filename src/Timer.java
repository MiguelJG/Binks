public class Timer extends Thread{

	private BinksUtils utils = new BinksUtils();

    @Override
	public void run(){
		while (Binks.AUDIO){
			try {
				Thread.sleep(utils.randInt(0, 2000)); //to start all the meesas at different times
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Too woke to sleep");
			}
			utils.playSound("resources/meesa.au");
			try {
				Thread.sleep(800); //to prevent the sound from being played twice a the same time if the same number is picked.
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Too woke to sleep");
			}
		}
	}
}

