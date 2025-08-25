package Search_Probs;

public class KokoEatingBananas{
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }

    private static int minimumRateToEatBananas(int[] v, int h){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<v.length; i++){
            if(v[i] > max){
                max = v[i];
            }
        }
        int time = 0;
        for(int i=1; i<=max; i++){
            int hours = hoursCalc(v,i);
            if(hours <=h){
                return i;
            }
        }
        return time;
    }

    private static int hoursCalc(int[] v, int speed){
        int hours = 0;

        for(int i = 0; i< v.length; i++){
            hours += Math.ceil((double) v[i] / (double) speed);
        }
        return hours;
    }
}