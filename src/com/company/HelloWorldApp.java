package com.company;



class HelloWorldApp {

    public static void main(String[] args)
    {
        int sum=0;
        int[] arr = new int[5];
        for (int i=0;i<5;i++) {
            arr[i]=i;
        }

        for (int i=0;i<5;i++) {
            if (i<4)
                System.out.print(arr[i]+" ");
            else
                System.out.println(arr[i]);
        }

        for (int i=0;i<5;i++) {
            sum+=arr[i];
        }

        System.out.println(sum);
        sum=0;

        int i=0;
        while(i<5)
        {
            sum+=arr[i];
            i++;
        }

        System.out.println(sum);
        sum=0;

        i=0;
        do
        {
            sum+=arr[i];
            i++;
        }
        while (i<5);

        System.out.println(sum);

    }
}