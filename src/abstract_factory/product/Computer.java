package abstract_factory.product;

/**
 * @Despriction: 电脑
 * @Author: zhousheng
 * @CreatedTime: 2019-11-05 14:09
 * @ModifyBy:
 * @ModifyTime:
 * @ModifyDespriction:
 * @Version: V1.0.0
 */
public class Computer implements Product {
    @Override
    public void createProduct() {
        System.out.println("Inside Computer createProduct() method.");
    }
}
