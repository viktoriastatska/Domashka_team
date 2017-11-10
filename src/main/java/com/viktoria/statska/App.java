package com.viktoria.statska;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws IOException 
    {
		ArrayList<Student> studentList = readFileToArrayList("testfile.txt");
		//sort
		Collections.sort(studentList, new Comparator<Student>() {
		    public int compare(Student o1, Student o2) {
//		        return o1.getAge().compareTo(o2.getAge());
//		    	return o1.getCourse().compareTo(o2.getCourse());
		    	return o1.getSurname().compareTo(o2.getSurname());
		    }
		});
		
		printParsedFile(studentList);
    }
    
    private static ArrayList<Student> readFileToArrayList(String fileToRead) throws FileNotFoundException {
		File file = new File(fileToRead);
	    ArrayList<Student> students = new ArrayList<Student>();
	    Scanner in = new Scanner(file);
	    while (in.hasNextLine()) {
	    	String row = in.nextLine();
	    	List<String> rowList = Arrays.asList(row.split(","));
	    	Student student = new Student(rowList.get(0), Integer.parseInt(rowList.get(1)), Integer.parseInt(rowList.get(2)));
	    	students.add(student);
	    }
	    in.close();
	    
	    return students;
	}
    
    public static void printParsedFile(ArrayList<Student> arrayListFromFile){
		for (Student student : arrayListFromFile){
			System.out.println(student.getSurname());
			System.out.println(student.getAge());
			System.out.println(student.getCourse());
			System.out.println("---------------------");
		}
	}
}
