package curs5;

public class WhileExample {

	public static void main(String[] args) {

    int i = 10;
    
    while(i>0) {
    	
    	//i--;
    	System.out.println(i);
    	i--;
    }
    
    int j = 0;
    String[] array = {"one", "two", "three", "four"};
    while(j<array.length) {
    	System.out.println(array[j]);
    	j++;
    }

	}

}
