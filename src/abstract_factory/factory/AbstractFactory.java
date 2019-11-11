package abstract_factory.factory;

import abstract_factory.product.Color;
import abstract_factory.product.Product;

/**
 * @Despriction: 提供各种产品的工厂
 * @Author: zhousheng
 * @CreatedTime: 2019-11-05 14:04
 * @ModifyBy:
 * @ModifyTime:
 * @ModifyDespriction:
 * @Version: V1.0.0
 */
public abstract class AbstractFactory {

    public abstract Product getFactory(String choice);

    public abstract Color getColor (String choice);


}
