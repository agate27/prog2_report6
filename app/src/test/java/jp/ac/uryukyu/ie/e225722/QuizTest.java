package jp.ac.uryukyu.ie.e225722;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuizTest {
   @Test
   void judgeskTest(){
   YesNoQuiz question= new YesNoQuiz("ダビデ像の目はハートか？", "まる",10);
   String input = "まる";
   boolean judges = question.judge(input);
   assertEquals(judges, true);
   }

   @Test
   void cheakTest(){
      YesNoQuiz question= new YesNoQuiz("ダビデ像の目はハートか？", "まる",10);
      String input = "丸";
      boolean cheak = question.cheak(input);
      assertEquals(cheak, false);
   }

}
