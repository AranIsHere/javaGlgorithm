package basicPractice;
/**
 * 题目：
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个，
 * 第二天早上又将剩下的桃子吃掉一半，有多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想要再吃的时候，见只剩下一个桃子了。求第一天共摘了多少。
 * 
 * 程序分析：
 * 采取逆向思维的方法，从后往前推
 * 
 * @author tonylp
 */
public class MonkeyEatPeach {
    public static void main(String[] args){
        var peach = 0;
        for(var i = 0; i < 10;i++){
            peach =(peach + 1)* 2;
        }
        System.out.println(peach);
    }
}