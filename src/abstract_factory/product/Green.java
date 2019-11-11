package abstract_factory.product;

/**
 * @Despriction: 绿色
 * @Author: zhousheng
 * @CreatedTime: 2019-11-05 14:25
 * @ModifyBy:
 * @ModifyTime:
 * @ModifyDespriction:
 * @Version: V1.0.0
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green fill() method.");
    }
}
