/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.pojo;

/**
 *
 * @author HP
 */
public class DoctorPojo {

    public DoctorPojo(String DoctorName, String DoctorId, String EmailId, String ContactNo, String Qualification, String Gender, String Specialist) {
        this.DoctorName = DoctorName;
        this.DoctorId = DoctorId;
        this.EmailId = EmailId;
        this.ContactNo = ContactNo;
        this.Qualification = Qualification;
        this.Gender = Gender;
        this.Specialist = Specialist;
    }
    public DoctorPojo()
    {
        
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String DoctorId) {
        this.DoctorId = DoctorId;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String Specialist) {
        this.Specialist = Specialist;
    }
    private String DoctorName;
    private String DoctorId;
    private String EmailId;
    private String ContactNo;
    private String Qualification;
    private String Gender;
    private String Specialist;
    
    
}
