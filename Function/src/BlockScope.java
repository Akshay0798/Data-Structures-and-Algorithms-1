public class BlockScope {
    public static void main(String[] args) {
        int a =10;
        int b =20;

        {
            a=99;                  //reassign the original ref variable to some other value
            System.out.println(a);
                                // int a = 99 ..already initialized outside the block in the same method...
                                //hence can not initialize again
            //int c=60;
                                //value initialized(c=60) in this block,will remain in the block
        }
            // System.out.println(c); //can not use outside the block
        System.out.println(a);
    }
    static void randon(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);

    }

    //anything can initilised outside the block can be use initilised inside the block
    //anything can initilised inside the block can not be used outside the block
}
