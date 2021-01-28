package Thirteen;

import java.util.Random;
import java.util.Scanner;

class Unit4
{
   int size;
   String type;
}

class Pikachu extends Unit4
{
   Pikachu() 
   {
      super.size = 30;
      super.type = "전기";
   }

   void tell()
   {
      System.out.println("피카피카~");
   }
}

class Squirtle extends Unit4
{
   public Squirtle() 
   {
      // TODO Auto-generated constructor stub
      super.size = 50;
      super.type ="물";
   }
   void tell()
   {
      System.out.println("꼬북 꼬북~");
   }
}

class Bulbasaur extends Unit4
{
   public Bulbasaur() 
   {
      // TODO Auto-generated constructor stub
      super.size = 40;
      super.type ="식물";
   }
   void tell()
   {
      System.out.println("이상 이상해씨~");
   }
}

class Charmander extends Unit4
{
   public Charmander() {
      // TODO Auto-generated constructor stub
      super.size = 45;
      super.type = "불";
   }
   void tell()
   {
      System.out.println("파이 파이리~");
   }
}

class Jiwoo
{
   PocketBall[] pb = new PocketBall[3]; // 포켓볼을 세번 던짐
   int count = 0;

   public Jiwoo() 
   {
      // TODO Auto-generated constructor stub
      for(int i = 0;i<3;i++)
      {
         pb[i] = new PocketBall();
      }
   }

   String MonsterCheck()
   {
      Scanner s = new Scanner(System.in);
      String str;
      
      while(true)
      {
         System.out.print("원하는 몬스터를 입력하세요(피카츄, 꼬부기, 이상해씨, 파이리) : ");
         str=s.next();
         if(str.equals("피카츄")||str.equals("꼬부기")||str.equals("이상해씨")||str.equals("파이리")) 
         {
            System.out.println("ok 완료");
            break;
         }
         else
         {
            System.out.println("잘못된 입력입니다.");
         }
      }

      return str;
   }

   PocketBall throwPocketBall()
   {
      if(count <3)
         return pb[count++];
      else
         return null;
   }
}

class PocketBall
{
   Pikachu p = null;
   Squirtle sq = null;
   Bulbasaur bu = null;
   Charmander ch = null;

   int get;

   void randomeCheck()
   {
      Random r = new Random();

      get = r.nextInt(2);
   }
   
   void pocketMoncheck()
   {
      if(p != null)
      {
         System.out.println("피카츄는"+p.type+"포켓몬이고 크기는 "+p.size+"입니다.");
         p.tell();
      }
      if(sq != null)
      {
         System.out.println("꼬부기는"+sq.type+"포켓몬이고 크기는 "+sq.size+"입니다.");
         sq.tell();
      }
      if(bu != null)
      {
         System.out.println("이상해씨는"+bu.type+"포켓몬이고 크기는 "+bu.size+"입니다.");
         bu.tell();
      }
      if(ch != null)
      {
         System.out.println("파이리는"+ch.type+"포켓몬이고 크기는 "+ch.size+"입니다.");
         ch.tell();
      }
   }

}

public class pokemonteacher {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Pikachu p = new Pikachu();
      Squirtle sq = new Squirtle();
      Bulbasaur bu = new Bulbasaur();
      Charmander ch = new Charmander();

      Jiwoo j = new Jiwoo();

      PocketBall pb;

      System.out.println("게임시작");

      for(int i = 0;i<3;i++)
      {
         String mon = j.MonsterCheck();

         if(mon.equals("피카츄"))
         {
            pb = j.throwPocketBall();

            if(pb !=null)
            {
               pb.randomeCheck();
               if(pb.get == 1)
               {
                  pb.p = p;
                  p = null;
               }
            }
            else
            {
               System.out.println("포켓볼이 없습니다.");
            }

         }

         if(mon.equals("꼬부기"))
         {
            pb = j.throwPocketBall();

            if(pb !=null)
            {
               pb.randomeCheck();
               if(pb.get == 1)
               {
                  pb.sq = sq;
                  sq = null;
               }
            }
            else
            {
               System.out.println("포켓볼이 없습니다.");
            }
         }

         if(mon.equals("이상해씨"))
         {
            pb = j.throwPocketBall();

            if(pb !=null)
            {
               pb.randomeCheck();
               if(pb.get == 1)
               {
                  pb.bu = bu;
                  bu = null;
               }
            }
            else
            {
               System.out.println("포켓볼이 없습니다.");
            }
         }

         if(mon.equals("파이리"))
         {
            pb = j.throwPocketBall();

            if(pb !=null)
            {
               pb.randomeCheck();
               if(pb.get == 1)
               {
                  pb.ch = ch;
                  ch = null;
               }
            }
            else
            {
               System.out.println("포켓볼이 없습니다.");
            }
         }
      }

      for(int i =0;i<3;i++)
      {
         if(j.pb[i].p == null && j.pb[i].sq == null && j.pb[i].bu == null && j.pb[i].ch == null)
         {
            System.out.println("포켓몬볼이 비어 있습니다.");
         }
         else
         {
            j.pb[i].pocketMoncheck();
         }
      }
   }

}