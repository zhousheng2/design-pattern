package abstract_factory.product;

/**
 * @Despriction: 红色
 * @Author: zhousheng
 * @CreatedTime: 2019-11-05 14:24
 * @ModifyBy:
 * @ModifyTime:
 * @ModifyDespriction:
 * @Version: V1.0.0
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red fill() method.");
    }
}
