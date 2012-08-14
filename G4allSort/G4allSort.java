
package g4allsort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * This class is used to load a file with alignment results and sort it
 * by subject start.
 * Notice that if you load and save a file without sorting it
 * you will be just copying it
 * @author fabio
 */
public class G4allSort {
    
    private List list; // List with all hits
    private G4all alignment_result; // Single hit
    private G4allReader input; // Reads the input file
    private G4allWriter output; // Writes to output file
    
    /**
    * This constructor doesn't get any param nor does it return something
    * It just initializes the objects used
    */
    G4allSort() {
        list = new LinkedList();
        alignment_result = new G4all();
        input = new G4allReader();
        output = new G4allWriter();
    }
    
    /**
     * This method reads all the input file and add the alignments read to a list
     * @param input the name of the file to read the alignments
     */
    public void load(String input) {        
        this.input.open(input);
        while(this.input.hasNext()) {
            alignment_result = this.input.getNext();
            list.add(alignment_result);
        }
        this.input.close();
    }
    
    /**
     * This method sorts the alignments list by subject start
     */
    public void sort() {
        Collections.sort(list);
    }

    /**
     * This method writes down all the elements from the list to a file
     * @param output name of the file to write to
     */
    public void save(String output) {
        ListIterator<G4all> listiterator;
        this.output.open(output);
        listiterator = list.listIterator();
        while(listiterator.hasNext()) {
            this.output.write(listiterator.next());
        }
        this.output.close();
    }
    
}
