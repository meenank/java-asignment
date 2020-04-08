/* Q3: Write a Health Care Application in which use an enum to store the available doctors with attributes name,
 consultation fee and specialization. Ask the user to enter the patient_name, age and create a patient id
 automatically. Now display the details of all the available doctors and ask the user to select the doctor. 
 Now display the Appointment slip for the patient that includes Patient details, Patient Id and details of the
 Doctor along with the fee to be paid. Store all the details of the Patient in an Array of Objects and
 implement a function to display the details of the patient with a given patient id.
*/
import java.lang.*;
import java.util.*;

//class for patient details

class pat_details
{
    
    private String name;
    private int age;
    private int id=id_calc();

    public static int id_calc()
    {
        // using random class for generating patient_id
        Random rand = new Random();
        int id = rand.nextInt(50);
        return id;
    }
    pat_details(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display()
    {
        System.out.println("\t"+name+"\t"+age+"\t"+id);
        System.out.println();
    }
    
}

// enum for doctor details

enum doc_details
{
    SIDDARTH("ORTHOPEDIC", 500, 1), MALHOTRA("PEDIARTISIAN", 1000, 2), SHARMA("NEURO_SURGEON", 1500, 3);
    public String spec;
    public int fee;
    public int num;
    doc_details(String sp, int fe, int n)
    {
        this.spec=sp;
        this.fee=fe;
        this.num=n;
    }
    public String get_spec()
    {
        return spec;
    }
    public int get_fee()
    {
        return  fee;
    }
    public int get_num()
    {
        return num;
    }
}

// main class with main() function
class work
{
    // array of objects declaration
    static pat_details obj[] = new pat_details[5];

    //function to display patients details using display() function
    public static void dis() {
        System.out.println("\tName \tAge \tId");
        for (int i = 0; i <5; i++) {
            obj[i].display();
        }
    }
      // took only 5 patients for test
    public static void main(String[] args) {
        // declaring scanner object
        Scanner s = new Scanner(System.in);
        // local variables declaration
        int oid;
        String yeah="yes", nah="no";
        // starting of the execution according to question
        System.out.println("Enter patient details:");
        for(int j=0; j<5; j++)
        {
            System.out.println("Enter "+(j+1)+" patient's details");
            obj[j]=new pat_details(s.next(), s.nextInt());
                // displaying available doctors
                System.out.println();
                System.out.println("\tName"+"\tSecialization"+"\tFees"+"\tDoctor_id");
                System.out.println();
                for(doc_details i: doc_details.values())
                {
                    System.out.println("\t"+i.name()+"\t"+i.get_spec()+"\t"+i.get_fee()+"\t"+i.get_num());
                    System.out.println();
                }
                System.out.println();
                System.out.println("Select any doctor by typing in doctor_id:");
                oid=s.nextInt();
                if(oid==1)
                {
                    System.out.println("* * * * * * * BILL * * * * * * *");
                    System.out.println("-------Patient's details-------");
                    System.out.println("\tName \tAge \tId");
                    obj[j].display();
                    System.out.println("-------Doctor's details--------");
                    for(doc_details i: doc_details.values())
                    {
                        while(i.get_num()==1)
                        {
                            System.out.println("Doctor name = "+i);
                            System.out.println();
                            System.out.println(i+"'s specialization = "+i.get_spec());
                            System.out.println();
                            System.out.println(i+"'s fees = "+i.get_fee());
                            System.out.println();
                            System.out.println("******************************");
                            break;
                        }
                    }
                }
                else if(oid==2)
                {
                    System.out.println("* * * * * * * BILL * * * * * * *");
                    System.out.println("-------Patient's details-------");
                    System.out.println("\tName \tAge \tId");
                    obj[j].display();
                    System.out.println("-------Doctor's details--------");
                    for(doc_details i: doc_details.values())
                    {
                        while(i.get_num()==2)
                        {
                            System.out.println("Doctor name = "+i);
                            System.out.println();
                            System.out.println(i+"'s specialization = "+i.get_spec());
                            System.out.println();
                            System.out.println(i+"'s fees = "+i.get_fee());
                            System.out.println();
                            System.out.println("******************************");
                            break;
                        }
                    }
                }
                else if(oid==3)
                {
                    System.out.println("* * * * * * * BILL * * * * * * *");
                    System.out.println("-------Patient's details-------");
                    System.out.println("\tName \tAge \tId");
                    obj[j].display();
                    System.out.println("-------Doctor's details--------");
                    for(doc_details i: doc_details.values())
                    {
                        while(i.get_num()==3)
                        {
                            System.out.println("Doctor name = "+i);
                            System.out.println();
                            System.out.println(i+"'s specialization = "+i.get_spec());
                            System.out.println();
                            System.out.println(i+"'s fees = "+i.get_fee());
                            System.out.println();
                            System.out.println("******************************");
                            break;
                        }
                    }
                }
        }
        System.out.println("Do you want to see the records of all the patients?");
        System.out.println();
        System.out.println("type -yes- or -no-");
        String ans=s.next();
        if(ans.equals(yeah))
        {
            dis();
        }
        else if(ans.equals(nah))
        {
            System.out.println("so long..BYE..Have A Good Day");
        }
        
    }
}