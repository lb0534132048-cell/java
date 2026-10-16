public class MyTime extends MyDate {
    private int seconds;
    private int minutes;
    private int hours;

    public MyTime() {
        seconds = 0;
        minutes = 0;
        hours = 0;
    }

    public MyTime(int seconds, int minutes, int hours) {
        new MyTime();
        if (seconds >= 0 && seconds < 60)
            this.seconds = seconds;
        else throw new RuntimeException("not valid seconds");
        if (minutes >= 0 && minutes < 60)
            this.minutes = minutes;
        else throw new RuntimeException("not valid minutes");
        if (hours >= 0&&hours<24)
            this.hours = hours;
        else throw new RuntimeException("not valid hours");
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String getDate(char c) {
        return super.getDate(c)+""+c+hours+""+c+minutes+c+seconds;
    }
    public String getDate(char c1,char c2){
        return super.getDate(c1)+c2+hours+c2+minutes+c2+seconds;
    }
}
