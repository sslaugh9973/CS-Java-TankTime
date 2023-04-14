package tankTime;

public interface ITank {
	public String getName();
	public void setAngle(double angle);
	public void setVelocity(double velocity);
	public double calc_distance();
	public double fire();
}
