package Array_Problems;

public class MooreMajorityVoting {
    public static void main(String[] args)
  {
    int arr[] = { 2, 1, 1, 1, 1, 3, 4 };
    int majority = findMajority(arr);
    System.out.println(" The majority element is : "
                       + majority);
  }

  private static int findMajority(int[] arr){

    int cand = -1;
    int count = 0;

    for(int i = 0;i<arr.length;i++){       
        if(count == 0){
            cand = arr[i];
            count = 1;
        }
        else
        {
            if(arr[i] == cand){
                count++;
            }else{
                count--;
            }
        }
    }
    System.out.println(cand);

    System.out.println(count);
    count = 0;
    for(int i = 0 ; i< arr.length;i++){
        if(arr[i]==cand){
            count++;
        }
    }
    if(count>(arr.length/2)){
        return cand;
    }
    return -1;
  }
}
