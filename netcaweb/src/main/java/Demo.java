import com.shark.demo.inter.LoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liuqinghua on 16-8-21.
 */
public class Demo {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:Spring-config.xml"});
        context.start();

        LoginService demoService = (LoginService)context.getBean("loginService"); // 获取远程服务代理
        boolean result = demoService.login("liuqinghua", "liuqinghua"); // 执行远程方法

        System.out.println("登陆结果为 " + result); // 显示调用结果
    }
}
