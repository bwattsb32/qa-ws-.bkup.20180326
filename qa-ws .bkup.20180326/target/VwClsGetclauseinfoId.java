// default package
// Generated Mar 21, 2018 3:33:43 PM by Hibernate Tools 5.2.8.Final


import java.sql.Clob;

/**
 * VwClsGetclauseinfoId generated by hbm2java
 */
public class VwClsGetclauseinfoId  implements java.io.Serializable {


     private String clauseNumber;
     private char clauseIndicator;
     private String alternateStatus;
     private String deviationStatus;
     private String deviationStartDate;
     private String deviationEndDate;
     private String prescription;
     private String clauseFormat;
     private String clauseStatus;
     private String clauseTitle;
     private String clauseEffectiveDate;
     private String clauseEffectiveEndDate;
     private Clob clauseText;
     private Character section;
     private char editableIndicator;
     private Clob editableDetail;
     private String regulatoryEntity;

    public VwClsGetclauseinfoId() {
    }

	
    public VwClsGetclauseinfoId(String clauseNumber, char clauseIndicator, String clauseTitle, Clob clauseText, char editableIndicator) {
        this.clauseNumber = clauseNumber;
        this.clauseIndicator = clauseIndicator;
        this.clauseTitle = clauseTitle;
        this.clauseText = clauseText;
        this.editableIndicator = editableIndicator;
    }
    public VwClsGetclauseinfoId(String clauseNumber, char clauseIndicator, String alternateStatus, String deviationStatus, String deviationStartDate, String deviationEndDate, String prescription, String clauseFormat, String clauseStatus, String clauseTitle, String clauseEffectiveDate, String clauseEffectiveEndDate, Clob clauseText, Character section, char editableIndicator, Clob editableDetail, String regulatoryEntity) {
       this.clauseNumber = clauseNumber;
       this.clauseIndicator = clauseIndicator;
       this.alternateStatus = alternateStatus;
       this.deviationStatus = deviationStatus;
       this.deviationStartDate = deviationStartDate;
       this.deviationEndDate = deviationEndDate;
       this.prescription = prescription;
       this.clauseFormat = clauseFormat;
       this.clauseStatus = clauseStatus;
       this.clauseTitle = clauseTitle;
       this.clauseEffectiveDate = clauseEffectiveDate;
       this.clauseEffectiveEndDate = clauseEffectiveEndDate;
       this.clauseText = clauseText;
       this.section = section;
       this.editableIndicator = editableIndicator;
       this.editableDetail = editableDetail;
       this.regulatoryEntity = regulatoryEntity;
    }
   
    public String getClauseNumber() {
        return this.clauseNumber;
    }
    
    public void setClauseNumber(String clauseNumber) {
        this.clauseNumber = clauseNumber;
    }
    public char getClauseIndicator() {
        return this.clauseIndicator;
    }
    
    public void setClauseIndicator(char clauseIndicator) {
        this.clauseIndicator = clauseIndicator;
    }
    public String getAlternateStatus() {
        return this.alternateStatus;
    }
    
    public void setAlternateStatus(String alternateStatus) {
        this.alternateStatus = alternateStatus;
    }
    public String getDeviationStatus() {
        return this.deviationStatus;
    }
    
    public void setDeviationStatus(String deviationStatus) {
        this.deviationStatus = deviationStatus;
    }
    public String getDeviationStartDate() {
        return this.deviationStartDate;
    }
    
    public void setDeviationStartDate(String deviationStartDate) {
        this.deviationStartDate = deviationStartDate;
    }
    public String getDeviationEndDate() {
        return this.deviationEndDate;
    }
    
    public void setDeviationEndDate(String deviationEndDate) {
        this.deviationEndDate = deviationEndDate;
    }
    public String getPrescription() {
        return this.prescription;
    }
    
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    public String getClauseFormat() {
        return this.clauseFormat;
    }
    
    public void setClauseFormat(String clauseFormat) {
        this.clauseFormat = clauseFormat;
    }
    public String getClauseStatus() {
        return this.clauseStatus;
    }
    
    public void setClauseStatus(String clauseStatus) {
        this.clauseStatus = clauseStatus;
    }
    public String getClauseTitle() {
        return this.clauseTitle;
    }
    
    public void setClauseTitle(String clauseTitle) {
        this.clauseTitle = clauseTitle;
    }
    public String getClauseEffectiveDate() {
        return this.clauseEffectiveDate;
    }
    
    public void setClauseEffectiveDate(String clauseEffectiveDate) {
        this.clauseEffectiveDate = clauseEffectiveDate;
    }
    public String getClauseEffectiveEndDate() {
        return this.clauseEffectiveEndDate;
    }
    
    public void setClauseEffectiveEndDate(String clauseEffectiveEndDate) {
        this.clauseEffectiveEndDate = clauseEffectiveEndDate;
    }
    public Clob getClauseText() {
        return this.clauseText;
    }
    
    public void setClauseText(Clob clauseText) {
        this.clauseText = clauseText;
    }
    public Character getSection() {
        return this.section;
    }
    
    public void setSection(Character section) {
        this.section = section;
    }
    public char getEditableIndicator() {
        return this.editableIndicator;
    }
    
    public void setEditableIndicator(char editableIndicator) {
        this.editableIndicator = editableIndicator;
    }
    public Clob getEditableDetail() {
        return this.editableDetail;
    }
    
    public void setEditableDetail(Clob editableDetail) {
        this.editableDetail = editableDetail;
    }
    public String getRegulatoryEntity() {
        return this.regulatoryEntity;
    }
    
