package com.company;

import java.util.ArrayList;

public interface ResumeDAO {

    void insert(Resume resume);

    ArrayList<Resume> getAll();
}
