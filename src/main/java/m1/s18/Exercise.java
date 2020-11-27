package m1.s18;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        // 1. print all values in [0 .. 9], expected output:
        // 0 1 2 3 4 5 6 7 8 9
        // do it using a for and a while loop
    	System.out.println("Con il for:");
    	for (int i = 0; i < 10; i++) {
    		System.out.print(i + " ");
    	}
    	System.out.println(); //new line

    	System.out.println("Con il while:");
    	int x = 0;
    	while (x<10) {
    		System.out.print(x + " ");
    		x +=1;
    	}
    	System.out.println();

        // 2. given a boolean array, change the values
        boolean[] flags = { true, false, false };

        for (int i = 0; i < flags.length; i++) {
        	if (!flags[i]) {
        		flags[i] = true;
        	} else if (flags[i]) {
        		flags[i] = false;
        	}
        	// more elegant solution
        	// flags[i] = !flags[i];
        }


        System.out.println(Arrays.toString(flags));
    }
}
