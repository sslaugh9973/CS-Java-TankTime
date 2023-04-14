package tankTime;

public abstract class Tank implements ITank {
	private String name;
	private double angle;
	private double velocity;
	public Tank(String name) {
		this.name = name;
	}
	@Override//this is a getter method
	public String getName(String name) {
		return name;
	}
	@Override //this is a setter method
	public void setAngle(double angle) {
		if(angle > 0 && angle < 90) {
			this.angle = angle;
		}else {
			this.angle = 0;
		}
	}
	@Override
	public void setVelocity(double velocity) {
		if(velocity <0) {
			velocity = 0;
		}
		this.velocity = velocity;
	}
	@Override
	public double calc_distance() {
		double theta = Math.toRadians(angle);
		double distance = (velocity*velocity*Math.sin(2*theta))/9.8;
		return distance;
	}
}
