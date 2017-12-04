package vertx;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;


public class VertxTest01 {
    public static void main(final String... args) throws Exception {
        System.setProperty("vertx.logger-delegate-factory-class-name", "io.vertx.core.logging.SLF4JLogDelegateFactory");
        VertxTest01 vertxTest01 = new VertxTest01();
        vertxTest01.deployVerticle();
    }

    private void deployVerticle() {

    };

    private void deployVerticle(Vertx vertx, Class verticleClass, DeploymentOptions deploymentOptions) {

    }
}
