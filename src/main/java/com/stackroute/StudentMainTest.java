package com.stackroute;


import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;



public class StudentMainTest {





    public static void main(String[] args) {



        List<Student> list = new ArrayList<Student>();



        Student student1 = new Student();

        student1.setId(1);

        student1.setAge(26);

        student1.setName("anil");



        Student student2 = new Student();

        student2.setAge(22);

        student2.setId(2);

        student2.setName("leela");



        Student student3 = new Student();

        student3.setId(3);

        student3.setAge(24);

        student3.setName("adi");





        Student student4 = new Student();

        student4.setId(4);

        student4.setAge(23);

        student4.setName("sai");





        list.add(student1);

        list.add(student2);

        list.add(student3);

        list.add(student4);

        System.out.println(list);

        System.out.println(".......Before........");

        for(Student s : list)

        {

            System.out.println(s);

        }

        System.out.println(".......After........");

        List<Student> sortlist = new StudentMainTest().sort(list);

        for(Student s1 : list)

        {

            System.out.println(s1);

        }





    }

    public List<Student> sort(List<Student> list)

    {

        Comparator com = new StudentSorted();

        Collections.sort(list,com);

        Collections.reverse(list);

        List<Student> newlist = new ArrayList<Student>();

        for(Student student : newlist)

        {

            newlist.add(student);



        }

        return newlist;

    }



}
