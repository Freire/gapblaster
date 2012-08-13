
package g4allsort;

public class G4all implements Comparable<G4all>{
    
    private String contig, genome;
    private int length;
    private int wrong_identities;
    private int gaps;
    private int query_start, query_end;
    private int subject_start, subject_end;
    private String e_value;
    private String score_bits;
    private String identities;
    
    void setContig(String contig) {
        this.contig = contig;
    }
    
    String getContig() {
        return contig;
    }
    
    void setGenome(String genome) {
        this.genome = genome;
    }
    
    String getGenome() {
        return genome;
    }
    
    void setLength(int length) {
        this.length = length;
    }
    
    int getLength() {
        return length;
    }
    
    void setWrongIdentities(int wrong_identities) {
        this.wrong_identities = wrong_identities;
    }
    
    int getWrongIdentities() {
        return wrong_identities;
    }
    
    void setGaps(int gaps) {
        this.gaps = gaps;
    }
    
    int getGaps() {
        return gaps;
    }
    
    void setQueryStart(int query_start) {
        this.query_start = query_start;
    }
    
    int getQueryStart() {
        return query_start;
    }
    
    void setQueryEnd(int query_end) {
        this.query_end = query_end;
    }
    
    int getQueryEnd() {
        return query_end;
    }
    
    void setSubjectStart(int subject_start) {
        this.subject_start = subject_start;
    }
    
    int getSubjectStart() {
        return subject_start;
    }
    
    void setSubjectEnd(int subject_end) {
        this.subject_end = subject_end;
    }
    
    int getSubjectEnd() {
        return subject_end;
    }
    
    void setEValue(String e_value) {
        this.e_value = e_value;
    }
    
    String getEValue() {
        return e_value;
    }
    
    void setScoreBits(String score_bits) {
        this.score_bits = score_bits;
    }
    
    String getScoreBits() {
        return score_bits;
    }
    
    void setIdentities(String identities) {
        this.identities = identities;
    }
    
    String getIdentities() {
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
