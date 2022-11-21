import java.util.*;
class Details
{
    String name;
    int present,absent;
    Details next;
}
class Student
{
    Details head;    
    int number_student;
    ArrayList<Integer> array = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int number_day;
    Details ob = new Details();
    void input()
    {
        
        System.out.println("enter the number of the student:");
        number_student = scan.nextInt();
        for(int i=0;i<number_student;i++)
        {
            System.out.println("enter the name of the student:");
            ob.name = scan.nextLine();
            System.out.println("enter the number of days:");
            number_day = scan.nextInt();
            int ch;
            System.out.println("1.present\n2.absent\n");
            int present=0;int absent=0;
            int j =0;
            for(;j<number_day;j++)
            {
                System.out.println("enter the choice:");
                ch = scan.nextInt();
                if(ch == 1)
                {
                    present++;
                }
                else if(ch == 2)
                {
                    absent++;
                }
                else
                {
                    System.out.println("invalid choice");
                }
            }
            ob.present = present;
            ob.next = new Details();
        }

    }
}
public class Athi {
    
}
