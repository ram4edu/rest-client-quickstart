package org.acme.rest.client;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeExternalGreetingResourceIT extends ExternalGreetingResourceTest {

    // Execute the same tests but in native mode.
}