// default package
// Generated Mar 21, 2018 3:33:43 PM by Hibernate Tools 5.2.8.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ClsParts generated by hbm2java
 */
public class ClsParts  implements java.io.Serializable {


     private int partId;
     private short partNumber;
     private String regulatoryEntity;
     private String partTitle;
     private Date modificationDatetime;
     private Set clsClauseses = new HashSet(0);
     private Set clsPrescriptionses = new HashSet(0);

    public ClsParts() {
    }

	
    public ClsParts(int partId, short partNumber, String regulatoryEntity, String partTitle, Date modificationDatetime) {
        this.partId = partId;
        this.partNumber = partNumber;
        this.regulatoryEntity = regulatoryEntity;
        this.partTitle = partTitle;
        this.modificationDatetime = modificationDatetime;
    }
    public ClsParts(int partId, short partNumber, String regulatoryEntity, String partTitle, Date modificationDatetime, Set clsClauseses, Set clsPrescriptionses) {
       this.partId = partId;
       this.partNumber = partNumber;
       this.regulatoryEntity = regulatoryEntity;
       this.partTitle = partTitle;
       this.modificationDatetime = modificationDatetime;
       this.clsClauseses = clsClauseses;
       this.clsPrescriptionses = clsPrescriptionses;
    }
   
    public int getPartId() {
        return this.partId;
    }
    
    public void setPartId(int partId) {
        this.partId = partId;
    }
    public short getPartNumber() {
        return this.partNumber;
    }
    
    public void setPartNumber(short partNumber) {
        this.partNumber = partNumber;
    }
    public String getRegulatoryEntity() {
        return this.regulatoryEntity;
    }
    
    public void setRegulatoryEntity(String regulatoryEntity) {
        this.regulatoryEntity = regulatoryEntity;
    }
    public String getPartTitle() {
        return this.partTitle;
    }
    
    public void setPartTitle(String partTitle) {
        this.partTitle = partTitle;
    }
    public Date getModificationDatetime() {
        return this.modificationDatetime;
    }
    
    public void setModificationDatetime(Date modificationDatetime) {
        this.modificationDatetime = modificationDatetime;
    }
    public Set getClsClauseses() {
        return this.clsClauseses;
    }
    
    public void setClsClauseses(Set clsClauseses) {
        this.clsClauseses = clsClauseses;
    }
    public Set getClsPrescriptionses() {
        return this.clsPrescriptionses;
    }
    
    public void setClsPrescriptionses(Set clsPrescriptionses) {
        this.clsPrescriptionses = clsPrescriptionses;
    }




}


