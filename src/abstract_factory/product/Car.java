package abstract_factory.product;

/**
 * @Despriction: 汽车
 * @Author: zhousheng
 * @CreatedTime: 2019-11-05 14:08
 * @ModifyBy:
 * @ModifyTime:
 * @ModifyDespriction:
 * @Version: V1.0.0
 */
public class Car implements Product {
    @Override
    public void createProduct() {
        System.out.println("Inside Car createProduct() method.");
    }
}
