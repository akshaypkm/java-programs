package Famouse_Problems;


public class DataFilter {
    public static void main(String[] args) {
        String[] data = {"John,90", "Alice,85", "Bob,92"};

        for(String str : data){
            String[] parts = str.split(",");
            String name = parts[0];

            int marks = Integer.parseInt(parts[1]);
            if(marks > 88){
                System.out.println("Name: "+name +" |"+ " Marks: "+marks);
            }
        }
    }
}