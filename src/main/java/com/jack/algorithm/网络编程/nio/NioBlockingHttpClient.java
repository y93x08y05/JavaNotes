package com.jack.algorithm.网络编程.nio;

import com.jack.algorithm.网络编程.socket.HttpUtil;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

/**
 * @Author: Jack
 * @Date: 2018/9/22 15:36
 */
public class NioBlockingHttpClient {
    private SocketChannel socketChannel;
    private String host;
    public static void main(String[] args) throws IOException {
        for (String host:HttpUtil.HOSTS) {
            NioBlockingHttpClient client=new NioBlockingHttpClient(host,HttpUtil.PORT);
            client.request();
        }
    }
    public NioBlockingHttpClient(String host,int port) throws IOException {
        this.host=host;
        socketChannel=SocketChannel.open();
        socketChannel.socket().setSoTimeout(5000);
        SocketAddress remote=new InetSocketAddress(this.host,port);
        this.socketChannel.connect(remote);
    }
    public void request() throws IOException {
        PrintWriter pw=getWriter(socketChannel.socket());
        BufferedReader br=getReader(socketChannel.socket());
        pw.write(HttpUtil.compositeRequest(host));
        pw.flush();
        String msg;
        while ((msg=br.readLine())!=null) {
            System.out.println(msg);
        }
    }
    private PrintWriter getWriter(Socket socket) throws IOException {
        OutputStream out=socket.getOutputStream();
        return new PrintWriter(out);
    }
    private BufferedReader getReader(Socket socket) throws IOException {
        InputStream in=socket.getInputStream();
        return new BufferedReader(new InputStreamReader(in));
    }
}