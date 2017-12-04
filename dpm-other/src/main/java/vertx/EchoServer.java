package vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class EchoServer extends AbstractVerticle {
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "text/plain")
                    .end("Hello from Vert.x!123321");
        }).listen(8080);
    }

    public static void main(String[] args) {
        Vertx.vertx().deployVerticle(new EchoServer());
    }
}

