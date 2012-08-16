
package gapblaster;

/**
 * The main class of the program that will parse command line arguments
 * @author fabio
 */
public class Main {
    
    /**
     * This method gets command line arguments and initializes the program if
     * everything is OK
     * @param args command line arguments
     */
    public static void main(String[] args) {
        GapBlaster program;
        String source, query, alignment_results;
        if(args.length == 3) {
            source = args[0];
            query = args[1];
            alignment_results = args[2];
            program = new GapBlaster();
            program.load(source, query, alignment_results);
        } else {
            System.out.println("\nUsage: gapbuster [SOURCE] [QUERY] [ALIGNMENT RESULTS]\n");
        }
    }
    
}
