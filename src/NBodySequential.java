import java.awt.Point;
import java.util.ArrayList;

public class NBodySequential {
	public final double G = 6.67 * Math.pow(10, -11);
	public final int mass = 5;
	private int numBodies;
	private int bodyRadius;
	private int numSteps;
	private ArrayList<Body> oldbodies;
	private ArrayList<Body> newbodies;
	
	public void main (String [] args){
		if (args.length < 4){
			System.out.println("NBodySequential numWorkers numBodies bodyRadius numSteps");
			System.exit(1);
		}
		
		//int numWorkers = Integer.parseInt(args[0]);
		numBodies = Integer.parseInt(args[1]);
		bodyRadius = Integer.parseInt(args[2]);
		numSteps = Integer.parseInt(args[3]);
		
		bodies = new ArrayList<>();
		System.out.println("ehllo");
		
	}

	public void calculateForces(){
		double distance, magnitude;
		Point direction;
		Body body1, body2;
		Point pos1, pos2;
		
		for (int i = 0; i < numBodies-1; i++){
			body1 = oldbodies.get(i);
			body2 = oldbodies.get(i+1);
			pos1 = body1.getPos();
			distance = Math.sqrt( pos1.x 
			
		}
		
	}
	
}
