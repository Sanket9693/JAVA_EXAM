class RaceTrack{
		
		public static void main(String args[]){
			Car c=new Car(2010,"Porsche",25.0);
			System.out.println("Car's Year Model"+" "+c.getYear());
			System.out.println("Make of the Car"+" "+c.getMake());
			System.out.println("Car's Current Speed"+" "+c.getSpeed());

			c.accelerate();
			System.out.println("Modified Speed"+" "+c.getSpeed());
			
		}
}