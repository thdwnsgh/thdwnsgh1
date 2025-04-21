package person;

public class Main {

   public static void main(String[] args) {

      System.out.println(" ====== Person ====== ");
      
      Person x = new Person();
      x.name = "임꺽정";
      x.age = 24;
      x.blood = 'a';
      x.study = true;
      // 객체가 가진 변수 다뤄보기
      
      System.out.println(x.name);
     
      System.out.println(x.age);
    
      System.out.println(x.blood);
      
      System.out.println(x.study);
      
      // 객체가 가진 메서드 다뤄보기
      x.sayHi();
      x.eat();
      
      
   }//main

}//class
