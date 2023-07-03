public class Student {
    private String name;
    private int rollNumber;
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    
    public Student(String name, int rollNumber, int englishMarks, 
            int mathMarks, int scienceMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.englishMarks = englishMarks;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
    }
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public int getEnglishMarks() { return englishMarks; }
    public int getMathMarks() { return mathMarks; }
    public int getScienceMarks() { return scienceMarks; }
    public int calculateTotalMarks() { 
        return englishMarks + mathMarks + scienceMarks;
    }
    public char calculateGrade() {
        int totalMarks = calculateTotalMarks();
        if (totalMarks >= 90)
            return 'A';
        else if (totalMarks >= 80)
            return 'B';
        else if (totalMarks >= 70)
            return 'C';
        else if (totalMarks >= 60)
            return 'D';
        else
            return 'F';
    }
}