package hust.soict.dsai.lab01;

import java.util.Scanner;

public class DisplayDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String month;

        System.out.print("Enter year: ");
        int year = sc.nextInt();
            System.out.print("Nhap thang: ");
            month = sc.next();
            switch(month){
                case "1":
                case "Jan":
                case "Jan.":
                case "January": {
                    System.out.print("Day: 31");
                    break;
                }

                case "2":
                case "Feb":
                case "Feb.":
                case "Febuary": {
                    if(year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
                        System.out.print("Day: 29");
                    } else {
                        System.out.print("Day: 28");
                    }
                    break;
                }
                case "3":
                case "Mar":
                case "Mar.":
                case "March": {
                    System.out.print("Day: 31");
                    break;
                }

                case "4":
                case "Apr":
                case "Apr.":
                case "April": {
                    System.out.print("Day: 30");
                    break;
                }

                case "5":
                case "May": {
                    System.out.print("Day: 31");
                    break;
                }

                case "6":
                case "Jun":
                case "Jun.":
                case "June": {
                    System.out.print("Day: 30");
                    break;
                }

                case "7":
                case "Jul":
                case "Jul.":
                case "July": {
                    System.out.print("Day: 31");
                    break;
                }

                case "8":
                case "Aug":
                case "Aug.":
                case "August": {
                    System.out.print("Day: 31");
                    break;
                }

                case "9":
                case "Sep":
                case "Sep.":
                case "September": {
                    System.out.print("Day: 30");
                    break;
                }

                case "10":
                case "Oct":
                case "Oct.":
                case "October": {
                    System.out.print("Day: 31");
                    break;
                }

                case "11":
                case "Nov":
                case "Nov.":
                case "November": {
                    System.out.print("Day: 30");
                    break;
                }

                case "12":
                case "Dec":
                case "Dec.":
                case "December": {
                    System.out.print("Day: 31");
                    break;
                }
                default: {
                    System.out.print("Invalid month");
                    break;
                }
        }
	}

}