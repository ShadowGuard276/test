package Bike;

public class MotorBike {
	private int speed;
public void setSpeed(int speed) {
	if(speed>0)
		this.speed = speed;
}
    int getspeed() {
	return this.speed;
                     }
public void increasespeed(int howmuch) {
	setSpeed(this.speed+howmuch);
	
}
public void decrasespeed(int howmuch) {
	setSpeed(this.speed-howmuch);
}
public void start() {
	System.out.println("Bike statred");
}
public void gearchange() {
	System.out.println("gear changed");
}
public void stop() {
	System.out.println("bike stoped");
}
}
