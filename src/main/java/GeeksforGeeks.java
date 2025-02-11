// Java Program to Demonstrate
// Need of try-catch Clause
class GeeksforGeeks {

    public static void main(String[] args) {

        // Taking an array of size 4
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        try {
//            int i = arr[3];
            int i = arr[4];
            System.out.println(i);
        } catch (ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae.getMessage());
        }
        // Now this statement will cause an exception


        // This statement will never execute
        // as above we caught with an exception
        finally {
            System.out.println("Wowww! Finally, I have executed");
        }
    }
}