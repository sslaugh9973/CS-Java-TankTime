package tankTime;

import java.util.Scanner;
import misc_util.Misc_Util;


public class Human_Tank extends Tank {
    private Scanner scan;

    public Human_Tank(String name, Scanner scan) {
        super(name);
        this.scan = scan;
    }

    	@Override
        public double fire() {
            double angle = Misc_Util.get_user_input_int(scan, 0, 90, "Enter the angle between 0 and 90 degrees: ");
            double velocity = Misc_Util.get_user_input_int(scan, 0, 250, "Enter the velocity between 0 and 250: ");
            super.setAngle(angle);
            super.setVelocity(velocity);
            double distance = super.calc_distance();
            System.out.println(super.getName()+ "The shot traveled" + distance + " meters");
            return distance;
    }
}

