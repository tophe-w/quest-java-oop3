public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

@Override

public void takeOff(){
            if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println( this.getName() + " takes off in the sky.");
        }
        
}
@Override

public int ascend(int meters){
    if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf(this.getName() + " flies upward, altitude: %d%n", this.altitude);

        }
        return this.altitude;
    }
    


    
@Override

public int descend(int meters){
    if (this.flying){
        this.altitude = Math.max(this.altitude - meters, 0);
        System.out.printf(this.getName() + " flies downward, altitude: %d%n", this.altitude);
    }
    return this.altitude;

}
@Override

public void glide(){
    System.out.println("glides into the air.");

}
@Override
public void land(){
    if (this.flying && this.altitude == 1){
        System.out.printf(this.getName() + " lands on the ground.%n");
    } else{
        System.out.printf(this.getName() + " is too high, it can't land.%n");
    }
}

}
