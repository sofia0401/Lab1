package task4;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int[] arr = new int[5];
        for (int i=0;i<5;i++) {
            arr[i]=((int)(Math.random()*100));
        }

        for (int i=0;i<5;i++) {
            if (i<4)
                System.out.print(arr[i]+" ");
            else
                System.out.println(arr[i]);
        }

        for (int i=0;i<5;i++)
        {

            for (int j=0;j<4;j++)
            {
                if (arr[j]>arr[j+1])
                {

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i=0;i<5;i++) {
            if (i<4)
                System.out.print(arr[i]+" ");
            else
                System.out.println(arr[i]);
        }

        Random rndm= new Random();

        int[] mass= new int[5];
        for (int i=0;i<5;i++) {
            mass[i]=(rndm.nextInt(100));
        }

        for (int i=0;i<5;i++) {
            if (i<4)
                System.out.print(mass[i]+" ");
            else
                System.out.println(mass[i]);
        }

        for (int i=0;i<5;i++)
        {

            for (int j=0;j<4;j++)
            {
                if (mass[j]>mass[j+1])
                {

                    int temp=mass[j];
                    mass[j]=mass[j+1];
                    mass[j+1]=temp;
                }
            }
        }

        for (int i=0;i<5;i++) {
            if (i<4)
                System.out.print(mass[i]+" ");
            else
                System.out.println(mass[i]);
        }
    }


}