    public void setRegulatoryEntity(String regulatoryEntity) {
        this.regulatoryEntity = regulatoryEntity;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VwClsGetclauseinfoId) ) return false;
		 VwClsGetclauseinfoId castOther = ( VwClsGetclauseinfoId ) other; 
         
		 return ( (this.getClauseNumber()==castOther.getClauseNumber()) || ( this.getClauseNumber()!=null && castOther.getClauseNumber()!=null && this.getClauseNumber().equals(castOther.getClauseNumber()) ) )
 && (this.getClauseIndicator()==castOther.getClauseIndicator())
 && ( (this.getAlternateStatus()==castOther.getAlternateStatus()) || ( this.getAlternateStatus()!=null && castOther.getAlternateStatus()!=null && this.getAlternateStatus().equals(castOther.getAlternateStatus()) ) )
 && ( (this.getDeviationStatus()==castOther.getDeviationStatus()) || ( this.getDeviationStatus()!=null && castOther.getDeviationStatus()!=null && this.getDeviationStatus().equals(castOther.getDeviationStatus()) ) )
 && ( (this.getDeviationStartDate()==castOther.getDeviationStartDate()) || ( this.getDeviationStartDate()!=null && castOther.getDeviationStartDate()!=null && this.getDeviationStartDate().equals(castOther.getDeviationStartDate()) ) )
 && ( (this.getDeviationEndDate()==castOther.getDeviationEndDate()) || ( this.getDeviationEndDate()!=null && castOther.getDeviationEndDate()!=null && this.getDeviationEndDate().equals(castOther.getDeviationEndDate()) ) )
 && ( (this.getPrescription()==castOther.getPrescription()) || ( this.getPrescription()!=null && castOther.getPrescription()!=null && this.getPrescription().equals(castOther.getPrescription()) ) )
 && ( (this.getClauseFormat()==castOther.getClauseFormat()) || ( this.getClauseFormat()!=null && castOther.getClauseFormat()!=null && this.getClauseFormat().equals(castOther.getClauseFormat()) ) )
 && ( (this.getClauseStatus()==castOther.getClauseStatus()) || ( this.getClauseStatus()!=null && castOther.getClauseStatus()!=null && this.getClauseStatus().equals(castOther.getClauseStatus()) ) )
 && ( (this.getClauseTitle()==castOther.getClauseTitle()) || ( this.getClauseTitle()!=null && castOther.getClauseTitle()!=null && this.getClauseTitle().equals(castOther.getClauseTitle()) ) )
 && ( (this.getClauseEffectiveDate()==castOther.getClauseEffectiveDate()) || ( this.getClauseEffectiveDate()!=null && castOther.getClauseEffectiveDate()!=null && this.getClauseEffectiveDate().equals(castOther.getClauseEffectiveDate()) ) )
 && ( (this.getClauseEffectiveEndDate()==castOther.getClauseEffectiveEndDate()) || ( this.getClauseEffectiveEndDate()!=null && castOther.getClauseEffectiveEndDate()!=null && this.getClauseEffectiveEndDate().equals(castOther.getClauseEffectiveEndDate()) ) )
 && ( (this.getClauseText()==castOther.getClauseText()) || ( this.getClauseText()!=null && castOther.getClauseText()!=null && this.getClauseText().equals(castOther.getClauseText()) ) )
 && ( (this.getSection()==castOther.getSection()) || ( this.getSection()!=null && castOther.getSection()!=null && this.getSection().equals(castOther.getSection()) ) )
 && (this.getEditableIndicator()==castOther.getEditableIndicator())
 && ( (this.getEditableDetail()==castOther.getEditableDetail()) || ( this.getEditableDetail()!=null && castOther.getEditableDetail()!=null && this.getEditableDetail().equals(castOther.getEditableDetail()) ) )
 && ( (this.getRegulatoryEntity()==castOther.getRegulatoryEntity()) || ( this.getRegulatoryEntity()!=null && castOther.getRegulatoryEntity()!=null && this.getRegulatoryEntity().equals(castOther.getRegulatoryEntity()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getClauseNumber() == null ? 0 : this.getClauseNumber().hashCode() );
         result = 37 * result + this.getClauseIndicator();
         result = 37 * result + ( getAlternateStatus() == null ? 0 : this.getAlternateStatus().hashCode() );
         result = 37 * result + ( getDeviationStatus() == null ? 0 : this.getDeviationStatus().hashCode() );
         result = 37 * result + ( getDeviationStartDate() == null ? 0 : this.getDeviationStartDate().hashCode() );
         result = 37 * result + ( getDeviationEndDate() == null ? 0 : this.getDeviationEndDate().hashCode() );
         result = 37 * result + ( getPrescription() == null ? 0 : this.getPrescription().hashCode() );
         result = 37 * result + ( getClauseFormat() == null ? 0 : this.getClauseFormat().hashCode() );
         result = 37 * result + ( getClauseStatus() == null ? 0 : this.getClauseStatus().hashCode() );
         result = 37 * result + ( getClauseTitle() == null ? 0 : this.getClauseTitle().hashCode() );
         result = 37 * result + ( getClauseEffectiveDate() == null ? 0 : this.getClauseEffectiveDate().hashCode() );
         result = 37 * result + ( getClauseEffectiveEndDate() == null ? 0 : this.getClauseEffectiveEndDate().hashCode() );
         result = 37 * result + ( getClauseText() == null ? 0 : this.getClauseText().hashCode() );
         result = 37 * result + ( getSection() == null ? 0 : this.getSection().hashCode() );
         result = 37 * result + this.getEditableIndicator();
         result = 37 * result + ( getEditableDetail() == null ? 0 : this.getEditableDetail().hashCode() );
         result = 37 * result + ( getRegulatoryEntity() == null ? 0 : this.getRegulatoryEntity().hashCode() );
         return result;
   }   


}


