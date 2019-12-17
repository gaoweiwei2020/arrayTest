import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;


public class arrayTest {
    @Test
    public void arrayInitTest() {

        int[] array1 = new int[3];

        String[] arrayString = new String[]{"22", "33", "44", "555",};

        Integer[] arrayInteger = new Integer[5];  //这么写for each 中的序号类型不能为int


       // Integer[] arr = { 1, 2, 3, 4, 5 };  //for each 中序号能为int   这是为啥?

        int[] arr = { 1, 2, 3, 4, 5 };  //打印的是地址

        for (int numb : array1) {
            System.out.println(numb);
        }



        System.out.println("3. Java 8新增的 Lambda 表达式");
        Arrays.asList(arr).forEach(numb -> System.out.println(numb));

        Arrays.asList(arr).forEach( c -> System.out.println(c));

//        System.out.println("2. for each循环");
//        for (String numb : arrayString) {
//            System.out.println(numb);
//        }
//
//
//        for (String numb1 : arrayString) {
//            System.out.println(numb1);
//        }
//
//        for (int count : arrayInteger) {
//            System.out.println(count);
//        }
//
//        String[] arrayString2 = new String[]{"333","222","111"};
//        for(String array : arrayString2){
//            System.out.println(array);
//        }
//
//        Character[] arrayCharacter = new Character[]{'A','B','c'};
//        for(Character ccount : arrayCharacter){
//            System.out.println(ccount);
//        }

    }


    @Test
    public void testArrayCopy() {
        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8,9,10};


// 拷⻉数组 arr1 的前 3 个元素
//        Integer[] arr3 = Arrays.copyOf(arr1, 3);
//        System.out.println(Arrays.toString(arr3));

        Integer[] arr3 = Arrays.copyOf(arr1,4);
        System.out.println(Arrays.toString(arr3));
// 拷⻉数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
//        Integer[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
//        System.out.println(Arrays.toString(arr4));


        Integer[] arr4 = Arrays.copyOfRange(arr1 ,1,4);
        System.out.println(Arrays.toString(arr4));

// 拷⻉数组 arr2 的后 3 位到 arr1 到后 3 位
//        System.arraycopy(arr2, 2, arr1, 2, 3);
//        System.out.println(Arrays.toString(arr1));

        System.arraycopy(arr2 , 2 , arr1 ,2 ,3);
        System.out.println(Arrays.toString(arr1));

        System.arraycopy(arr2 , arr2.length-3 , arr1,arr1.length -4,3);
        System.out.println(Arrays.toString(arr1));
    }


    @Test
    public void testArrayFill() {
//        int arr[] = new int[10];
//        Arrays.fill(arr, 5);
//        System.out.println(Arrays.toString(arr));
//
//        Arrays.fill(arr, arr.length - 3, arr.length, 3);
//        System.out.println(Arrays.toString(arr));

        //全部填充
        int[] arr = new int[6];
        Arrays.fill(arr,7);
        System.out.println(Arrays.toString(arr));


        //从指定位置填充

        Arrays.fill(arr , arr.length -3 , arr.length,4);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testArrayssort() {
        int[] arrInt = new int[100];
        int[] arrInt2 = new int[100];
//        for (int index = 0; index < arrInt.length; index++) {
//            arrInt[index] = new Random().nextInt(100);
//        }

        for(int index = 0 ; index < arrInt.length ; index++){
            arrInt[index] = new Random().nextInt(100);
        }
        System.out.println("排序前" + Arrays.toString(arrInt));
        Arrays.sort(arrInt);
        System.out.println("排序后" + Arrays.toString(arrInt));

        System.out.println(Arrays.equals(arrInt , arrInt2));
    }
    //测试不规则数组
    @Test
    public void testArraysduowei() {
        String[][] users = new String[3][];  //不规则的多维数组 第一维必须有，不然没办法弄，本利可以理解为二维数组

        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "女";
        users[0][3] = "25";

        users[1] = new String[5];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "男";
        users[1][3] = "25";
        users[1][4] = "北京";

        System.out.println(Arrays.toString(users));

        for (String[] num: users
             ) {
            System.out.println(Arrays.toString(num));
        }


        Arrays.asList(users).forEach(num -> System.out.println(Arrays.toString(num)));
    }
}
