public class Squareroot {
    static int findSquare(int x ){
        long st = 0;

        long end = x;

        long ans = -1;
        while(st <= end){
            long mid = st + (end-st)/2;
            if(mid*mid==x){
                return (int) mid;
            }
            if(mid*mid <= x){
                ans = mid;
                st = mid+1;
            }
            else{
                end = mid -1;
            }


        }








        return (int) ans;
    }

    static float preciseValue(double tempans , int precision , int value){

        double increment = 0.1;

        for(int i = 0 ; i < precision ; i++){
            while(tempans * tempans <= value){
                tempans += increment;


            }
            tempans =  tempans - increment;
            increment = increment/10;
        }

        return (float) tempans;

    }


    public static void main(String[] args) {
       int tempans = findSquare(4);
        System.out.println(tempans);
        float Value = preciseValue(tempans , 3, 5);
        System.out.println(Value);

    }
}
