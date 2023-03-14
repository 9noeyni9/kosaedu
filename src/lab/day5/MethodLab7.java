package lab.day5;


/*
 * 1. 클래스명 : MethodLab7
2. 정의해야 하는 메서드(2개)
   메서드명 : powerArray
   매개변수 타입 : int
   리턴값의 타입 : int[]
   기능 : 1부터 10까지의 값으로 구성되는 배열을 만들어 
           매개변수에 전달된 값만큼 배수로 element 값들을 변경하여 리턴한다.

   메서드명 : printArray
   매개변수 타입 : int[]
   리턴값의 타입 : void
   기능 : 매개변수를 통해서 전달된 배열을 element 값들을 다음 형식으로 출력한다. 

   x,x,x,x,x,x,x,x,x,x
   
   3. main() 메서드에서 powerArray() 를 다음과 같이 아규먼트를 전달하여 3번 호출하고 리턴된
   배열을 printArray() 에 전달하여 각 element 값을 출력한다.
   
   powerArray(2);
   powerArray(3);
   powerArray(4);

             [ 실행 결과 ]
   2,4,6,8,10,12,14,16,18,20
    3,6,9,12,15,18,21,24,27,30
   4,8,12,16,20,24,28,32,36,40   

 */

public class MethodLab7 {

   public static void main(String[] args) {
      
	   
	 int[] intArr1 = powerArray(2);
	 int[] intArr2 = powerArray(3);
	 int[] intArr3 = powerArray(4);
	 
     printArray(intArr1);
     printArray(intArr2);
     printArray(intArr3);
   }
   
   static int[] powerArray(int power) {
      
      int[] intArr = new int [10];
      
      for(int i=0;i<intArr.length;i++) {
         intArr[i] = (i+1)*power;
      }
      return intArr;
   }
   
   static void printArray(int[] intArr) {
      for(int i=0;i <intArr.length;i++) {
         System.out.print(intArr[i]);
         if(i<intArr.length-1) {
            System.out.print(',');
         }
      }
      System.out.println();
   }
}