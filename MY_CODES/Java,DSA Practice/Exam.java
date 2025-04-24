/* In Chefland, there are X schools, and each school has Y students.The year end results are in and a total of 
   Z students passed the exams.Assuming that all students appeared for the exams, find whether the number of 
   students who passed in Chefland was strictly greater than 50%. */

import java.util.ArrayList;
import java.util.Scanner;

// Base class representing a School
class School 
{
    int students;

    School(int students) 
	{
        this.students = students;
    }

    int getStudents() 
	{
        return students;
    }
}

// Interface representing behavior related to passing exams
interface ExamPass 
{
    boolean isPassPercentageGreaterThan50();
}

// Derived class implementing ExamPass interface and extending School class
class CheflandSchool extends School implements ExamPass 
{
    int totalStudentsPassed;

    CheflandSchool(int students, int totalStudentsPassed) 
	{
        super(students);
        this.totalStudentsPassed = totalStudentsPassed;
    }

    @Override
    public boolean isPassPercentageGreaterThan50() 
	{
        double passPercentage = ((double) totalStudentsPassed / students) * 100;
        return passPercentage > 50.0;
    }
}

public class CheflandResults 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        // Input the number of schools (X)
        System.out.print("Enter the number of schools (X): ");
        int X = scanner.nextInt();

        // Input the number of students per school (Y)
        System.out.print("Enter the number of students per school (Y): ");
        int Y = scanner.nextInt();

        // Create ArrayList to store CheflandSchool objects
        ArrayList<CheflandSchool> schools = new ArrayList<>();

        // Input the total number of students who passed (Z) for each school
        for (int i = 0; i < X; i++) 
		{
            System.out.print("Enter the total number of students who passed for school " + (i + 1) + ": ");
            int Z = scanner.nextInt();
            schools.add(new CheflandSchool(Y, Z));
        }

        // Check if the pass percentage is strictly greater than 50% for each school
        for (int i = 0; i < X; i++) 
		{
            if (schools.get(i).isPassPercentageGreaterThan50()) 
			{
                System.out.println("School " + (i + 1) + ": The number of students who passed is strictly greater than 50%.");
            } else 
			{
                System.out.println("School " + (i + 1) + ": The number of students who passed is not strictly greater than 50%.");
            }
        }
    }
}
