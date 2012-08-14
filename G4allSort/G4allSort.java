
package g4allsort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

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
     * This subroutine starts the program using an G4allSort object
     * But first it checks if the parameters are OK
     * If they aren't then it just prints a message and quit
     * @param args the parameters received from command line
     */
    public static void main(String[] args) {
        if(args.length == 2) {
            G4allSort program = new G4allSort();
            program.load(args[0]);
            program.sort();
            program.save(args[1]);
        } else {
            System.out.println("\nUsage: g4allsort [INPUT] [OUTPUT]\n");
        }
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
