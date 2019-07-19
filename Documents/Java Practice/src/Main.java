public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        System.out.println("Hello World....!");

        int a=10;
        System.out.println("a"+a);
        float f=76763;
        if(f==76763)
        {
            System.out.println("if block");

        }
        else
        {
            System.out.println("else block");
        }

        int age=7;

        switch(age){

            case 1:
                System.out.println("cant talk cant walk");
            case 2:
                System.out.println("can talk cant walk");
            case 3:
                System.out.println("can go to school");
            default:
                System.out.println("secondary education");
        }


        while(age==7){
            System.out.println("kids zone");
            break;
        }

        do {
            age=age+11;
            System.out.println("adding age   "+age);

            break;
        }while(age==7);
    }
}
