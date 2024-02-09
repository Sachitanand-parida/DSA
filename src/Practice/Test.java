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
            char array to string to list then perform operations

            char[] arr={'1','3','5','3'};
            String str= Arrays.toString(arr);
            int frequency = Collections.frequency(Arrays.stream(str.split("")).toList(), "3");
            System.out.println(frequency);
         */

        /*
            Convert Integer[] to ArrayList<Integer> type

            Integer[] arr1={1,2,3,4,5};
            Integer[] arr2={2,3,1,0,5};

            ArrayList<Integer> list1= new ArrayList<>(List.of(arr1));
            ArrayList<Integer> list2= new ArrayList<>(List.of(arr2));
         */

        /*
            Rotate the array by kth place (right rotation)

            int[] arr={1,2,3,4,5};
            // [4,5,1,2,3]
            int k=2;
            k=k%arr.length;

            reverse(arr,0, arr.length-1);
            reverse(arr,0,k-1);                 // reverse(arr,0,k); for left rotation
            reverse(arr,k,arr.length-1);        //reverse(arr,k+1,arr.length-1);

            System.out.println(Arrays.toString(arr));

    }
            static void reverse(int[] arr, int start, int end){
            while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
         */

        /*
        Find pairs in array with a given sum
        int[] arr={1,7,3,5,8,2,4,6,9};

        Arrays.sort(arr); // 1 2 3 4 5 6 7 8 9
        int start=0;
        int end= arr.length-1;
        int sum=0;
        while(start<end){
            if(arr[start]+arr[end]>sum)
                end--;
            else if(arr[start]+arr[end]<sum)
                start++;
            else if(arr[start]+arr[end]==sum)
            {
                System.out.println("pair ("+arr[start]+","+arr[end]+")");
                start++;end--;
            }
            else System.out.println("Not a valid combo");

         */

        /*
        Remove duplicate elements


        Integer[] arr={11,1,1,23,2,2,2,56,4,66,77,66,90};
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(arr));

        HashSet<Integer> hs= new HashSet<>();
        List<Integer> uniqueList = list.stream().filter(x -> hs.add(x)).toList();
        System.out.println(uniqueList);
         */

        /*
        One string is a rotated version of another string

        String str1="abc";// abc   bc   abcbc
        String str2="bca";
        String str3=str1+str1;
        if(str3.contains(str2))
        System.out.println("Rotated");
        else System.out.println("Not rotated");
         */

        /*
         Intersection of two arrays

         Integer[] arr1={1,2,3,4,5};
        Integer[] arr2={2,34,4,45,66};

        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(arr1));
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(arr2));

        List<Integer> result = list1.stream().filter(list2::contains).toList();
        System.out.println(result);
         */


        /*
         Reverse each work of a string

         String str="Java Concept Of The Day";

         String revString = Arrays.stream(str.split(" "))
                .map(x -> new StringBuilder(x).reverse()).collect(Collectors.joining(" "));

         System.out.println(revString);
         */

        /*
            Digit or not
            char ch = inputString.charAt(i);
            if (Character.isDigit(ch))
         */


        /*
            Deep to String is used to print dimensional array

            String[][] twoDArray = new String[][] {
                {"ONE", "TWO", "THREE", "FOUR"},
                {"FIVE", "SIX", "SEVEN"},
                {"EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE"}
                };
                System.out.println(Arrays.deepToString(twoDArray));
         */

        /*
                Converting ArrayList to Array

                ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));
                Object[] array = list.toArray();
                System.out.println(Arrays.toString(array));
         */

        /*
                More on ArrayList

                //Retrieving a SubList
                 List<Integer> subList = list.subList(1, 4);

                 //Removing all elements of the list
                    list.clear();



         */

        /*
        Traversing LinkedList in reverse order

        //Getting the Iterator object using descendingIterator() method

        Iterator<String> it = list.descendingIterator();

        //printing the elements of list in reverse order

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
         */

        /*
        LinkedList as queue: queue.offer(10)   queue.poll();
        LinkedList as stack: stack.push(10)    stack.pop();
         */


        /*
        PriorityQueue is naturally polled in ascending order

        //MyComparator Class

        class MyComparator implements Comparator<Employee>
        {
         @Override
        public int compare(Employee e1, Employee e2)
        {
        return e1.salary - e2.salary;
        }

        MyComparator comparator = new MyComparator();
        PriorityQueue<Employee> pQueue = new PriorityQueue<Employee>(7, comparator);
        pQueue.offer(new Employee("AAA", 15000));

        pQueue.offer(new Employee("BBB", 12000));

        pQueue.offer(new Employee("CCC", 7500));

        pQueue.offer(new Employee("DDD", 17500));

        pQueue.offer(new Employee("EEE", 21500));

        pQueue.offer(new Employee("FFF", 29000));

        pQueue.offer(new Employee("GGG", 14300));

        System.out.println(pQueue.poll());       //Output --> CCC : 7500

        System.out.println(pQueue.poll());       //Output --> BBB : 12000

        System.out.println(pQueue.poll());       //Output --> GGG : 14300

        System.out.println(pQueue.poll());       //Output --> AAA : 15000

        System.out.println(pQueue.poll());       //Output --> DDD : 17500

        System.out.println(pQueue.poll());       //Output --> EEE : 21500

        System.out.println(pQueue.poll());       //Output --> FFF : 29000
         */


        /*
            Synchronized ArrayList, HasSet, Hashmap

             *****List<String> synchronizedList = Collections.synchronizedList(list);

        //you must use synchronized block while iterating over synchronizedList

        synchronized (synchronizedList)
        {
            Iterator<String> it = synchronizedList.iterator();

            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }


        ****
        //Getting synchronized set

        Set<String> synchronizedSet = Collections.synchronizedSet(set);

        //you must use synchronized block while iterating over synchronizedSet

        synchronized (synchronizedSet)
        {
            Iterator<String> it = synchronizedSet.iterator();

            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }

        **************
        //Getting synchronized map

        Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);

        Set<String> keySet = synchronizedMap.keySet();

        System.out.println("Keys.............");

        //While iterating over synchronizedMap, you must use synchronized block.

        synchronized (synchronizedMap)
        {
            Iterator<String> it = keySet.iterator();

            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }
         */

        /*
        Convert a list to unmodifiable list

        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,45));

        List<Integer> ul=  Collections.unmodifiableList(list);
        System.out.println(ul);
         */

        /*
        Sort by key in Hashmap

        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);

        studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

         */

        /*
            Bubble sort algorithm

                private static int[] bubblesortArr(int[] arr) {

                int temp=0;
                for (int i = 0; i < arr.length-1; i++) {
                    for (int j = 0; j < arr.length-1-i; j++) {
                        if(arr[j]>arr[j+1]){
                                temp=arr[j];
                                arr[j]=arr[j+1];
                                arr[j+1]=temp;
                    }

                }
            }
        return arr;
    }
         */
    }
}

