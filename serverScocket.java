




public class serverScocket {

    public static <E> void printArray(E[] inputArray){
        for(E ele:inputArray){
            System.out.println(ele);

        }
    }

public static void main(String[] args) {
    Integer [] intArray={1,5,3,6,5,2};
    Character[] charArray ={'h','e','l','l','o'};
    printArray(intArray);
    printArray(charArray);
    
}

}
    