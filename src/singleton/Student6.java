package singleton;

/**
 *双重检查锁（完美，安全）
 * 
 * @author 怡吾宇
 *
 */
public class Student6 {

	private Student6() {
	}
	//内存可见性
	private volatile static Student6 student = null;

	// 此处考验对synchronized知识点的掌握情况
	public static Student6 getSingletonInstance() {
		if (student == null) {
			// 采用这种方式，对于对象的选择会有问题
			// JVM优化机制：先分配内存空间，再初始化
			synchronized (Student6.class) {
				if (student == null) {
					student = new Student6();
					//禁止指令重排
				}
			}
		}
		return student;
	}

}
