package com.ngc.CLQA.entities;
// Generated Mar 20, 2018 10:08:45 AM by Hibernate Tools 5.2.8.Final

/**
 * QauiConditionsId generated by hbm2java
 */
public class QauiConditionsId implements java.io.Serializable {

	private String conditionDbid;
	private String conditionText;
	private String documentId;
	private String isAnswerOrQuestion;
	private String referenceDbid;

	public QauiConditionsId() {
	}

	public QauiConditionsId(String conditionDbid, String conditionText, String documentId, String isAnswerOrQuestion,
			String referenceDbid) {
		this.conditionDbid = conditionDbid;
		this.conditionText = conditionText;
		this.documentId = documentId;
		this.isAnswerOrQuestion = isAnswerOrQuestion;
		this.referenceDbid = referenceDbid;
	}

	public String getConditionDbid() {
		return this.conditionDbid;
	}

	public void setConditionDbid(String conditionDbid) {
		this.conditionDbid = conditionDbid;
	}

	public String getConditionText() {
		return this.conditionText;
	}

	public void setConditionText(String conditionText) {
		this.conditionText = conditionText;
	}

	public String getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getIsAnswerOrQuestion() {
		return this.isAnswerOrQuestion;
	}

	public void setIsAnswerOrQuestion(String isAnswerOrQuestion) {
		this.isAnswerOrQuestion = isAnswerOrQuestion;
	}

	public String getReferenceDbid() {
		return this.referenceDbid;
	}

	public void setReferenceDbid(String referenceDbid) {
		this.referenceDbid = referenceDbid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QauiConditionsId))
			return false;
		QauiConditionsId castOther = (QauiConditionsId) other;

		return ((this.getConditionDbid() == castOther.getConditionDbid())
				|| (this.getConditionDbid() != null && castOther.getConditionDbid() != null
						&& this.getConditionDbid().equals(castOther.getConditionDbid())))
				&& ((this.getConditionText() == castOther.getConditionText())
						|| (this.getConditionText() != null && castOther.getConditionText() != null
								&& this.getConditionText().equals(castOther.getConditionText())))
				&& ((this.getDocumentId() == castOther.getDocumentId()) || (this.getDocumentId() != null
						&& castOther.getDocumentId() != null && this.getDocumentId().equals(castOther.getDocumentId())))
				&& ((this.getIsAnswerOrQuestion() == castOther.getIsAnswerOrQuestion())
						|| (this.getIsAnswerOrQuestion() != null && castOther.getIsAnswerOrQuestion() != null
								&& this.getIsAnswerOrQuestion().equals(castOther.getIsAnswerOrQuestion())))
				&& ((this.getReferenceDbid() == castOther.getReferenceDbid())
						|| (this.getReferenceDbid() != null && castOther.getReferenceDbid() != null
								&& this.getReferenceDbid().equals(castOther.getReferenceDbid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getConditionDbid() == null ? 0 : this.getConditionDbid().hashCode());
		result = 37 * result + (getConditionText() == null ? 0 : this.getConditionText().hashCode());
		result = 37 * result + (getDocumentId() == null ? 0 : this.getDocumentId().hashCode());
		result = 37 * result + (getIsAnswerOrQuestion() == null ? 0 : this.getIsAnswerOrQuestion().hashCode());
		result = 37 * result + (getReferenceDbid() == null ? 0 : this.getReferenceDbid().hashCode());
		return result;
	}

}
