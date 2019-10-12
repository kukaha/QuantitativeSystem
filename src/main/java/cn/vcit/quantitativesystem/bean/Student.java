package cn.vcit.quantitativesystem.bean;

import java.io.Serializable;

public class Student implements Serializable {
    private String studentId;

    private String studentName;

    private String studentSex;

    private String studentNation;

    private String studentDept;

    private String studentGrade;

    private String studentMagor;

    private String studentPoliticsStatus;

    private static final long serialVersionUID = 1L;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

    public String getStudentNation() {
        return studentNation;
    }

    public void setStudentNation(String studentNation) {
        this.studentNation = studentNation == null ? null : studentNation.trim();
    }

    public String getStudentDept() {
        return studentDept;
    }

    public void setStudentDept(String studentDept) {
        this.studentDept = studentDept == null ? null : studentDept.trim();
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade == null ? null : studentGrade.trim();
    }

    public String getStudentMagor() {
        return studentMagor;
    }

    public void setStudentMagor(String studentMagor) {
        this.studentMagor = studentMagor == null ? null : studentMagor.trim();
    }

    public String getStudentPoliticsStatus() {
        return studentPoliticsStatus;
    }

    public void setStudentPoliticsStatus(String studentPoliticsStatus) {
        this.studentPoliticsStatus = studentPoliticsStatus == null ? null : studentPoliticsStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", studentId=").append(studentId);
        sb.append(", studentName=").append(studentName);
        sb.append(", studentSex=").append(studentSex);
        sb.append(", studentNation=").append(studentNation);
        sb.append(", studentDept=").append(studentDept);
        sb.append(", studentGrade=").append(studentGrade);
        sb.append(", studentMagor=").append(studentMagor);
        sb.append(", studentPoliticsStatus=").append(studentPoliticsStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Student other = (Student) that;
        return (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getStudentName() == null ? other.getStudentName() == null : this.getStudentName().equals(other.getStudentName()))
            && (this.getStudentSex() == null ? other.getStudentSex() == null : this.getStudentSex().equals(other.getStudentSex()))
            && (this.getStudentNation() == null ? other.getStudentNation() == null : this.getStudentNation().equals(other.getStudentNation()))
            && (this.getStudentDept() == null ? other.getStudentDept() == null : this.getStudentDept().equals(other.getStudentDept()))
            && (this.getStudentGrade() == null ? other.getStudentGrade() == null : this.getStudentGrade().equals(other.getStudentGrade()))
            && (this.getStudentMagor() == null ? other.getStudentMagor() == null : this.getStudentMagor().equals(other.getStudentMagor()))
            && (this.getStudentPoliticsStatus() == null ? other.getStudentPoliticsStatus() == null : this.getStudentPoliticsStatus().equals(other.getStudentPoliticsStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getStudentName() == null) ? 0 : getStudentName().hashCode());
        result = prime * result + ((getStudentSex() == null) ? 0 : getStudentSex().hashCode());
        result = prime * result + ((getStudentNation() == null) ? 0 : getStudentNation().hashCode());
        result = prime * result + ((getStudentDept() == null) ? 0 : getStudentDept().hashCode());
        result = prime * result + ((getStudentGrade() == null) ? 0 : getStudentGrade().hashCode());
        result = prime * result + ((getStudentMagor() == null) ? 0 : getStudentMagor().hashCode());
        result = prime * result + ((getStudentPoliticsStatus() == null) ? 0 : getStudentPoliticsStatus().hashCode());
        return result;
    }
}