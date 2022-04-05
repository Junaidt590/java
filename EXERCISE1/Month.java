/**Java program to find the number of days in a month for a given year,Check Leap year also*/
import java.util.Scanner; 
public class Month { 
     public static void main(String[] args) { 
	int month, year;

    Scanner sc = new Scanner(System.in);
    int number_Of_DaysInMonth = 0;
    String MonthOfName = "Unknown";
    System.out.println("enter the month and year: ");
    month=sc.nextInt();
    year=sc.nextInt();
    switch(month)
		{
			case 1:
			MonthOfName ="january";
			number_Of_DaysInMonth=31;
			break;
			case 2:
			MonthOfName ="febrauary";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{
				number_Of_DaysInMonth=29;
			}
			else
			{
				number_Of_DaysInMonth=28;
			}
			break;
			case 3:
			MonthOfName ="march";
			number_Of_DaysInMonth=31;
			break;
			case 4:
			MonthOfName ="april";
			number_Of_DaysInMonth=30;
			break;
			case 5:
			MonthOfName ="may";
			number_Of_DaysInMonth=31;
			break;
			case 6:
			MonthOfName ="june";
			number_Of_DaysInMonth=30;
			break;
			case 7:
			MonthOfName ="july";
			number_Of_DaysInMonth=31;
			break;
			case 8:
			MonthOfName ="August";
			number_Of_DaysInMonth=31;
			break;
			case 9:
			MonthOfName ="september";
			number_Of_DaysInMonth=30;
			break;
			case 10:
			MonthOfName ="october";
			number_Of_DaysInMonth=31;
			break;
			case 11:
			MonthOfName ="november";
			number_Of_DaysInMonth=30;
			break;
			case 12:
			MonthOfName ="december";
			number_Of_DaysInMonth=31;
			break;
		}
		System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			System.out.println("Specified year is a leap year");
		 else
        		 System.out.println("Specified year is not a leap year");
}
}

/**enter the month and year: 
10
2014
october 2014 has 31 days
Specified year is not a leap year

enter the month and year: 
2
2020
febrauary 2020 has 29 days
Specified year is a leap year

*/
