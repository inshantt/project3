
package com.lambton;
        import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
        import java.util.Date;
enum Gender {
    Male,
    Female,
    Other
}
public class Student {
    static String[] months = new String[]{"null",
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"};
    private int studentId;              //class level attribute
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Gender gender;
    private float subject1;
    private float subject2;
    private float subject3;
    private float totalMarks;
    private double percentage;
    private String result;
    public Student(int studentId, String firstName, String lastName, Date birthDate, Gender gender) {
        this.studentId = studentId;
        this.firstName = firstName;                                        //calling only one time
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
    }
    /*    public void setStudentId(int studentId) {             //setter
            this.studentId = studentId;
        }*/
    public int getStudentId() {                         //getter
        return this.studentId;
    }
    public void setFirstName(String firstName) {        //setter
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }
    public void setSubject1(float subject1) {
        this.subject1 = subject1;
    }
    public float getSubject1() {
        return subject1;
    }
    public void setSubject2(float subject2) {
        this.subject2 = subject2;
    }
    public float getSubject2() {
        return subject2;
    }
    public void setSubject3(float subject3) {
        this.subject3 = subject3;
    }
    public float getSubject3() {
        return subject3;
    }
    /*    public void setTotalMarks(float totalMarks) {
            this.totalMarks = totalMarks;
        }*/
    public float getTotalMarks() {
        this.totalMarks=subject1+subject2+subject3;
        return totalMarks;
    }
    public double getPercentage() {
        percentage=getTotalMarks()/300*100;
        return percentage;
    }
    public String getResult() {
        if(getPercentage()>80){
            result="A grade";
        }else if(getPercentage()>90){
            result="A+ grade";
        }else
        {
            result="Fail";
        }
        return result;
    }
    /*    public void setData(int studentId, String firstName,                        //calling can be multiple time
                        String lastName, Date birthDate,                          //not useful in updating single value
                        Gender gender, float totalMarks)  //local attributes
    {
        this.studentId = studentId; //this keyword helps in linking
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.totalMarks = totalMarks;
    }*/
    private int calculateStudentAge() {
        int age;
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();
        return age;
    }
    /*      private String getFormattedBirthDate() {
              DateTimeFormatter myformat= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
              String formattedDate= birthDate.f
          }*/
    public void printData() {
        System.out.println("Student ID: " + getStudentId());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Birth Date: " + getBirthDate().getDate()+"-"+months[getBirthDate().getMonth()]+"-"+getBirthDate().getYear());
        System.out.println("Gender: " + getGender());
        System.out.println("Subject1: "+getSubject1());
        System.out.println("Subject2: "+getSubject2());
        System.out.println("Subject3: "+getSubject3());
        System.out.println("Total Marks: "+ getTotalMarks() );
        System.out.println("Percentage: "+getPercentage()+"%");
        System.out.println("Result: "+getResult());
        System.out.println("Age: " + calculateStudentAge());
    }
}