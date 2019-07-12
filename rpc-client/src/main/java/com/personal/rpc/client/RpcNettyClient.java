package com.personal.rpc.client;

import com.personal.rpc.client.executor.ClientTaskExecutor;
import com.personal.rpc.client.initializers.SimpleClientInitilizer;
import com.personal.rpc.client.util.CallUtil;
import com.personal.rpc.constant.Constant;
import com.personal.rpc.invocation.RpcInvocation;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * @ClassName RpcClient
 * @Author xiaokai
 * @Description
 * @Date 2019/7/10 3:19 PM
 * @Version 1.0
 **/
public class RpcNettyClient {
    private final static Logger logger = LoggerFactory.getLogger(RpcNettyClient.class);
    private String ip = "127.0.0.1";
    private Integer port = 8080;

    public RpcNettyClient() {

    }

    public RpcNettyClient(String ip, Integer port) {
        if (!Pattern.compile(Constant.REG_IP).matcher(ip).matches()) {
            throw new IllegalArgumentException("ip");
        }
        if (port == null || port < 0) {
            throw new IllegalArgumentException("port");
        }
        this.ip = ip;
        this.port = port;
    }

    public void doClient() {

        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new SimpleClientInitilizer());

            // Start the connection attempt.
            Channel ch = b.connect(this.ip, this.port).sync().channel();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            ClientTaskExecutor.doTask(new Runnable() {
                @Override
                public void run() {
                    boolean flag = true;
                    while (flag) {
                        if (CallUtil.getQuereSize() > 0) {
                            RpcInvocation invocation = CallUtil.getTask();
                            logger.info("send invoaction : {}", invocation);

                            ch.write(invocation+"$_$");
                            ch.flush();
                        }
                    }
                    try {
                        ch.closeFuture().sync();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        group.shutdownGracefully();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}

