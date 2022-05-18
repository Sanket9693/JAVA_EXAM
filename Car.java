class Car{
	private int year;
	private String make;
	private double speed;
	
	public Car(int year,String make,double beginning_speed){
		this.year=year;
		this.make=make;
		this.speed=beginning_speed;
	}
	
	public int getYear(){
		return this.year;
	}
	public String getMake(){
		return this.make;
	}
	public double getSpeed(){
		return this.speed;
	}
	public void accelerate(){
		this.speed++;
	}

}