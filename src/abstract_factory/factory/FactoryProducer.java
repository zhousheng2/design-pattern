package abstract_factory.factory;

/**
 * @Despriction: 负责生产各种工厂
 * @Author: zhousheng
 * @CreatedTime: 2019-11-05 14:34
 * @ModifyBy:
 * @ModifyTime:
 * @ModifyDespriction:
 * @Version: V1.0.0
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("product")) {
            return new ProductFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
