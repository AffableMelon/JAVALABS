class GradeBook2 {
    static void pringGrades(double[] grades){
        for(double grade: grades){
            System.out.printf("Your grade is: %.02f %n", grade);
        }
    }
    static String averageGrade(double[] grades){
        double sum=0;
        String ret="";
        for (double grade : grades){
            sum += grade;
        }
        double average = sum/grades.length;
        // System.out.printf("Your average grade is: %.02f", average);
        ret = ("Your average grade is " + average);
        if (average >= 90) ret = (ret + "\nYou got an A"); //System.out.println("You got an A");
        else if(average >= 80) ret = (ret + "\nYou got a B"); //System.out.println("You got a B");
        else if(average >= 70) ret = (ret + "\nYou got a C"); //System.out.println("You got a C");
        else if(average >= 60) ret = (ret + "\nYou got a D"); //System.out.println("You got a D");
        else ret = (ret + "\n You got an F"); //System.out.println("You got an F");
        return(ret);
    }
    public static void main (String[] args){
        double[] grades = new double[args.length];
        if (args.length == 0){
            return;
        }
        for(int i = 0; i < args.length; i++){
            grades[i] = Double.parseDouble(args[i]);
        }
        pringGrades(grades);
        System.out.println(averageGrade(grades));
    }
}
