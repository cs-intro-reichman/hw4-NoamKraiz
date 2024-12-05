public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        final int n = Integer.parseInt(args[0]);
        if (n<=1) System.out.println("Prime numbers up to "+n+": none");
        else if (n == 2) {
            System.out.println("Prime numbers up to 2: 2");
            System.out.println("There is 1 prime between 2 and 2 (100% are prime)");
        }
            else{
                boolean [] arr = new boolean [n+1];
                arr[0] = false;
                arr[1] = false;
                System.out.println("Prime numbers up to "+n+":");
                for(int i=2; i<arr.length; i++) arr[i]=true;
                int i =2;
                while (i<arr.length) {
                    if(arr[i]==true){
                        for(int j=i+1; j<arr.length; j++){
                            if(j%i == 0) arr[j]= false;
                        }
                        
                    }
                    i++;
                }
                int count = 0;
                for(int k=0; k<arr.length;k++){
                    if(arr[k]==true){
                        System.out.println(k);
                        count++;
                    }
                }
                double pricent = (double)count/n*100 ;
                System.out.println("There are "+count+" primes between 2 and "+n+" ("+(int)pricent+"% are primes)");
            }
    }
}