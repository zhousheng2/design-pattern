package abstract_factory.factory;

import abstract_factory.product.*;

/**
 * @Despriction: 生产颜色的工厂
 * @Author: zhousheng
 * @CreatedTime: 2019-11-05 14:30
 * @ModifyBy:
 * @ModifyTime:
 * @ModifyDespriction:
 * @Version: V1.0.0
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Product getFactory(String choice) {
        return null;
    }

    @Override
    public Color getColor(String choice) {
        if (choice.equalsIgnoreCase("red")) {
            return new Red();
        } else if (choice.equalsIgnoreCase("yellow")) {
            return new Yellow();
        } else if (choice.equalsIgnoreCase("green")) {
            return new Green();
        }
        return null;
    }
}
