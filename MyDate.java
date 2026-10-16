public class MyDate {
    protected int day;
    protected int month;
    protected int year;
    public MyDate(){
        day=1;
        month=1;
        year=1950;
    }
    public MyDate(int day,   int month   ,int year){
         new MyDate();
        if (day>0&&day<32)
            this.day=day;
        else throw new RuntimeException("not valid day");
        if (month>0&&month<13)
          this.month=month;
        else throw new RuntimeException("not valid month");
        if (year>0)
         this.year=year;
        else throw new RuntimeException("not valid year");
    }
    public void setDay(int day){
        if (day>0&&day<32)
            this.day=day;
        else throw new RuntimeException("not valid day");
    }
    public void setMonth(int month){
        if (month>0&&month<13)
            this.month=month;
        else throw new RuntimeException("not valid month");
    }
    public void setYear(int year){
        if (year>0)
            this.year=year;
        else throw new RuntimeException("not valid year");
    }
    public String getDate(char c){
        return day+""+c+month+""+c+year;
    }
}
