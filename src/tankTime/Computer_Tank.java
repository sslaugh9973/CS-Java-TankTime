package tankTime;


import misc_util.Misc_Util;

public class Computer_Tank extends Tank {

    public Computer_Tank(String name) {
        super(name);
    }

    @Override
    public double fire() {
        double angle = Misc_Util.gen_random_int(0, 89);
        double velocity = Misc_Util.gen_random_int(0, 250);
        super.setAngle(angle);
        super.setVelocity(velocity);
        double distance = super.calc_distance();
        System.out.println(super.getName()+ "The shot traveled" + distance + " meters");
        return distance;
        
    }
}