import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
//       int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//       int[] array = {5,4,3,2,1,6,7,8,9,10};

       int[] array = {10,9,8,7,6,5,4,3,2,1};

       int counter = 0;
       System.out.println("Before: ");
       System.out.println(Arrays.toString(array));

            /*********TASK.1.A.*********/
//       for(int j = 0; j < array.length - 1; j++)
//       {
//           if (array[j] > array[j + 1])
//           {
//               int greater = array[j];
//               array[j] = array[j+1];
//               array[j + 1] = greater;
//           }
//       }

           /*********TASK.1.B.*********/
//       for(int i = 0; i < array.length - 1; i++)
//       {
//           counter++;
//           for(int j = 0; j < array.length - 1; j++)
//           {
//               counter++;
//               if (array[j] > array[j+1])
//               {
//                   counter++;
//                   int greater = array[j];
//                   array[j] = array[j + 1];
//                   array[j + 1] = greater;
//               }
//           }
//           System.out.println(Arrays.toString(array));
//       }


           /*********TASK.1.C.*********/
//            for(int i = 1; i < array.length; i++)
//            {
//                counter++;
//                for(int j = 0; j < array.length - i; j++);
//                {
//                    counter++;
//                    if (array[j] > array[j + 1])
//                    {
//                        counter++;
//                        int greater = array[j];
//                        array[j] = array[j + 1];
//                        array[j + 1] = greater;
//                    }
//                }
//            }

            /*********TASK.1.D.ver1*********/
//            boolean toSort = true;
//
//            for(int i = 1; i < array.length && toSort; i++)
//            {
//                toSort = false;
//                counter++;
//                for(int j = 0; j < array.length - i; j++)
//                {
//                    counter++;
//                    if(array[j] > array[j + 1])
//                    {
//                        counter++;
//                        int greater = array[j];
//                        array[j] = array[j+1];
//                        array[j + 1] = greater;
//                        toSort = true;
//                    }
//                }
//            }

            /*********TASK.1.D.ver2*********/
            boolean toSort;

            for(int i = 1; i < array.length; i++)
            {
                counter++;
                toSort = false;
                for(int j = 0; j < array.length - i; j++)
                {
                    counter++;
                    if (array[j] > array[j + 1])
                    {
                        counter++;
                        int greater = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = greater;

                        toSort = true;
                    }
                }
                if (!toSort) break;
            }
       System.out.println("After: ");
       System.out.println(Arrays.toString(array));
       System.out.println("Number of actions: " + counter);
    }
}