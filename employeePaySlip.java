import java.util.Scanner;
class employee{
String empname,emid,address,mailid,mobileno;
double basicpay;
Scanner sc=new Scanner(System.in);
void readDetails()
{
System.out.println("Enter employee name: ");
empname=sc.nextLine();
System.out.println("Enter employee ID: ");
emid=sc.nextLine();
System.out.println("Enter employee address: ");
address=sc.nextLine();
System.out.println("Enter employee mail ID: ");
mailid=sc.nextLine();
System.out.println("Enter employee mobile no: ");
mobileno=sc.nextLine();
System.out.println("Enter employee basic pay: ");
basicpay=sc.nextDouble();
}
void displaydetails()
{
System.out.println("\n......Employee details....");
System.out.println("Name:"+empname);
System.out.println("ID:"+emid);
System.out.println("Address:"+address);
System.out.println("Mail:"+mailid);
System.out.println("Mobile no:"+mobileno);
System.out.println("Basic pay:"+basicpay);
}
}
class programmer extends employee
{
void generatePaySlip()
{
double da=basicpay*97/100;
double hra=basicpay*10/100;
double pf=basicpay*12/100;
double staffclub=basicpay*1/100;
double gross=basicpay+da+hra;
double net=gross-(pf+staffclub);
displaydetails();
System.out.println("Designation Programmer");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff club:"+staffclub);
System.out.println("Gross pay:"+gross);
System.out.println("Net:"+net);
}
}
class Assistantprofessor extends employee
{
void generatePaySlip()
{
double da=basicpay*110/100;
double hra=basicpay*20/100;
double pf=basicpay*12/100;
double staffclub=basicpay*5/100;
double gross=basicpay+da+hra;
double net=gross-(pf+staffclub);
displaydetails();
System.out.println("Designation Programmer");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff club:"+staffclub);
System.out.println("Gross pay:"+gross);
System.out.println("Net:"+net);
}
}
class Associateprofessor extends employee
{
void generatePaySlip()
{
double da=basicpay*130/100;
double hra=basicpay*30/100;
double pf=basicpay*12/100;
double staffclub=basicpay*10/100;
double gross=basicpay+da+hra;
double net=gross-(pf+staffclub);
displaydetails();
System.out.println("Designation Programmer");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff club:"+staffclub);
System.out.println("Gross pay:"+gross);
System.out.println("Net:"+net);
}
}
class professor extends employee
{
void generatePaySlip()
{
double da=basicpay*140/100;
double hra=basicpay*40/100;
double pf=basicpay*12/100;
double staffclub=basicpay*15/100;
double gross=basicpay+da+hra;
double net=gross-(pf+staffclub);
displaydetails();
System.out.println("Designation Programmer");
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("Staff club:"+staffclub);
System.out.println("Gross pay:"+gross);
System.out.println("Net:"+net);
}
}
public class employeePaySlip{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter employee designation:\n1.programmer\n2.Assistanceprofessor\n3Associateprofessor\n4.professor");
int choice=sc.nextInt();
sc.nextLine();
switch(choice){
case 1:
programmer p=new programmer();
p.readDetails();
p.generatePaySlip();
break;
case 2:
Assistantprofessor ap=new Assistantprofessor();
ap.readDetails();
ap.generatePaySlip();
break;
case 3:
Associateprofessor asp=new Associateprofessor();
asp.readDetails();
asp.generatePaySlip();
break;
case 4:
professor prof=new professor();
prof.readDetails();
prof.generatePaySlip();
break;
default:
System.out.println("Invalid choice");
}
sc.close();
}
}