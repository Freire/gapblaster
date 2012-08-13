
package g4allsort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class G4allSort {
    
    private List list;
    private G4all alignment_result;
    private G4allReader input;
    private G4allWriter output;
    
    G4allSort() {
        list = new LinkedList();
        alignment_result = new G4all();
        input = new G4allReader();
        output = new G4allWriter();
    }

    public static void main(String[] args) {
        if(args.length == 2) {
            G4allSort program = new G4allSort();
            program.load(args[0]);
            program.sort();
            program.save(args[1]);
        } else {
            System.out.println("Usage: blastsort [INPUT] [OUTPUT]");
        }
    }
    
    public void load(String input) {        
        this.input.open(input);
        while(this.input.hasNext()) {
            alignment_result = this.input.getNext();
            list.add(alignment_result);
        }
        this.input.close();
    }
    
    public void sort() {
        Collections.sort(list);
    }
    
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
