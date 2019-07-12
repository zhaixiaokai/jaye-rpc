package com.personal.rpc.server;

import com.personal.rpc.server.initializers.SimpleInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * @ClassName RpcServer
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 2:26 PM
 * @Version 1.0
 **/
public class RpcNettyServer {

    private static Integer DEFAULT_PORT = 8080;

    private Integer port;

    public RpcNettyServer() {

    }

    public RpcNettyServer(Integer port) {
        this.port = port;
    }

    public void bind(Integer port) {
        this.port = port;
    }

    public void serve(){

        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.DEBUG))
                    .childHandler(new SimpleInitializer());

            Integer serverPort = this.port == null ? DEFAULT_PORT : port;
            b.bind(serverPort).sync().channel().closeFuture().sync();
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}
