package com.factory.client;

import com.factory.Application;
import com.factory.NorthAmericaCarFactory;

public class Client {
	public static void main(String[] args) {
        Application app=new Application(new NorthAmericaCarFactory());
        app.initiate();
	}
}
