
package g4allsort;

/**
 * Class that implements a single hit as a struct
 * It has a special method to enable comparing two objects
 * It is useful when sorting a list
 * @author fabio
 */
public class G4all implements Comparable<G4all>{
    
    private String contig; // The name of the contig queried
    private String genome; // The name of the reference genome
    private int length; // The length of the alignment
    private int mismatches; // The number of mismatches
    private int gaps; // Number of gaps in the alignment (conting both query and subject)
    private int query_start; // Start position of the alignment in the query
    private int query_end; // End position of the alignment in the query
    private int source_start; // Start position of the alignment in the reference genome
    private int source_end; // End position of the alignment in the reference genome
    private String e_value; // E-value of the alignment
    private String score_bits; // The value of score bits
    private String identities; // The number of identities
    
    /**
     * Sets the name of the contig
     * @param contig the name of the contig to be set
     */
    public void setContig(String contig) {
        this.contig = contig;
    }
    
    /**
     * Returns the name of the contig
     * @return the name of the contig
     */
    public String getContig() {
        return contig;
    }
    
    /**
     * Sets the name of the genome
     * @param genome the name of the genome
     */
    public void setGenome(String genome) {
        this.genome = genome;
    }
    
    /**
     * Returns the name of the genome
     * @return the name of the genome
     */
    public String getGenome() {
        return genome;
    }
    
    /**
     * Sets the length of the alignment
     * @param length the length of the alignment
     */
    public void setLength(int length) {
        this.length = length;
    }
    
    /**
     * Returns the length of the alignment
     * @return the length of the alignment
     */
    public int getLength() {
        return length;
    }
    
    /**
     * Sets the length of the alignments
     * @param wrong_identities 
     */
    public void setMismatches(int mismatches) {
        this.mismatches = mismatches;
    }
    
    /**
     * Returns the number of wrong identities
     * @return the number of wrong identities
     */
    public int getMismatches() {
        return mismatches;
    }
    
    /**
     * Sets the number of gaps in the alignment
     * @param gaps the number of gaps in the alignment
     */
    public void setGaps(int gaps) {
        this.gaps = gaps;
    }
    
    /**
     * Returns the number of gaps in the alignment
     * @return the number of gaps in the alignment
     */
    public int getGaps() {
        return gaps;
    }
    
    /**
     * Sets the query start position that was aligned
     * @param query_start the query start position that was aligned
     */
    public void setQueryStart(int query_start) {
        this.query_start = query_start;
    }
    
    /**
     * Returns the query start position that was aligned
     * @return the query start position that was aligned
     */
    public int getQueryStart() {
        return query_start;
    }
    
    /**
     * Sets the query end position that was aligned
     * @param query_end the query end position that was aligned
     */
    public void setQueryEnd(int query_end) {
        this.query_end = query_end;
    }
    
    /**
     * Returns the query end position that was aligned
     * @return the query end position that was aligned
     */
    public int getQueryEnd() {
        return query_end;
    }
    
    /**
     * Sets the subject start position that was aligned
     * @param subject_start the subject start position that was aligned
     */
    public void setSourceStart(int source_start) {
        this.source_start = source_start;
    }
    
    /**
     * Returns the subject start position that was aligned
     * @return the subject start position that was aligned
     */
    public int getSourceStart() {
        return source_start;
    }
    
    /**
     * Sets the subject end position that was aligned
     * @param subject_end the subject end position that was aligned
     */
    public void setSourceEnd(int source_end) {
        this.source_end = source_end;
    }
    
    /**
     * Returns the subject end position that was aligned
     * @return the subject end position that was aligned
     */
    public int getSourceEnd() {
        return source_end;
    }
    
    /**
     * Sets the e-value of the alignment
     * @param e_value the e-value of the alignment
     */
    public void setEValue(String e_value) {
        this.e_value = e_value;
    }
    
    /**
     * Returns the e-value of the alignment
     * @return the e-value of the alignment
     */
    public String getEValue() {
        return e_value;
    }
    
    /**
     * Sets the score bits of the alignment
     * @param score_bits the score bits of the alignment
     */
    public void setScoreBits(String score_bits) {
        this.score_bits = score_bits;
    }
    
    /**
     * Returns the score bits of the alignment
     * @return the score bits of the alignment
     */
    public String getScoreBits() {
        return score_bits;
    }
    
    /**
     * Sets the number of identities of the alignment
     * @param identities the number of identities of the alignment
     */
    public void setIdentities(String identities) {
        this.identities = identities;
    }
    
    /**
     * Returns the number of identities of the alignment
     * @return the number of identities of the alignment
     */
    public String getIdentities() {
        return identities;
    }
    
    /**
     * Compares two alignments
     * It is useful to help sort a list of this object using Collections.sort
     * @param alignment_result the alignment result to be compared
     * @return -1 if the subject start is smaller, 1 if it is bigger or 0 if both are equal
     */
    @Override
    public int compareTo(G4all alignment_result) {
        if(subject_start < alignment_result.subject_start) {
            return -1;
        } else {
            if(subject_start > alignment_result.subject_start) {
                return 1;
            } else {
                return 0;
            }
        }
    }
    
}
