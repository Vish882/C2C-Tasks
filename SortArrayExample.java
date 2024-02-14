public class SortArrayExample   
{   
public static void main(String[] args)   
{   
Integer[]array={23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};    
Arrays.Sort(array, Collections.reverseOrder());   
System.out.println("Array elements in descending order: " +Arrays.toString(array));   
}   
}  