package com.company;

import java.util.ArrayList;

public class ResumeDAOImpl implements ResumeDAO {

    private ArrayList<Resume> resumeList;

    public ResumeDAOImpl(){

        resumeList = new ArrayList<Resume>();
    }

    @Override
    public void insert(Resume resume) {
         resumeList.add(resume);
    }

    @Override
    public ArrayList<Resume> getAll() {
        return resumeList;
    }
}
