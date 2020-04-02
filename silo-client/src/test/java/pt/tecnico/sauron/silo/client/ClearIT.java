package pt.tecnico.sauron.silo.client;

import org.junit.jupiter.api.*;
import pt.tecnico.sauron.silo.grpc.*;

import static org.junit.Assert.assertEquals;

public class ClearIT extends BaseIT {

    static SiloFrontend frontend = new SiloFrontend("localhost", 8080);


    // one-time initialization and clean-up
    @BeforeAll
    public static void oneTimeSetUp(){

    }

    @AfterAll
    public static void oneTimeTearDown() {
        ClearRequest clearRequest = ClearRequest.newBuilder().build();
        frontend.ctrlClear(clearRequest);
    }

    // initialization and clean-up for each test

    @BeforeEach
    public void setUp() {
        ClearRequest request = ClearRequest.newBuilder().build();
        frontend.ctrlClear(request);
    }

    @AfterEach
    public void tearDown() {

    }

    @Test
    public void clearTest() {
        ClearRequest request = ClearRequest.newBuilder().build();
        frontend.ctrlClear(request);
    }
}