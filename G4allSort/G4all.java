
package g4allsort;

/**
 * Class that implements a single hit as a struct
 * It has a special method to enable comparing two objects
 * It is useful when sorting a list
 * @author fabio
 */
public class G4all implements Comparable<G4all>{
    
    private String contig; // The name of the contig queried
    private String genome; // The name of the source genome
    private int length; // The length of the alignment
    private int wrong_identities;
    private int gaps; // Number of gaps in the alignment
    private int query_start; // Start position of the alignment in the query
    private int query_end; // End position of the alignment in the query
    private int subject_start; // Start position of the alignment in the subject
    private int subject_end; // End position of the alignment in the subject
    private String e_value; // E-value of the alignment
    private String score_bits;
    private String identities;
    
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
    public void setWrongIdentities(int wrong_identities) {
        this.wrong_identities = wrong_identities;
    }
    
    /**
     * Returns the number of wrong identities
     * @return the number of wrong identities
     */
    public int getWrongIdentities() {
        return wrong_identities;
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
    
    public void setSubjectStart(int subject_start) {
        this.subject_start = subject_start;
    }
    
    public int getSubjectStart() {
        return subject_start;
    }
    
    public void setSubjectEnd(int subject_end) {
        this.subject_end = subject_end;
    }
    
    public int getSubjectEnd() {
        return subject_end;
    }
    
    public void setEValue(String e_value) {
        this.e_value = e_value;
    }
    
    public String getEValue() {
        return e_value;
    }
    
    public void setScoreBits(String score_bits) {
        this.score_bits = score_bits;
    }
    
    public String getScoreBits() {
        return score_bits;
    }
    
    public void setIdentities(String identities) {
        this.identities = identities;
    }
    
    public String getIdentities() {
        return identities;
    }
    
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
