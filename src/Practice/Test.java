package Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        //Reverse an integer

        /*Integer num=12345;
        int rev=0;
        while(num>0){

            rev=rev*10 + num%10;
            num=num/10;

        }
        System.out.println(rev);

           //using java8

        Integer num= 123456;
        Arrays.stream(String.valueOf(num).split("")).sorted(Comparator.reverseOrder()).forEach(System.out::print);
        */

        /*
        Armstrong number
        Integer num=370;
        Double copy= Double.valueOf(num);
        Integer  rem=0;
        Double value=0d;
        while(num>0){

            rem=num%10;
            value=value+ Math.pow(rem,3);
            num=num/10;
        }
        if(value.equals(copy))
            System.out.println("Armstrong no");

        else System.out.println("Not armstrong");

         */
        /*
        Prime number

        int i=0,temp=0;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number- ");
    int n= sc.nextInt();
    for(i=2;i<=(n/2);i++){
		if(n%i==0)
		{
		temp=1;
		break;
		}
	}
	if(temp==1)
	    System.out.println("Number is not a prime");
	else
		System.out.println("Number is prime");
         */

        /*
        Fibonacci sequence

        int result=0,first=0,second=1;

        for( int i=0;i<15;i++){
            if(i<=1)
                result=i;

            else
            {
                result=first+second;
                first=second;
                second=result;
            }
            System.out.println(result);
        }
        Fibonacci using recursion

        for(i=0;i<n;i++) {
		    System.out.println(Main.fibonacci(i));
	    }
        ...
        ...
        ...
        static int fibonacci(int i){
	    if(i==0) return 0;
	    else if(i==1) return 1;
	    else return (fibonacci(i-1)+fibonacci(i-2));
    }
         */

        /*
        sum of digits

        int num=12345;
    int rem=0,sum=0;
    while (num!=0){
        rem=num%10;
        sum+=rem;
        num=num/10;
    }
        System.out.println("sum of digits: "+sum);
         */


        /*
        Prime factorial of a number

        int num=298,i=2;
    while (num>1){
        if(num%i==0){
            System.out.print(i+" ,");
            num=num/i;
        }
        else i++;
    }
         */

        /*
        Perfect number: 28= 1+2+4+7+14
        int sum = IntStream.range(1, number)
                .filter(i -> number % i == 0)
                .sum();


         */

        /*
        Print the prime nos in a given range

        for(int i=1;i<57;i++){
            if(primeOrNot(i)!=-1)
                System.out.println(primeOrNot(i)+" ,");
        }

    }
    static int primeOrNot(int i){
        int flag=0;
        for(int j=2;j<=i/2;j++){
            if(i%j==0)
            flag++;
        }
        if(flag==0) return i;
        else return -1;
    }
         */

        /*
        Print the number of occurrences of the max value along with its key;
        String str="saaaachit";

        Long value = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().map(x -> x.getValue()).max(Long::compareTo).get();

        String key = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> Objects.equals(x.getValue(), value)).map(x -> x.getKey()).collect(Collectors.joining());

        System.out.println("Max value is "+value+" for key: "+key);
         */

        /*
            Anagram

             String str1="race";
        char[] char1=str1.toCharArray();
        String str2="care";
        char[] char2=str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char2, char1))
            System.out.println("Anagram");
        else System.out.println("Not an anagram");
         */

        /*
        Remove space from string

        String str="ques ol";

        String collect = Arrays.stream(str.split(" ")).collect(Collectors.joining());
        System.out.println(collect);   //output: quesol
         */

        /*
        Remove the repeated characters from the string

         String str="sachit how are you bro?";
        String uniqueChars = Arrays.stream(str.split(""))
                .filter(x -> Collections.frequency(Arrays.stream(str.split("")).toList(), x) == 1)
                .filter(x -> !x.equals(" "))
                .map(x -> new StringBuilder().append(x)).collect(Collectors.joining());

        System.out.println(uniqueChars);


         */

        /*

         */
    }
    }

