package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ResumeView rv = new ResumeView(new Scanner(System.in), new ResumeDAOImpl());

        while (true) {

            rv.controller();

        }
    }
}