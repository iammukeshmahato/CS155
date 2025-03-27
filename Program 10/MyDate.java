// MyDate class
class MyDate {
    private int year, month, day;

    public MyDate() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.year = calendar.get(java.util.Calendar.YEAR);
        this.month = calendar.get(java.util.Calendar.MONTH) + 1;
        this.day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

