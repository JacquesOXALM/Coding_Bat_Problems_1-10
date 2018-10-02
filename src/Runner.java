public class Runner {
    public int diff21(int n) {
        if (n < 21) {
            return 21 - n;
        } else {
            return (21 - n) * -2;
        }
    }
}
public int sumDouble(int a, int b) {
        if(a!=b){
            return a+b;
        }else{
            return (a+b)*2;
        }
}
public String lastChars(String a, String b) {
        String x;
        String y;
        if(a.length()!=0){
            x = a.substring(0,1);
        }else{
            x = "@";
        }
        if(b.length()!=0){
            y = b.substring(b.length()-1,b.length());
        }else{
            y = "@";
        }
        return x+y;
}
public String comboString(String a, String b) {
        if(a.length()>b.length()){
            return b+a+b;
        }else{
            return a+b+a;
        }
}
public boolean commonEnd(int[] a, int[] b) {
        if(a[0]==b[0] || a[a.length-1]==b[b.length-1]){
            return true;
        }else{
            return false;
        }
}
public int[] biggerTwo(int[] a, int[] b) {
        int x= a[0]+a[1];
        int y= b[0]+b[1];
        if(x>y){
            return a;
        }else if(y>x){
            return b;
        }else{
            return a;
        }
}
public boolean nearTen(int num) {
        if((num%10)<=2 || (num%10)>=8){
            return true;
        }else{
            return false;
        }
}
public boolean catDog(String str) {
        int cat=0;
        int dog=0;
        for(int i=0; i<str.length()-2; i++){
            if(str.substring(i,i+3).equals("cat")){
                cat++;
            }
            if(str.substring(i,i+3).equals("dog")){
                dog++;
            }
        }
        return cat==dog;
}
public boolean lucky13(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                x++;
            }
            if(nums[i]==3){
                x++;
            }
        }
        if(x>0){
            return false;
        }else{
            return true;
        }
}
public int luckySum(int a, int b, int c) {
        int fin = 0;
        if(a!=13 && b!=13 && c!=13){
            fin=a+b+c;
        }
        if(a!=13 && b!=13 && c==13){
            fin=a+b;
        }
        if(a!=13 && b==13){
            fin= a;
        }
        if(a==13 ){
            fin= 0;
        }
        if((a==13 && c==13) || (a==13 && b==13)){
            fin = 0;
        }
        return fin;
}
public boolean gHappy(String str) {
    int a = str.length();
    boolean boolBeans = true;
    for (int i = 0; i < a; i++) {
        if (str.charAt(i) == 'g') {
            if (i > 0 && str.charAt(i-1) == 'g')
                boolBeans = true;
            else if (i < a-1 && str.charAt(i+1) == 'g')
                boolBeans = true;
            else
                boolBeans = false;
        }
    }
    return boolBeans;
}
public int countClumps(int[] nums) {
        int numClumps=0;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]==nums[i-1] && nums[i+1]!=nums[i]){
                numClumps++;
            }
        }
        if(nums.length<=0){
            return 0;
        }
        if(nums[nums.length-1]==nums[nums.length-2]){
            numClumps++;
        }
        return numClumps;
}
public boolean noTriples(int[] nums) {
        int trip=0;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]==nums[i-1] && nums[i+1]==nums[i]){
                trip++;
            }
        }
        if(trip>0){
            return false;
        }else{
            return true;
        }
}












