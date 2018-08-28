package org.koushik.javabrains.messenger.resources;

import org.junit.runner.RunWith;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;

@RunWith(PactRunner.class)
@Provider("messagesService")
@PactFolder("/Users/filmon/Documents/Pact/client/pacts")
public class MessageContractTest {
	
	@State("There is a message with id: 1")
	public void setup(){
		System.out.println("Change state of the app so that message with id: 1 with found");
	}
	
	@TestTarget
	public final Target target = new HttpTarget(8080);

}
