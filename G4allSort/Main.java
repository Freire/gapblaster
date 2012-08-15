
package g4allsort;

/**
 * This is the main class of the program
 * It just opens a file with alignments, sorts the alignments and saves the results
 * @author fabio
 */
public class Main {
    
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
    
}
