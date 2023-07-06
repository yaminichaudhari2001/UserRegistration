package bridzelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRgistration {
    public void validfirstname(){
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.println("enter the firstname");
        String firstname=scanner.nextLine();
        Matcher matcher= pattern.matcher(firstname);
        if (matcher.hasMatch())
        {
            System.out.println("firstname valid");
        }
        else
        {
            System.out.println("not valid");
        }
    }
    
    public void validlastname(){
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        System.out.println("enter the lastname");
        String firstname=scanner.nextLine();
        Matcher matcher= pattern.matcher(firstname);
        if (matcher.hasMatch())
        {
            System.out.println("lastname valid");
        }
        else
        {
            System.out.println(" lastname not valid");
        }
    }
    public void validemail()
    {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
        System.out.println("enter the email");
        String firstname=scanner.nextLine();
        Matcher matcher= pattern.matcher(firstname);
        if (matcher.hasMatch())
        {
            System.out.println("email valid");
        }
        else
        {
            System.out.println(" email not valid");
        }
    }
    public void validnumber()
    {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile("^[9][1]\\s[6-9][0-9]{9}$");
        System.out.println("enter the  Mobile number");
        String firstname=scanner.nextLine();
        Matcher matcher= pattern.matcher(firstname);
        if (matcher.hasMatch())
        {
            System.out.println("Mobile Number is valid");
        }
        else
        {
            System.out.println("Mobile Number is not valid");
        }
    }
    public static void main(String[] args) {
        System.out.println("welcom to the User Registration");
        UserRgistration ob=new UserRgistration();
        ob.validfirstname();
        ob.validlastname();
        ob.validemail();
        ob.validnumber();
    }
}
