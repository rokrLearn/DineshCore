package com.dinesh.app;

public class CheckArray {

	public void checkArrayFunc(int num) throws MineException{
		try {
			justCheck();
			String[] sample = new String[num-1];
			for(int i = 0; i < num; i++) {
				sample[i] = "Sample"+i;
			}
		}catch(MineException e) {
			System.out.println("Encounter exception while processing :: "+e);
		}
	}
	
	private void justCheck() throws MineException{
		System.out.println("Check Statememnt !!");
		//throw new MineException("Method justCheck");
	}
}
