
package gapblaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class contains the methods to load and get parts of the reference
 * @author fabio
 */
public class Reference {
    
    private Scanner input; // This object will read the source file
    protected ArrayList sequence; // The sequence is represented as an array, because string is too slow
    protected String head; // The head/name of the reference
    
    /**
     * Initializes the arraylist that will hold the sequence
     */
    Reference() {
        sequence = new ArrayList();
    }
    
    /**
     * Gets a whole line from the file and parses the bases to be added
     * @param bases the bases to be added
     */
    private void add(String bases) {
        for(int i = 0; i < bases.length(); i++) {
            sequence.add(bases.charAt(i));
        }
    }
    
    /**
     * Loads a reference from a source file in fasta format
     * @param source the name of the source file
     */
    public void load(String source) {
        try {
            input = new Scanner(new File(source));
            if(input.hasNext()) {
                head = input.next();
            }
            while(input.hasNext()) {
                add(input.next());
            }
            input.close();
        } catch(FileNotFoundException exception) {
            System.err.println(exception.getMessage());
        }
    }    
 
    /**
     * Prints all reference's bases
     * This method is just for debugging purposes
     */
    public void print() {
        int bases = 0;
        System.out.println(head);
        for(int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i));
            bases++;
            if(bases == 60) {
                bases = 0;
                System.out.println();
            }
        }
        System.out.println();
    }
    
}
