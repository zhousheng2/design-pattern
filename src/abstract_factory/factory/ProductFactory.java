package abstract_factory.factory;

import abstract_factory.product.*;

/**
 * @Despriction: 生产产品的工厂
 * @Author: zhousheng
 * @CreatedTime: 2019-11-05 14:06
 * @ModifyBy:
 * @ModifyTime:
 * @ModifyDespriction:
 * @Version: V1.0.0
 */
public class ProductFactory extends AbstractFactory {

    @Override
    public Product getFactory(String choice) {
        if (choice.equalsIgnoreCase("car")) {
            return new Car();
        } else if (choice.equalsIgnoreCase("phone")) {
            return new Phone();
        } else if (choice.equalsIgnoreCase("computer")) {
            return new Computer();
        }
        return null;
    }

    @Override
    public Color getColor(String choice) {
        return null;
    }
}
