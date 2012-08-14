
package g4allsort;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * This class opens a file and can write G4all objects to it
 * without much effort.
 * After all has been written then the file needs to be closed
 * so changes can be saved
 * @author fabio
 */
public class G4allWriter {
    
    private FileWriter file; // File that will be written
    private BufferedWriter output; // Object that manipulates the output file
    
    /**
     * Opens a file to write alignment results
     * If the file already exists then it will be overwritten
     * @param output the name of the file to be written
     */
    public void open(String output) {
        try {
            file = new FileWriter(output);
            this.output = new BufferedWriter(file);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    
    /**
     * Writes an alignment result to an opened file
     * @param alignment_result the alignment to be written
     */
    public void write(G4all alignment_result) {
        try {
            output.write(alignment_result.getContig() + "\t");
            output.write(alignment_result.getGenome() + "\t");
            output.write(alignment_result.getLength() + "\t");
            output.write(alignment_result.getWrongIdentities() + "\t");
            output.write(alignment_result.getGaps() + "\t");
            output.write(alignment_result.getQueryStart() + "\t");
            output.write(alignment_result.getQueryEnd() + "\t");
            output.write(alignment_result.getSubjectStart() + "\t");
            output.write(alignment_result.getSubjectEnd() + "\t");
            output.write(alignment_result.getEValue() + "\t");
            output.write(alignment_result.getScoreBits() + "\t");
            output.write(alignment_result.getIdentities() + "\n");
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    
    /**
     * Closes the file after all has been written
     * If this method isn't called then any changes won't be saved
     */
    public void close() {
        try {
            output.close();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    
}
