package per.zyf.osgi.prime;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * @Author: Finance Group
 * @Description: OSGi Hello World
 * @Date: 2019/4/3 18:09
 */
public class HelloWorld implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("Start......");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("Stop!!!");
    }
}
