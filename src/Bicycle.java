public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int cadence,int gear,int startSpeed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = startSpeed;
    }

    public void setGear(int newValue) {
        this.gear = newValue;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public void incrementSpeed(int speed) {
        this.speed += speed;
    }

    public void applyBrake(int speed) {
        this.speed -= speed;
    }

    public int getGear() {
        return this.gear;
    }

    public int getCadence() {
        return this.cadence;
    }

    public int getSpeed() {
        return this.speed;
    }
}