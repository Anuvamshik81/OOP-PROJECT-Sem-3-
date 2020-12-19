package project;
import java.util.*;
import java.util.Map.Entry;
class Monitor extends attendance {
    String name;
    int ID;
    float att_per;
    Monitor() {
    }
    Monitor(String name, int ID, float att_per) {
        this.name = name;
        this.ID = ID;
        this.att_per = att_per;
    }
}

public class attendance {
    public String user_name;
    public int user_id = 1;
    private String password;
    public static int count = 1;
    public static String input;
    public attendance()
    {

    }

    public static <k, v extends Comparable<v>>Map<k, v>
    sortbyValues( final Map<k, v> map){
        Comparator<k> valueComparator = new Comparator<k>() {
            @Override
            public int compare(k k1, k k2) {
                int compare = map.get(k1).compareTo(map.get(k2));
                if (compare == 0)
                    return 1;
                else
                    return compare;
            }
        };
        Map<k, v> sortedByValues = new TreeMap<k, v>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
    public static void main (String[]args) throws Exception {
        final String RESET = "\u001B[0m";
        final String CYAN = "\033[0;96m";
        final String YELLOW = "\u001B[33m";
        final String GREEN = "\033[0;32m";
        final String WHITE_BACKGROUND = "\033[47m";
        final String BLACK = "\033[0;30m";
        final String PURPLE = "\033[0;35m";
        Scanner sc = new Scanner(System.in);
        String Username = null;
        String Password = null;
        String Login_Username = null;
        String Login_Password = null;
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(CYAN + "                        WELCOME ! \n");
        System.out.println("         Create an account for yourself to access\n               the attendance list below... \n" + RESET);
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(YELLOW + "\nPress 'Register' to create a new profile : ");
        String Register = sc.nextLine();
        if (Register.equals("Register")) {
            System.out.println("Please enter the Username : ");
            Username = sc.nextLine();
            System.out.println("Please enter the Password : ");
            Password = sc.nextLine();
        } else {
            System.out.println(" Invalid input..! ");
            System.exit(0);
        }
        System.out.println(RESET);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println(GREEN + "         A account has been created successfully ! \n   Now press 'Login' to view the details of the students. " + RESET);
        System.out.println("-------------------------------------------------------------------------------------");
        String Login = sc.nextLine();
        if (Login.equals("Login")) {
            System.out.println(GREEN + "Please enter the Username : ");
            Login_Username = sc.nextLine();
            System.out.println("Please enter the Password : ");
            Login_Password = sc.nextLine();
        }
        else {
            System.out.println(" Invalid input..! ");
            System.exit(0);
        }
        if (Username.equals(Login_Username) && (Password.equals(Login_Password))) {
            System.out.println("\nLogin Successful ! \n" + RESET);
            System.out.println(PURPLE);
            Monitor m = new Monitor("Ravi", 98, 90.2f);
            Monitor g = new Monitor("Ram", 60, 85.5f);
            Monitor h = new Monitor("Raju", 81, 78.06f);
            Monitor i = new Monitor("Suresh", 62, 72.0f);
            Monitor r = new Monitor("Suraj", 62, 69.0f);
            Monitor p = new Monitor("Ramesh", 53, 67.06f);
            Monitor q = new Monitor("Chris", 82, 96.0f);
            Monitor t = new Monitor("Kohli", 43, 86.06f);
            Monitor w = new Monitor("Pandey", 19, 92.0f);
            Monitor a = new Monitor("Deekshith", 91, 95.0f);
            do {
                System.out.println( "\n1.) Search for a employee \n2.) Details of all employee in a Sorted Manner \n3.)Segregate into category\n4.) Exit the Process." );
                System.out.println("\nEnter your choice : ");
                int num = sc.nextInt();

                switch (num) {
                    case 1: {
                        System.out.println("Enter the employee's name : ");
                        String name = sc.next();
                        if (name.equals("Ravi")) {
                            System.out.println("Attendance percentage is" + " : " + m.att_per);
                        }
                        if (name.equals("Ram")) {
                            System.out.println("Attendance percentage is" + " : " + g.att_per);
                        }
                        if (name.equals("Raju")) {
                            System.out.println("Attendance percentage is" + " : " + h.att_per);
                        }
                        if (name.equals("Suresh")) {
                            System.out.println("Attendance percentage is" + " : " + i.att_per);
                        }
                        if (name.equals("Suraj")) {
                            System.out.println("Attendance percentage is" + " : " + r.att_per);
                        }
                        if (name.equals("Ramesh")) {
                            System.out.println("Attendance percentage is" + " : " + p.att_per);
                        }
                        if (name.equals("Chris")) {
                            System.out.println("Attendance percentage is" + " : " + q.att_per);
                        }
                        if (name.equals("Kohli")) {
                            System.out.println("Attendance percentage is" + " : " + t.att_per);
                        }
                        if (name.equals("Pandey")) {
                            System.out.println("Attendance percentage is" + " : " + w.att_per);
                        }
                        if (name.equals("Deekshith")) {
                            System.out.println("Attendance percentage is" + " : " + a.att_per);
                        }
                        break;
                    }
                    case 2: {
                        TreeMap<String, Float> Attendance_Percentage = new TreeMap<>();
                        Attendance_Percentage.put("     Ravi", 90.2f);
                        Attendance_Percentage.put("     Ram", 85.5f);
                        Attendance_Percentage.put("     Raju", 78.6f);
                        Attendance_Percentage.put("     Suresh", 72.0f);
                        Attendance_Percentage.put("     Suraj", 72.0f);
                        Attendance_Percentage.put("     Ramesh", 67.06f);
                        Attendance_Percentage.put("     Chris", 96.0f);
                        Attendance_Percentage.put("     Kohli", 86.06f);
                        Attendance_Percentage.put("     Pandey", 92.0f);
                        Attendance_Percentage.put("     Deekshith", 95.0f);
                        Map sortedmap = sortbyValues(Attendance_Percentage);
                        Set set = sortedmap.entrySet();
                        Iterator z = set.iterator();

                        while (z.hasNext()) {
                            Map.Entry my = (Map.Entry) z.next();
                            System.out.println(my.getKey() + " ---> " + my.getValue());
                        }
                        break;
                    }
                    case 3:
                    {
                        HashMap<String,Float> obj = new HashMap();
                        obj.put("Ravi",90.2f);
                        obj.put("Ram",85.5f);
                        obj.put("Raju",78.6f);
                        obj.put("Suresh",72.0f);
                        obj.put("Suraj",69.0f);
                        obj.put("Ramesh",67.06f);
                        obj.put("Chris",96.0f);
                        obj.put("Kohli",86.06f);
                        obj.put("Pandey",92.0f);
                        obj.put("Deekshith",95.0f);
                        for(Entry<String, Float> entry: obj.entrySet())
                        {
                            if(entry.getValue()>=90.0f)
                            {
                                System.out.println(entry.getKey()+" "+"Belongs to first Category");
                            }
                            if(entry.getValue()>=80.0f && entry.getValue()<90.0f)
                            {
                                System.out.println(entry.getKey()+" "+"Belongs to second Category");
                            }
                            if(entry.getValue()>=70.0f && entry.getValue()<80.0f)
                            {
                                System.out.println(entry.getKey()+" "+"Belongs to Third Category");
                            }
                            if(entry.getValue()>=60.0f && entry.getValue()<70.0f)
                            {
                                System.out.println(entry.getKey()+" "+"Belongs to Fourth Category");
                            }
                        }
                        break;
                    }
                    case 4:{
                        System.exit(0);
                        break;
                    }
                    default:{
                        System.out.println("Invalid Choice ! Try again... " + RESET);
                        break;
                    }
                }
            }while(true);
        }
        else {
            System.out.println("\nInvalid Credentials ! \nTry again from the beginning...");
            System.exit(0);
        }
    }
}
