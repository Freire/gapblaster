
package g4allsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class G4allReader {
    
    private Scanner input;
    private G4all alignment_result;
    
    void open(String input) {
        try {
            this.input = new Scanner(new File(input));
        } catch(FileNotFoundException error) {
            System.err.println(error.getMessage());
        }
    }
    
    void close() {
        input.close();
    }
    
    boolean hasNext() {
        return input.hasNext();
    }
    
    G4all getNext() {
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
