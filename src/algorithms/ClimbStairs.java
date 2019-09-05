package algorithms;

public class ClimbStairs {
        public int climbStairs(int n) {
            if(n==1) return 1;
            if(n==2) return 2;
            if(n==3) return 3;
            int [] climbWays = new int[n];

            climbWays[0] =1;
            climbWays[1]=2;
            climbWays[2] =3;
            for(int i=3; i<n; i++) {
                climbWays[i]= climbWays[i-1]+climbWays[i-2];

            }
            return climbWays[n-1];
        }

    public static void main(String args[]){
        ClimbStairs climbStairs= new ClimbStairs();
        climbStairs.climbStairs(4);
    }
}
