
package g4allsort;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class G4allWriter {
    
    private FileWriter file;
    private BufferedWriter output;
    
    public void open(String output) {
        try {
            file = new FileWriter(output);
            this.output = new BufferedWriter(file);
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    
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
    
    public void close() {
        try {
            output.close();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        }
    }
    
}
