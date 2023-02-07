package jp.ac.uryukyu.ie.e225722;
/**生命体に関するクラス
*　  String name //生命体の名前
*   int madness //生命体の狂気度
*   boolean dead //生命体の危険度
*/
public class Girl {
    private String name;
    private int madness;
    private boolean dangerous;


    /**コンストラクタ、名前、狂気度を設定する。
     * @param name　名前
     * @param madness　狂気度
     */
    public Girl (String name, int madness){
        this.name = name;
        this.madness = madness;
        this.dangerous = false;
    }


    /**
     * 生命体のステータスを表示するメソッド
     */
    public void showStatus() {
        System.out.println("▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲");
        System.out.println("--今日のステータスを表示します--");
        System.out.printf("%s:狂気度％ %d\n", name, madness);
        System.out.println("▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲▽▲");
    }


    /**狂気度を下げるメソッド
     * クイズに正解することによって、狂気度からhappinessを引く。
     * @param happiness　クイズによる幸福度
     */
    public void decrease(int happiness) {
        //現在の狂気度からhappinessを引く。
        this.madness -= happiness;
        System.out.print("狂気度が" + happiness + "％減少した。");
    }
    

    /**狂気度を上げるメソッド
     * クイズを間違えると現在の狂気度にmadnessを足して計算する。
     * @param madness　狂気度
     */
    public void increase(int madness){
         //引数が正しくない場合。
        if(madness < 0) {
            throw new IllegalArgumentException("girl.increase:引数madnessは正の数である必要があります");
        }
        //現在の狂気度にmadnessを足して計算する
        this.madness += madness;
        System.out.print("狂気度が" + madness + "％増加した。");
    }


    /**クイズの判定結果から、起こすアクションについてのメソッド
     * GameMasterから得られる判定、狂気度、幸福度を用いて計算します。
     * 狂気度が100以上の場合は
     * @param result　クイズの判定結果
     * @param madness　得られる狂気度
     * @param happiness　得られる幸福
     */
    //GameMasterからクイズの判定、得られる狂気度、得られる幸福度を聞く
    public void observation(boolean result,int madness, int happiness){
        //クイズに正解した場合。
        if(result){
            System.out.println("----" + name + "に食べ物を与えたᗦ↞◃ ----");
            System.out.println("");
            System.out.println("(((╭( ˇωˇ)╯)))ﾙﾝﾙﾝ");
            System.out.println("");
            System.out.println("ŧ‹”ŧ‹”( ‘ч’ )ŧ‹”ŧ‹”");
            System.out.println("");
            //happinessを使って狂気度を下げる
            decrease(happiness);

        //クイズが不正解だった場合。
        }else{
            System.out.println("---" + name + "に何もあげることができなかった---");
            //madnessを使って狂気度を上げる
            increase(madness);
            System.out.println(": (っ`ω´c):ﾑﾑﾑﾑﾑｩ");

            //クイズに不正解の場合は狂気度が100以上ではないかチェックする
            if(this.madness >=100 ){
                //100以上の場合dangerousをtrueにする。
                dangerous = true;
                System.out.println("狂気度が100％を超えました。");
            }
        }
    }


    /**ゲームのエンディングを返します。
     * 狂気度madnessによって分岐します
     */
    public void endStory(){
        if(madness >=100){
            System.out.println("お腹の空いた" + name + "に食べられた。Σ(ﾟ∀´(ω･´　)ｶﾞﾌﾞｶﾞﾌﾞｶﾞﾌﾞｶﾞﾌﾞｶﾞﾌﾞ");
            System.out.println("----Game over----");
        }else if (madness >= 90 ){
            System.out.println("");
            System.out.println("---解放された。体の損傷がひどすぎて動けない---");
        }else if(madness >= 60 ){
            System.out.println( "---両腕を失ったが、部屋から出ることができた---");
        }else{
            System.out.println( "---無事に部屋から出ることができた！---");
        }
    }

    /**
     * 生命体の名前を取得します。
     * @return 生命体の名前
     */
    public String getName() {
        return name;
    }


    /**生命大の狂気度を取得します。
     * @return　狂気度
     */
    public int getMadness() {
        return madness;
    }


    /**生命体の危険度を取得します。
     * @return　危険度
     */
    public boolean isDead() {
        return dangerous;
    }
}

