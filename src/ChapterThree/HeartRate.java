package ChapterThree;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private  int currentYear;
    private int age;

    public HeartRate(String fName, String lName, int dateOB, int monthOB, int dayOB,int yearOB)
    {
        firstName = fName;
        lastName =lName;
        dateOfBirth = dateOB;
        dayOfBirth = dayOB;
        monthOfBirth = monthOB;
        yearOfBirth = yearOB;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDateOfBirth(int dateOB) {
        dateOfBirth = dateOB;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setMonthOfBirth(int monthOB) {
        monthOfBirth = monthOB;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setDayOfBirth(int dayOB) {
        dayOfBirth = dayOB;
    }

    public int getMDayOfBirth() {
        return dayOfBirth;
    }

    public void setYearOfBirth(int yearOB) {
        yearOfBirth = yearOB;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void calculateAPersonsAge() {
        int age = currentYear - yearOfBirth;
       currentYear = 2021;
    }
}
