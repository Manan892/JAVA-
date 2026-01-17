import java.util.Scanner;

class Date {
    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        this.year=year;
    }
    public void setMonth(int month) {
        this.month=month;
    }
    public void setday(int day) {
        this.day=day;
    }

    public void DisplayDate(int monthDay[]) {
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int firstDayYear=(year+(year-1)/4-(year-1)/100+(year-1)/400)%7;
        int firstDayMonth=(firstDayYear+monthDay[month-1])%7;
        int weekday = (firstDayMonth + day - 1) % 7;
        int n=(day-1)/7 + 1;

        System.out.println(day + " / " + month + " / " + year + " is " + n + "th " + days[weekday] + " of " + months[month-1]);

    }
}

class Q10 {
    
    public static int rightValue(int a,int l,int r,Scanner sc) {
        while (a<l || a>r) {
            System.out.print("Enter correct vaue: ");
            a = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int monthDay[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        
        Date dmy=new Date();
        System.out.print("Enter the year: ");
        int y=Math.abs(sc.nextInt());
        dmy.setYear(y);
        if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
            for (int i = 2; i < monthDay.length; i++) {
                monthDay[i]++;
            }
        }

        System.out.print("Enter the month: ");
        int m=sc.nextInt();
        m = rightValue(m,1,12,sc);
        dmy.setMonth(m);

        System.out.print("Enter the day: ");
        int d=sc.nextInt();
        d = rightValue(d, 1, monthDay[m]-monthDay[m-1],sc);
        dmy.setday(d);

        dmy.DisplayDate(monthDay);

        sc.close();
    }
}
