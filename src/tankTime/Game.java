package tankTime;

import java.util.Scanner;
import misc_util.Misc_Util.*;

public class Game {

	private Tank human;
    private Tank computer;
    private Scanner scan;
    private boolean game_over;
    private double distance;​//the distance the tanks are apart
    private double range;//how close the shot has to be to win
    private int turn;

public Game(Scanner scan){
    this.scan = scan;
}
            
​private void initialize_game(){
    this.game_over = false;
    this.distance = Misc_util.gen_random_int(50, 300);
    System.out.println("The distance between the tanks is" + this.distance + " meters");
    System.out.println("What difficulty would you like to play on? Easy, Medium, Hard");
    String difficulty = scan.nextLine();
    if(difficulty.equalsIgnoreCase("easy")){
        this.range = 20;
    }else if(difficulty.equalsIgnoreCase("medium")){
        this.range = 10;
    }else if(difficulty.equalsIgnoreCase("hard")){
        this.range = 5;
    this.range= 10;
    this.turn = 0;
    this.initialize_tanks();
}
}  
​private void initialize_tanks(){
    initialize_human_tank();
    initialize_computer_tank();
}
    
​private void initialize_human_tank() {
    System.out.println("Hello Human, enter your name");
    String name = scan.nextLine();
    this.human = new Human_Tank(name, scan);
    System.out.println("welcome," + this.human.getname());
}
    
​public void play_game(){
    this.initialize_game();
    while(!this.game_over){
        this.take_turns();
    }
}
    
​private void initialize_computer_tank(){
    String name = "Otto";
    this.computer = new Computer_Tank(name);
    System.out.prinln("welcome" + this.computer.getName());
}
    
​private void take_turns() {
    if(this.turn%2==0){
        this.take_human_turn(human);
    }else {
        this.take_computer_turn(computer);
    }
    this.turn++;
}
    
​private void take_human_turn(){
    double shot = human.fire();
    check_win(shot, human.getName());
}
private void take_a_turn(Tank t) {
    double shot = t.fire();
    check_win(shot,t.getName());
}    
​private void take_computer_turn(){
    double shot = computer.fire();
    check_win(shot, computer.getName());
}
    
​private void check_win(double shot, String name){
    //the shot is the distance the shot went
    //range is how close the shot has to be to win

    double difference = Math.abs(this.distance-shot);//gives the absolute value of the difference
    if(difference<=this.range){
        System.out.println(name + "won the game");
        this.game_over = true;
    }else {
        System.out.println(name+'missed');
    }
}
        
}

