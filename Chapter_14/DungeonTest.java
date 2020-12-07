import java.io.*;

class DungeonTest{
	public static void main(String[] args) {
		DungeonGame d = new DungeonGame();
		System.out.println(d.getX() + d.getY() +d.getZ());
		try {
			FileOutputStream fos = new FileOutputStream("dg.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
			
			FileInputStream fis = new FileInputStream("dg.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (DungeonGame) ois.readObject();
			System.out.println(d.getX() + d.getY() +d.getZ());
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		class DungeonGame implements Serializable {
			public int x = 3;
			transient long y = 4;
			private short z = 5 ;
		
			int getX() {
				return x;
			}
		
			long getY() {
				return y;
			}
			
			short getZ() {
				return z;
			}
		
		}		
	}		
} 


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	