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
        Map<String, Long> frequency = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(frequency);

        String unique = frequency.entrySet().stream()
                .filter(x -> !x.equals(" "))
                .filter(x -> x.getValue() == 1)
                .map(x -> x.getKey())
                .collect(Collectors.joining());


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
        First non repeated character

       String str = "swiss";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
         */

        /*
        First repeated character

        String str = "programming";

        HashSet<String> set = new HashSet<>();
        Arrays.stream(str.split(""))
                .filter(x -> !set.add(x))
                .findFirst()
                .ifPresent(System.out::println);
         */

        /*
        Reverse every word

        String str = "the sky is blue";         //eht yks si eulb

        String reverse = Arrays.stream(str.split(" "))
                .map(x -> new StringBuilder(x).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);

         */

        /*
        Reverse the complete sentence

        String str = "Hello World";

        String reverse = new StringBuilder(str)
                .reverse()
                .toString();

        System.out.println(reverse);
         */

        /*
        Both work as both return a comparator needed in sorted()

        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

         */

        /*
        Max: list.stream().max(Integer::compare).get();
        Min: list.stream().min(Integer::compare).get();
         */

        /*
        Sort the strings according to length in ascending order
        List<String> result = list.stream().sorted(Comparator.comparing(String::length))
        .collect(Collectors.toList());
         */
        /*
        Second highest
        list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        Second smallest
        list.stream().sorted().skip(1).findFirst().get();
         */

        /*
        Sum: list.stream().mapToInt(Integer::intValue).sum();
        Average: list.stream().mapToInt(Integer::intValue).average().orElse(0);

         */
        /*
        Flatten nested list: list.stream().flatMap(Collection::stream)
         */

        /*
        Highest salary employee

        Employee emp = employees.stream()
        .max(Comparator.comparing(Employee::getSalary))
        .get();

         */

        /*
        Average salary department-wise

            Map<String, Double> avg =       //HR - 45000.0    IT - 25000.0 etc
            employees.stream()
            .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.averagingDouble(Employee::getSalary)
            ));
         */

        /*
        count employees dept wise

        Map<String, Integer> map = employeeList.stream().
                .collect(Collectors.groupingBy(Employee::getDepartment), Collectors.counting());
         */

        /*
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        partitionBy() takes a predicate and returns a Map with two rows, true or false.

        Map<Boolean, List<Integer>> collect = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect.get(true));
         */

        /*
        Find the longest string

        String str = "Hello I am sachit";

        String longest = Arrays.stream(str.split(" "))
                .max(Comparator.comparing(String::length)).get();
        System.out.println(longest);
         */

        /*
        Find the common elements between the two lists

        List<Integer> l1 =
        Arrays.asList(1,2,3,4,5);

        List<Integer> l2 =
        Arrays.asList(4,5,6,7);

        l1.stream()
        .filter(l2::contains)
        .forEach(System.out::println);
         */

        /*
        Find nth highest salary

        Employee emp =
        employees.stream()
        .distinct()
        .sorted(Comparator.comparing(Employee::getSalary)
        .reversed())
        .skip(n-1)
        .findFirst()
        .get();
         */

        /*
        Find sum of all digits of a number?

        public static int sum(int n){
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
            }
            public static void main(String[] args) {
            int i = 6786567;
            System.out.println(sum(i));
    }
         */

        /*
        Merge two unsorted list into one sorted list

        List<Integer> list1 = Arrays.asList(5, 2, 8, 1, 9);
        List<Integer> list2 = Arrays.asList(4, 2, 7, 8, 3);

        List<Integer> result = Stream.concat(list1.stream(), list2.stream())
                                     .distinct()
                                     .sorted()
                                     .collect(Collectors.toList());
         */

        /*

        How to find only duplicate elements with its count from the String ArrayList in Java8?

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> duplicate = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicate);
         */

        /*

        How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?

            Optional.ofNullable(noteLst)
                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
                .stream().filter(Objects::nonNull) //loop through each object and consider non null objects
                .map(note -> Notes::getTagName) // method reference, consider only tag name
                .forEach(System.out::println); // it will print tag names
         */

        /*
        Duplicate elements with their count

        List<String> names = Arrays.asList("Rahul", "Rohan", "Rahul", "Keshav", "Rohan");

        Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() > 1)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        System.out.println(collect);
         */

        /*
        boxed: when we want to convert a stream of primitive to a stream of corresponding wrapper object

        Array int[] arr = {10,15,8,49,25,98,98,32,15};
        Arrays.stream(arr).boxed().findFirst().ifPresent(System.out::print);
         */

        /*
        Starts with a number

        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "6ix","45ro,'7ko");

        List<String> startsWithANumber = listOfStrings.stream()
        .filter(str -> Character.isDigit(str.charAt(0))).toList();
        System.out.println(startsWithANumber);
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
         Reverse each word of a string

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
        /*
        Longest common prefix problem

        String[] str= {"geeksForGeeks","geeks","gee","geeksFor"};

        String prefix=str[0];

        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix)!=0 ){   //until prefix and str[i] both become equal, keep shortening the prefix
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
         */
        /*
        Best time to buy and sell stocks

          int[] arr={2,4,1};
          int buy=arr[0];
          int maxProfit=0;

          for (int i = 1; i < arr.length; i++) {
            if(buy>arr[i])
                buy=arr[i];

            else if (arr[i]-buy>maxProfit)
                maxProfit=arr[i]-buy;
        }
        System.out.println(maxProfit);
         */
        /*
        Reverse words in a string

        String str="the sky is blue";
        String result="";
        String[] strArr = str.split(" ");
        for (int i = strArr.length-1; i >=0; i--) {
                result=result+strArr[i]+" ";
        }
        System.out.println(result);

        ==============================================================
        Reverse words when we have multiple spaces in between words

        String str="the sky is          blue";
        str=str.replaceAll(" +"," ");

        System.out.println(str);
        String result="";
        String[] strArr = str.split(" ");
        for (int i = strArr.length-1; i >=0; i--) {
                result=result+strArr[i]+" ";
        }
        System.out.println("\n"+result.trim());
         */

        /*
        Palindrome using regex

        String str="A man, a plan, a canal: Panama";
        str=str.replaceAll("[,: ]","");
        System.out.println(str);
        StringBuilder sb= new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
        if(str.equalsIgnoreCase(reverse.toString()))
            System.out.println("Palindrome");
        else System.out.println("Not palindrome");
         */

        /*
        String str="      hello  sarfaraj ; how     are you?   ";
       String str2=str.replaceAll("[^a-zA-Z0-9]","");
       System.out.println(str2);

         */

        /*
        Read data from a file and use it in a stream to perform operations

        Path path= Paths.get("users/sachit/downloads/...../file");

        Stream<String> noteBook= Files.lines(path);
        List<String> collect= noteBook.flatMap(line->Arrays.stream(line.split(" ")).toList();

        collect.forEach(System.out::println);
         */

        /*
        Collect data in a TreeSet

        TreeSet<Employee> sortedEmployeeList= list.stream()
                            .collect(Collectors.toCollection(TreeSet::new));
         */

        /*
        Collect data in a Map

        Map<Integer, String> getNameById= list.stream()
                            .collect(Collectors.toMap(Employee::getId(), Employee::getName());
         */
        /*
        Partition data on condition: If true --> X data, if false --> Y data

        Map<Boolean, List<Employee>> partitionedData= employeeList.stream()
                            .collect(Collectors.partitionBY(emp->emp.getGender() =='M'));

        List<Employee> maleEmployee=partitionedData.get(true);
        List<Employee> femaleEmployee= partitionedData.get(false);
         */

        /*
        GroupingBy characteristic

        Map<String, List<Employee>> groupedData= employeeList.stream()
                            .collect(Collectors.groupingBy(emp->emp.getDesignation());
         */

        /*
        Joining(delimiter)

        String employeeName= employeeList.stream().map(Employee::getName()).collect(Collectors.joining(", "));
         */

        /*
        Total salary taken by all devs, testers, Leads, managers

        Map<String,Double> salaryDistribution= employeeList.stream()
                            .collect(
                             Collectors.groupingBy(Employee::getDesignation)
                            ,Collectors.summingDouble(Employee::getSalary)
                            );

         */
        /*
        Get the max salary in the respective departments

        Map<String, Optional<Employee>> maxSalaryEmployee= employeeList.stream()
                            .collect(
                             Collectors.groupingBy(Employee::getDesignation)
                            ,Collectors.maxBy(Comparator.comparing(Employee::getSalary));
         */

        /*
        Max salaries in the respective departments

        Map<String,Options<Double>> maxSalaryDeptWise= employeeList>stream()
                            .collect(
                            Collectors.groupingBy(Employee::getDesignation)
                            ,Collectors.mapping(
                                    emp->emp.getSalary(),
                                    Collectors.maxBy(Comparator.comparing(Function.identity()))));
         */

         /*
        Sort by Age, then Name

        employees.stream()
                .sorted(
                        Comparator.comparing(Employee::getAge)
                                  .thenComparing(Employee::getName)
                )
                .forEach(System.out::println);
         */

	    //Collect set data into a TreeSet
	    /*
		TreeSet<Integer> sortedSet= set.stream().collect(Collectors.toCollection(TreeSet::new));
	    */

	    //Filtering map and collecting it into a filteredMap.
	    /*
	    Map<String, String> filteredContacts= contacts.entrySet().stream(). 
		    .filter(contact-> "john".equalsIgnoreCase(contact.getValue()))
		    .collect(Collectors.toMap(c->c.getKey(), c->c.getValue()));

	    */


        //Comparator use case
        /*
         // Comparator to sort by roll number
        Comparator<Student> sortByRoll = Comparator.comparingInt(Student::getRollNumber);

        // Comparator to sort by name
        Comparator<Student> sortByName = Comparator.comparing(Student::getName);

        // Sort by roll number
        System.out.println("Sort by Roll Number:");
        students.stream().sorted(sortByRoll).forEach(System.out::println);

        // Sort by name
        System.out.println("\nSort by Name:");
        students.stream().sorted(sortByName).forEach(System.out::println);
         */



        /*
        Reverse String
        "Java is fun" to "fun is Java"


        String str= "Java is fun";
        String[] s = str.split(" ");
        Collections.reverse(Arrays.asList(s));
        System.out.println(String.join(" ",s));
         */

        /*
        Unique elements = {1,7,9}

        int[] arr1 ={1,3,5,7};
        int[] arr2= {3,5,9};

        Set<Integer> set1= Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> result= Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        for( int num : set1){
            if(result.contains(num))
                result.remove(num);
            else
                result.add(num);
        }
        System.out.println(result);
         */

        /*
        Detect a cycle in linkedList Floyd's Algorithm

                    class ListNode {
                int val; ListNode next;
                ListNode(int val) { this.val = val; }
            }

            public static boolean hasCycle(ListNode head) {
                ListNode slow = head, fast = head;
                while (fast != null && fast.next != null) {
                    slow = slow.next;
                    fast = fast.next.next;
                    if (slow == fast) return true;
                }
                return false;
}

         */

        /*
        Longest string in the list

            List<String> words = List.of("apple", "banana", "kiwi", "grapefruit");

            // accumulator = (s1, s2) -> s1.length() > s2.length() ? s1 : s2
            Optional<String> longestWord = words.stream()
                                                .reduce((s1, s2) ->
                                                    s1.length() >= s2.length() ? s1 : s2
                                                );

            if (longestWord.isPresent()) {
                // Output: Longest Word: grapefruit
                System.out.println("Longest Word: " + longestWord.get());
            }
         */

        /*
        Top 3 repeated words in a paragraph

        String str= "hello hello bhai how are you hello how you you i am good how about you";

        List<String> list = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list);
         */

        /*
        Find all pairs

         int[] arr1= {2, 4, 3, 5, 7, 8, 9};
        int sum =7;

        Set<Integer> set = new HashSet<>();

        for(int num : arr1){
            int target= sum - num;
            if(set.contains(target))
                System.out.println("Pair is: "+"("+ num +" , "+ target+ ")");
            set.add(num);
        }

         */

        /*
        Most frequent element in the list

        List<Integer> list= List.of(1,2,2,2,4);
        Optional<Long> l = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue);

        l.ifPresent(System.out::println);

         */
    }
}

