
class Gradebook{
    /* contains both lab2 and 3 */
    public static void main (String[] args){
        double[] grades = {90, 45, 89, 75, 60};
        for (double d : grades) {
            System.out.printf("Your grade is: %.01f %n", d);
        }
        double sum = 0;
        for (double d : grades) {
            sum += d;
        }
        double average = sum/grades.length;
        System.out.printf("The average is: %.01f %n", sum/grades.length);
        if (average >= 90) System.out.println("You got an A");
        else if(average >= 80) System.out.println("You got a B");
        else if(average >= 70) System.out.println("You got a C");
        else if(average >= 60) System.out.println("You got a D");
        else System.out.println("You got an F");



        int x = 5;
        int y = 3;
        int z = x + x*y - y; // (PEMDAS) (PREFIX INCREMENT/DECREMENT > ALL OF THE PEMDASES)
        System.out.println("The value of z is " + z);
        
        int w = ++x + y + y--;
        System.out.println("The value of w is " + w);
        System.out.println("The value of x is now " + x);
        System.out.println("The value of y is now " + y);
        boolean a = true;
        boolean b = false;
        boolean c = ((a && (!(x > y))) && (a || y >x ));
        System.out.println("c is " + c);

        // 3. the file will have the same name as the class. 

        double celcious = 100; 
        double Farh = (9.0/5) * celcious +32;
        System.out.println(Farh);

        int age = 21;
        if (age < 21)System.out.println("You are not old enough to drive");
        else System.out.println("You are old enough to drive");

        for (int n = 1; n < 100; n++){
            System.out.print(n + " ");
            n++;
        }
        System.out.println();

        int n = 1;
        while ( n < 100){
            int check = n % 2;
            if (check != 0) System.out.print(n++ + " ");
            else n++;
        }


    }
}
