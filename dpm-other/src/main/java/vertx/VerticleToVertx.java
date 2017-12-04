package vertx;
import io.vertx.core.Vertx;

public class VerticleToVertx {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        // vertx.deployVerticle(new MyVerticle());
        vertx.deployVerticle(MyVerticle.class.getName());
        // MyVerticle.class
        // Class.forName("MyVerticle");
    }
}