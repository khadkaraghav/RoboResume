package com.company;

import java.util.Scanner;

public class ResumeView {


    private Scanner keyboard;
    private ResumeDAO resumeDAO;

    public ResumeView(Scanner keyboard, ResumeDAO resumeDAO) {

        this.keyboard = keyboard;
        this.resumeDAO = resumeDAO;
    }


    public void add() {

        while (true) {

            System.out.println("Building your resume.........");

            Resume resume = new Resume();

            keyboard.nextLine();

            System.out.println("Enter your name");
            resume.setName(keyboard.nextLine());

            System.out.println("Enter your email address");
            resume.setEmail(keyboard.nextLine());

            System.out.println("Enter your phone number");
            resume.setPhoneNumber(keyboard.nextInt());

            /*keyboard.nextLine();

            System.out.println("Enter your degree");
            resume.setDegree(keyboard.nextLine());

            System.out.println("Enter the name of your University");
            resume.setNameOfUniversity(keyboard.nextLine());

            System.out.println("Enter your year of Graduation");
            resume.setYear(keyboard.nextInt());

            keyboard.nextLine();

            System.out.println("Enter your designation");
            resume.setDesignation(keyboard.nextLine());

            System.out.println("Enter the name of your company");
            resume.setCompany(keyboard.nextLine());

            System.out.println("Enter your title");
            resume.setTitle(keyboard.nextLine());

            System.out.println("Enter the description");
            resume.setDescription(keyboard.nextLine());

            System.out.println("Enter your skills");
            resume.setSkills(keyboard.nextLine());

            System.out.println("Enter your proficiency");
            resume.setProficiency(keyboard.nextLine());*/


            resumeDAO.insert(resume);
         //   System.out.println("Do you want to add more books ? (Y/N)");

         //  if (keyboard.next().equalsIgnoreCase("n")) {

          //  }

           showAll();

        }
    }

    public void showAll(){

        Resume resume = new Resume();

        System.out.println("HERE'S YOUR RESUME");

        //resumeDAO.getAll();

        System.out.println(resume.getName().toString());
        //resumeDAO.getAll().forEach(s ->

        //{
         //   System.out.println(s.toString());
       // });
    }

    public void exit() {

        System.out.println("Do you really want to exit (Y/N)");

        if (keyboard.next().equalsIgnoreCase("y")) {
            System.exit(0);

        }
    }

    public void controller() {

        menu();

        switch (keyboard.nextInt()) {

            case 1:
                add();
                break;


            case 2:
                showAll();
                break;

            case 3:
                exit();
                break;

                default:
                    System.out.println("Invalid Choice");
                    break;
        }
    }


    public static void menu() {

        System.out.println("==================================");
        System.out.println("Welcome to Robo Resume");
        System.out.println("===================================");

        System.out.println("1. Add Your Informations");
        System.out.println("2. Show the resume");
        System.out.println("3. Exit");
        System.out.println("Enter your choice [1-3]");
    }
}



