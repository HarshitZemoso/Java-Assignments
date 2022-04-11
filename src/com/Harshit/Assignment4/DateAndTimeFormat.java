package com.Harshit.Assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class DateAndTimeFormat {
    static final Scanner in = new Scanner(System.in);
    static class RangeDate{
        Date start,last,signup,cur_date;
        Calendar minDate;
        RangeDate(Date signup,Date cur_date){
            Calendar anniversaryDate = Calendar.getInstance();
            anniversaryDate.setTime(signup);

            //year of firstSignUp
            int signUpYear = anniversaryDate.get(Calendar.YEAR);

            Calendar currDateCalender = Calendar.getInstance();
            currDateCalender.setTime(cur_date);

            anniversaryDate.set(Calendar.YEAR, currDateCalender.get(Calendar.YEAR));

            //subtract 30 days to get firstDate of range
            anniversaryDate.add(Calendar.DATE, -30);
            start = anniversaryDate.getTime();

            //getting lastDate of range
            anniversaryDate.add(Calendar.DATE, +60);
            last = anniversaryDate.getTime();


            minDate = Calendar.getInstance();
            minDate.setTime(start);
            minDate.set(Calendar.YEAR, signUpYear+1);

        }
        public Date getFirstDate() {
            return start;
        }

        public Date getlastDate() {
            return last;
        }

        public void computeRange() {
            //if current date before lastdate of range
            if (cur_date.compareTo(last) < 0 && cur_date.compareTo(start) > 0) {
                last = cur_date;


            }
            //if current date equal or before first date of range then there is no range formed
            else if (cur_date.compareTo(start) <= 0) {
                start = null;
                last = null;


            }
            //form filling range starts one year after signUpYear before that no range formed
            else if (minDate.getTime().compareTo(start) > 0) {
                start = null;
                last = null;
            }


        }

    }
    static void main(String[] args) throws ParseException {
        int n = in.nextInt();
        RangeDate[] arr = new RangeDate[n];
        SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");
        for (int i = 0; i <n ; i++) {
            String signup = in.next();
            String cur_date = in.next();
            RangeDate rangeDate = new RangeDate(date.parse(signup),date.parse(cur_date));
            rangeDate.computeRange();

            arr[i]= rangeDate;

        }
        for (int i = 0; i < n; i++) {
            if (arr[i].getFirstDate() == null) {
                System.out.println("No range");
            } else {
                //changing date into string
                System.out.println(date.format(arr[i].getFirstDate()) + " " + date.format(arr[i].getlastDate()));
            }
        }
    }
}