package Famouse_Problems;
/*
Problem Description:
---------------------
An AWS client wants to deploy multiple applications using two types of servers:
- One for the frontend
- One for the backend

Each server has a quality score (availability), given as two lists:
- `frontend`: List of frontend server qualities
- `backend`: List of backend server qualities

The requirement is:
  For a valid pair (frontend[i], backend[j]), the frontend server's quality must be strictly greater than the backend's:
      frontend[i] > backend[j]

Each server can be used only once.
Your task is to find the **maximum number of valid (frontend, backend) pairs** that can be formed.
*/

import java.util.*;

public class AWSServerMatching {
    public static void main(String[] args) {
        List<Integer> frontend = Arrays.asList(1, 2, 3,4,5);
        List<Integer> backend = Arrays.asList(1, 1,3,5,3);

        int maxPairs = getMaxValidPairs(frontend, backend);
        System.out.println("Max valid pairs: " + maxPairs);
    }

    public static int getMaxValidPairs(List<Integer> frontend, List<Integer> backend) {
        // Sort both lists
        Collections.sort(frontend);
        Collections.sort(backend);

        // Initialize two pointers and a counter
        int i = 0, j = 0, count = 0;

        // Logic to match frontend[i] > backend[j]
        // You fill this part in with your hammer
        while(frontend.size()>i && backend.size()>j){
            if(frontend.get(i)>backend.get(j)){
                count++;
                i++;
                j++;
        }else{
            i++;
        }
        System.out.println(count);
    }

    return count;
    }
}

