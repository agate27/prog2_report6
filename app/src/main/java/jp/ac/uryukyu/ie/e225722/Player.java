package jp.ac.uryukyu.ie.e225722;
import java.util.Random;
import java.util.Scanner;

/**プレイヤーの行動に関するクラス
*　 
*/
public class Player {

    /**キーボードからの入力を受け付ける。
     * @return　 String 入力した文字列型
     */
    public String Solution(){
        //キーボードからの入力を受け付ける
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
    
    /**ランダムで0から100までの数字を一つ出します。
     * @return　int 数字
     */
    public int dice(){
        System.out.println("謎のダイスをふる");
        Random ran = new Random();
        //ランダムに数字を生成
        int number = ran.nextInt(100);
        return number;
    }

}
