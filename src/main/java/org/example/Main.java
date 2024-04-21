package org.example;

import beans.Student;
import jdk.jshell.execution.Util;
import util.InputUtil;
import util.StudentUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int menu=InputUtil.requireNumber("What do you want to do? "
                +"\n1 Register Student"
                +"\n2 Show all student"
                +"\n3 Find student"
                +"\n4 Update student");
        if(menu==1) {
            StudentUtil.registerStudents();
        }else if (menu==2){
            StudentUtil.printAllRegisteredStudent();

        } else if (menu==3) {

            }
        }


    }

