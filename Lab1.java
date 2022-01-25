public class Lab1
{
    public static void main(String[] args) 
    {
        System.out.println("Qns2a");
        System.out.println("Hello I am Amiir.");

        System.out.println();

        System.out.println("Qns2b");
        String modCode = "CSC1009"; 

        switch(modCode) 
        { 
            case "CSC1006": 
            System.out.println("Mathematics 2");
            break;

            case "CSC1007": 
            System.out.println("Operating Systems");
            break;

            case "CSC1008": 
            System.out.println("Data Structures and Algorithms");
            break;  

            case "CSC1009": 
            System.out.println("Object-Oriented Programming");
            break; 

            case "CSC1010": 
            System.out.println("Computer Networks");
            break; 

        }

        System.out.println("After switch"); 

        System.out.println();
        
        System.out.println("Qns2c");

        for (int x = 102; x>65; x=x-1)
        {
            if (x%2!=0) //if number is odd
            {
                System.out.println("Value of x: "+x);
            }
        }
    }
}