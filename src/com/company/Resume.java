package com.company;

public class Resume {

    private String name;
    private String email;
    private int phoneNumber;
    private String degree;
    private String nameOfUniversity;
    private int year;
    private String designation;
    private String company;
    private String title;
    private String description;
    private String skills;
    private String proficiency;


    public Resume() {
    }

    public Resume(String name, String email, int phoneNumber, String degree, String nameOfUniversity, int year, String designation, String company, String title, String description, String skills, String proficiency) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.degree = degree;
        this.nameOfUniversity = nameOfUniversity;
        this.year = year;
        this.designation = designation;
        this.company = company;
        this.title = title;
        this.description = description;
        this.skills = skills;
        this.proficiency = proficiency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", degree='" + degree + '\'' +
                ", nameOfUniversity='" + nameOfUniversity + '\'' +
                ", year=" + year +
                ", designation='" + designation + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", skills='" + skills + '\'' +
                ", proficiency='" + proficiency + '\'' +
                '}';
    }
}


