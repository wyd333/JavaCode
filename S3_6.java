import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-29
 * Time: 17:42
 */

/*
6、设计一个电视机类
属性包括商品编号、开关状态、音量、频道等，
同时设计一些方法对电视机的状态进行控制。

例如，方法应包括开/关电视机、更换频道、提高/减小音量等。

要求商品编号自动生成（可以考虑为电视机类设置一个管理商品编号的静态成员变量，或者专门设置一个编号管理类）。

注意：有些成员变量需要定义为静态的（static），控制和操纵静态成员变量的方法应是静态的（static）。
*/
public class S3_6 {

    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();
        Television tv4 = new Television();

        //打开tv1、tv2、tv3
        tv1.tvSwitch();
        tv2.tvSwitch();
        tv3.tvSwitch();
        System.out.println("电视机tv1、tv2、tv3已打开！");

        //尝试将tv1的音量上调(true)、tv2的音量下调(false)
        System.out.println("==========尝试将tv1的音量上调(true)、tv2的音量下调(false)==========");
        tv1.adjustVolume(true);
        tv2.adjustVolume(false);

        //尝试将tv3的频道换成50、将tv1的频道换成100
        System.out.println("==========尝试将tv3的频道换成50、将tv1的频道换成100==========");
        tv3.changeChannel(50);
        tv1.changeChannel(100);
        //尝试将tv3向下调台、将tv1向上调台
        System.out.println("==========尝试将tv3向下调台、将tv1向上调台==========");
        tv3.changeChannel(false);
        tv1.changeChannel(true);

        //获取tv2当前的频道和音量
        System.out.println("==========获取tv2当前的频道和音量==========");
        System.out.println(tv2.getVolume());
        System.out.println(tv2.getChannel());

        //对未开机的tv4进行操作时：
        System.out.println("==========对未开机的tv4进行操作==========");
        tv4.changeChannel(50);
        tv4.adjustVolume(true);

        //输出各个电视机的信息
        System.out.println("==========输出各个电视机的信息==========");
        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3.toString());
        System.out.println(tv4.toString());
    }
}
class Television{
    private static int num; //管理商品编号的静态成员变量
    private String itemNO; //商品编号
    private boolean status; //开关状态
    private int volume; //音量
    private int channel;    //频道

    public int getVolume() {
        if (this.status) {
            return volume;
        }else {
            return -1;
        }
    }

    public boolean isStatus() {
        return status;
    }

    public int getChannel() {
        if (this.status) {
            return this.channel;
        }else {
            return -1;
        }
    }


    //构造方法，自动生成产品编号
    public Television() {
        Television.num++;
        this.itemNO = "tv000" + Television.num;
    }
    //开关电视机
    public boolean tvSwitch() {
        if(!this.status) {
            this.status = true;
        } else {
            this.status = false;
        }
        return this.status;
    }
    //上调或下调频道
    public void changeChannel(boolean change){
        if(change) {
            this.channel++;
            if(channel > 100) {
                System.out.println("已达最大频道，无法增加！");
                this.channel--;
            }
        }else{
            this.channel--;
            if(channel < 0) {
                System.out.println("已达最小频道，无法下降！");
                this.channel++;
            }
        }
        System.out.println(this.itemNO + "当前频道为：TV" + this.channel);
    }
    //重载：更换为指定频道
    public void changeChannel(int newChannel) {
        //判断电视机是否开启，若未开启，则直接返回
        if(!this.status) {
            System.out.println("电视机未开机！无法操作！");
            return;
        }

        if(newChannel < 0 || newChannel > 100) {
            System.out.println("该频道不存在！");
        } else {
            this.channel = newChannel;
        }
        System.out.println(this.itemNO + "当前频道为：TV" + this.channel);
    }
    //增减音量
    public void adjustVolume(boolean adjust) {
        //判断电视机是否开启，若未开启，则直接返回
        if(!this.status) {
            System.out.println("电视机未开机！无法操作！");
            return;
        }
        if(adjust){
            this.volume++;
            if(this.volume > 100) {
                System.out.println("已达音量最大值！无法提高音量！");
                this.volume--;
            }
        } else {
            this.volume--;
            if(this.volume < 0) {
                System.out.println("已达音量最小值！无法降低音量！");
                this.volume++;
            }
        }
        System.out.println(this.itemNO + "当前音量为：" + this.volume);
    }

    @Override
    public String toString() {
        return "Television{" +
                "itemNO='" + itemNO + '\'' +
                ", status=" + status +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
