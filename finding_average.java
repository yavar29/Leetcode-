import java.util.Scanner;

public class Main {

    public static char findGrade(String[] arr){
        int sum = 0;
        char grade=0;
        for(int i=1; i<arr.length;i++){
            sum+=Integer.parseInt(arr[i]);
        }
        if(sum>=400 && sum<=500)
            grade='O';
        if(sum>=300 && sum<=399)
            grade='A';

        if(sum>=250 && sum<=299)
            grade='B';
        if(sum>=200 && sum<=249)
            grade='C';
        if(sum>=0 && sum<=199)
            grade='E';

        return grade;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numStudents=sc.nextInt();
        if(numStudents<=0)
            System.out.println(numStudents+" is an invalid input");
        else{
            String[] records=new String[numStudents];
            System.out.println("Enter the input records");
            for(int i=0;i<numStudents;i++) {
                records[i] = sc.next();
            }
            for(int i=0;i<numStudents;i++){
                String s[]=records[i].split(":");
                char grade=findGrade(s);
                System.out.println(s[0]+":"+grade);
            }
        }
    }
}
