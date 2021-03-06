package com.maven;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class MavenFailFastListener extends RunListener {
	@Override
	public void testFailure(Failure failure) throws Exception {
        System.out.println("MavenFailFastListener.testFailure: " + failure);
        System.exit(-1);
    }
}

