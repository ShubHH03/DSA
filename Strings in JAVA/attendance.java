// The student is eligible for an attendance award if they meet both of the following criteria:
// The student was absent (A) for strictly fewer than 2 days total.
// The student was never late (L) for 3 or more consecutive days.
// Retum true if the student is eligible for an attendance award, or false otherwise.
// 'A' : Absent, 'L' : Late, 'P' : Present.

public class attendance {
    static boolean checkRecord(String s) {
        int countA = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A') countA++; if(countA>=2) return false;
            
        }
        if(s.indexOf("LLL")!=-1){
                return false;
            }
        // if(countA<=1 ) return true;
        return true;
    }
    public static void main(String[] args) {
        boolean ans = checkRecord("PPALLP");
        System.out.println(ans);
    }
}
