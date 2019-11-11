package abstract_factory;

import abstract_factory.factory.AbstractFactory;
import abstract_factory.factory.FactoryProducer;
import abstract_factory.product.Color;
import abstract_factory.product.Product;

public class FactoryMethodDemo {

	public static void main(String[] args) {

        AbstractFactory productFactory = FactoryProducer.getFactory("product");

        Product car = productFactory.getFactory("car");
        car.createProduct();

        Product phone = productFactory.getFactory("phone");
        phone.createProduct();

        Product computer = productFactory.getFactory("computer");
        computer.createProduct();


        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        red.fill();

        Color yellow = colorFactory.getColor("yellow");
        yellow.fill();

        Color green = colorFactory.getColor("green");
        green.fill();
    }

}
