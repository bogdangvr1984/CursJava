package curs2;

public class MethodExample {

	public static void main(String[] args) {
		
		int lenght = 4;
		int width = 2;
		int roomArea = lenght * width;
		System.out.println("Aria camerei este :" + roomArea);
		
		int lenght2 = 3;
		int width2 = 5;
		int roomArea2 = lenght2 * width2;
		System.out.println("Aria camerei 2 este :" + roomArea2);

		MethodExample room = new MethodExample();
		
		int hol = room.calculateArea(3, 6);
		System.out.println(hol);
		int bucatarie = room.calculateArea(5, 5);
		System.out.println(bucatarie);
		
		System.out.println("==========================");
		
		System.out.println(" Nr total :" + calculeazaNrTotalMp(hol, bucatarie, 12,10, 8));
	}
	
	public int calculateArea(int lenght, int width) {
		return lenght * width;
	}

	/*public static int calculeazaNrTotalMp(int room, int room2) {
		
		return room + room2;
	}*/
	public static int calculeazaNrTotalMp(int...rooms) {
		
		int result = 0;
		
		for(int room : rooms) {
			result = result + room;
		}
		
		
		return result;
		
		
	}
}
