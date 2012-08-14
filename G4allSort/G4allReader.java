
package g4allsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Does all the reading of a .G4all file
 * Returns a G4all object for each alignment result
 * @author fabio
 */
public class G4allReader {
    
    private Scanner input; // Object that will read the input file
    private G4all alignment_result; // Single alignment hit
    
    /**
     * This method just opens the input file for reading purposes
     * @param input the name of the file to read
     */
    public void open(String input) {
        try {
            this.input = new Scanner(new File(input));
        } catch(FileNotFoundException error) {
            System.err.println(error.getMessage());
        }
    }
    
    /**
     * This method closes the file after all reading has been done
     */
    public void close() {
        input.close();
    }
    
    /**
     * This method checks whether a file still has lines to read
     * @return true if file still has something to read
     */
    public boolean hasNext() {
        return input.hasNext();
    }
    
    /**
     * This method is used to get the next alignment result from a file
     * @return next alignment result
     */
    public G4all getNext() {
        if(input.hasNext()) {
            alignment_result = new G4all();
            alignment_result.setContig(input.next());
            alignment_result.setGenome(input.next());
            alignment_result.setLength(input.nextInt());
            alignment_result.setWrongIdentities(input.nextInt());
            alignment_result.setGaps(input.nextInt());
            alignment_result.setQueryStart(input.nextInt());
            alignment_result.setQueryEnd(input.nextInt());
            alignment_result.setSubjectStart(input.nextInt());
            alignment_result.setSubjectEnd(input.nextInt());
            alignment_result.setEValue(input.next());
            alignment_result.setScoreBits(input.next());
            alignment_result.setIdentities(input.next());
        }
        return alignment_result;
    }
    
}
